#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

// Variaveis globais

int quantidadeJogadores, quantidadePremios, linha, coluna, intervalo, tamanho;
int verificadorDeConfiguracaoCartela = 0, posicaoJogador = 1;
char texto_str[20];
FILE *ArquivoJogador;
FILE *ArquivoPremio;
FILE *ArquivoResultado;
FILE *ArquivoHistorico;

// Structs
typedef struct
{
  char *nome;
  char *numeroTelefone;
  char *cpf;
  int cartela[10][10];
  int quantidadeDeAcertos;
  int colocacao;
  int quantidadeFaltante;
} Jogador;
Jogador jogador[100];

typedef struct
{
  char *nomePremio;
  float valorAssociado;
  int posicaoPremio;
} Premio;
Premio premio[100];

#include "prototipos.h"
#include "exibicao.h"
#include "arquivos.h"
#include "rotinas.h"
#include "menus.h"
#include "tratamento.h"

int main()
{

  int escolhaMenu, escolhaMenuArquivo;

  system("cls");

menu:

  menuPrincipal();

  printf("\nEscolha: ");
  scanf("%d", &escolhaMenu);
  system("cls");

  opcoesMenuPrincipal();

  if (escolhaMenu != 0)
  {
    goto menu;
  }

  return 0;
}

// Seção jogadores

void cadastrarParticipantes()
{
  if (verificadorDeConfiguracaoCartela == 1)
  {
    inserirQuantidadeJogadores();

    for (int i = 0; i < quantidadeJogadores; i++)
    {
      jogador[i] = inserirInformacoesJogador(i);
      fflush(stdin);
      gerarArquivoDoJogador(quantidadeJogadores, i, jogador[i]);
    }
  }
  else
  {
    telaCadastrarParticipantes();

    printf("\nImpossivel cadastrar participantes antes de definir as configuracoes das cartelas.\n\n");
    limpaTela();
  }
}

void inserirQuantidadeJogadores()
{
  do
  {
    telaCadastrarParticipantes();

    printf("\nInsira a quantidade de jogadores: ");
    fflush(stdin);
    scanf("%d", &quantidadeJogadores);

    trataQuantidadeJogadores();
  } while (quantidadeJogadores < 1);
}

char *entradaNomeJogador(int numJogador)
{
  int condNome = 0;
  char *nome = (char *)malloc(sizeof *nome * 100);

  do
  {
    printf("\nDigite o nome do %do jogador: ", numJogador + 1);
    fgets(nome, 100, stdin);
    retirarEnter(nome);

    trataNomeJogador(nome, condNome);
  } while (condNome != 1);

  return nome;
}

char *entradaCPFJogador()
{
  char *cpf = (char *)malloc(sizeof *cpf * 12);
  int icpf[12];
  int condCPF = 0;

  do
  {
    printf("\nInsira o CPF do Jogador: ");
    fgets(cpf, 12, stdin);
    retirarEnter(cpf);

    trataCPF(condCPF, icpf, cpf);
  } while (condCPF != 1);

  return cpf;
}

char *entradaNumeroTelJogador()
{
  int condNumTel = 0;
  char *numTel = (char *)malloc(sizeof *numTel * 100);
  ;

  do
  {
    printf("\nDigite o numero de telefone do jogador: ");
    fgets(numTel, 12, stdin);
    retirarEnter(numTel);

    trataNumTel(numTel, condNumTel);
  } while (condNumTel != 1);

  return numTel;
}

Jogador inserirInformacoesJogador(int i)
{
  Jogador jogador;
  jogador.quantidadeDeAcertos = 0;
  jogador.colocacao = 0;

  telaCadastrarParticipantes();
  fflush(stdin);
  jogador.nome = entradaNomeJogador(i);
  pause();

  telaCadastrarParticipantes();
  fflush(stdin);
  jogador.numeroTelefone = entradaNumeroTelJogador();
  pause();

  telaCadastrarParticipantes();
  fflush(stdin);
  jogador.cpf = entradaCPFJogador();
  pause();

  telaCadastrarParticipantes();
  jogador = gerarCartela(jogador);

  return jogador;
}

// Seção Prêmios

void inserirQuantidadeDePremios(int qtdJogadores)
{
  if (qtdJogadores <= 0)
  {
    printf("\nCadastre o numero de jogadores primeiro.\n\n");
    limpaTela();
  }
  else
  {
    do
    {
      telaCadastrarPremios();

      printf("\nDigite a quantidade de premios que serao cadastrados: ");
      fflush(stdin);
      scanf("%d", &quantidadePremios);

      trataQuantidadePremios(qtdJogadores);

      limpaTela();
    } while (quantidadePremios > qtdJogadores || quantidadePremios < 1);
  }
}

char *inserirNomeDoPremio(int numPremio)
{
  char *nomePremio = (char *)malloc(sizeof *nomePremio * 100);

  printf("\nDigite o nome do premio do %do colocado: ", numPremio + 1);
  fflush(stdin);
  fgets(nomePremio, 100, stdin);
  retirarEnter(nomePremio);

  return nomePremio;
}

float inserirValorDoPremio()
{
  float valor;

  do
  {
    telaCadastrarPremios();

    printf("\nDigite o valor do premio: R$");
    fflush(stdin);
    scanf("%f", &valor);

    trataValorPremio(valor);
  } while (valor < 1);

  return valor;
}

Premio inserirInformacoesPremio(int i, int quantidadePremios)
{
  Premio premio;
  fflush(stdin);
  premio.nomePremio = inserirNomeDoPremio(i);
  fflush(stdin);
  premio.posicaoPremio = i;
  premio.valorAssociado = inserirValorDoPremio();
  gerarArquivoPremio(quantidadePremios, i, premio);

  return premio;
}

// Seção Cartela

void configurarCartela()
{
  do
  {
    telaConfigCartela();

    printf("\nDigite a quantidade de linhas: ");
    scanf("%d", &linha);

    printf("\nDigite a quantidade de colunas: ");
    scanf("%d", &coluna);

    trataConfigCartela1();
  } while (linha < 1 || coluna < 1);

  int auxTamanho = linha * coluna;

  do
  {
    telaConfigCartela();
    printf("\nInsira o numero limite dos numeros a serem gerados: ");
    scanf("%d", &intervalo);

    trataConfigCartela2(auxTamanho);
    printf("\n\n");
    limpaTela();
  } while (auxTamanho >= intervalo);
}

Jogador gerarCartela(Jogador jogador)
{
  tamanho = linha * coluna;
  int *numerosUsados = (int *)malloc(tamanho * sizeof(int));
  int contadorNumerosUsados, ultimoNumeroUsado;

  contadorNumerosUsados = 0;
  for (int j = 0; j < linha; j++)
  {
    for (int k = 0; k < coluna; k++)
    {
      ultimoNumeroUsado = contadorNumerosUsados;
      jogador.cartela[j][k] = 1 + rand() % intervalo;
      numerosUsados[contadorNumerosUsados] = jogador.cartela[j][k];
      for (int l = 0; l < ultimoNumeroUsado; l++)
      {
        if (jogador.cartela[j][k] == numerosUsados[l])
        {
          k--;
          contadorNumerosUsados--;
          break;
        }
      }
      contadorNumerosUsados++;
    }
  }
  exibirCartela(jogador);
  return jogador;
}

// Seção Bingo
void horaDeBingar()
{
  int numPedra = 0, pedra, pedrasSorteadas[intervalo];

  ArquivoHistorico = fopen("arquivoHistorico.txt", "w");
  ArquivoResultado = fopen("arquivoResultado.txt", "w");

  realizarSorteio(numPedra, pedra, pedrasSorteadas);

  definirColocacaoJogador();

  gerarArquivoResultado(pedrasSorteadas);

  fclose(ArquivoHistorico);
  fclose(ArquivoResultado);
}

void definirColocacaoJogador()
{
  while (posicaoJogador <= quantidadeJogadores)
  {
    int maiorQtdeAcertos = 0;
    int jogadorMaiorQtdeAcertos = 0;
    for (int i = 0; i < quantidadeJogadores; i++)
    {
      if (jogador[i].colocacao == 0 && jogador[i].quantidadeDeAcertos > maiorQtdeAcertos)
      {
        maiorQtdeAcertos = jogador[i].quantidadeDeAcertos;
        jogadorMaiorQtdeAcertos = i;
      }
    }
    jogador[jogadorMaiorQtdeAcertos].colocacao = posicaoJogador;
    posicaoJogador++;
  }
}

void realizarSorteio(int numPedra, int pedra, int pedrasSorteadas[])
{
  while (posicaoJogador <= quantidadePremios)
  {
    pedra = sorteioPedra(numPedra, pedrasSorteadas);
    pedrasSorteadas[numPedra] = pedra;
    numPedra++;

    for (int i = 0; i < quantidadeJogadores; i++)
    {
      jogador[i] = verificadorDePedraMarcada(jogador[i], pedra);
    }

    for (int i = 0; i < quantidadeJogadores; i++)
    {
      validaGanhador(i);
    }
    limpaTela();
  }
}

int sorteioPedra(int numPedra, int *pedrasSorteadas)
{
  int resultado;
  int novo = 0;
  srand(time(NULL));

  do
  {
    resultado = 1 + rand() % intervalo;
    novo = 0;
    for (int i = 0; i < numPedra; i++)
      if (pedrasSorteadas[i] == resultado)
      {
        novo = 1;
      }
  } while (novo != 0);

  telaBingo();
  printf("\nA pedra sorteada foi: %02d\n\n", resultado);
  fprintf(ArquivoHistorico, "\n\n\n\n\nA pedra sorteada foi: %02d\n\n", resultado);
  return resultado;
}

Jogador verificadorDePedraMarcada(Jogador jogador, int pedra)
{
  for (int j = 0; j < linha; j++)
  {
    for (int k = 0; k < coluna; k++)
    {
      if (jogador.cartela[j][k] == pedra)
      {
        printf("%s marcou esse numero!\n\n", jogador.nome);
        jogador.quantidadeDeAcertos++;
        fprintf(ArquivoHistorico, "%s marcou esse numero!\n\n", jogador.nome);
        break;
      }
    }
  }

  return jogador;
}

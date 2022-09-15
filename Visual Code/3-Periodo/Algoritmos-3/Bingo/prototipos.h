// rotinas.h

void opcoesMenuPrincipal(int escolhaMenu);
void opcoesMenuArquivo(int escolhaMenuArquivo);

// menus.h

void linhaSuperior();
void linhaSuperiorMenu(char string[]);
void linhaInferior();
void opcoesMenu(char string[]);
void menuPrincipal();
void menuArquivos();

// exibicao.h

void limpaTela();
void pause();
void mensagemBingo();
void telaCadastrarParticipantes();
void telaCadastrarPremios();
void telaConfigCartela();
void telaMenuPrincipal();
void telaBingo();
void telaGanhador();
void exibirCartela(Jogador jogador);
void exibirGanhador(int i);
void exibirArquivoHistorico();
void exibirArquivoResultado();
void exibirArquivoPremios();
void exibirArquivoJogadores();

// arquivos.h

void gerarArquivoResultado(int pedrasSorteadas[]);
void gerarArquivoDoJogador(int quantidadeDeJogadores, int i, Jogador jogador);
void gerarArquivoPremio(int quantidadeDePremios, int i, Premio premio);

// Bingo.c

void cadastrarParticipantes();
void inserirQuantidadeJogadores();
char *entradaNomeJogador(int numJogador);
char *entradaCPFJogador();
char *entradaNumeroTelJogador();
Jogador inserirInformacoesJogador(int i);
void inserirQuantidadeDePremios(int qtdJogadores);
char *inserirNomeDoPremio(int numPremio);
float inserirValorDoPremio();
Premio inserirInformacoesPremio(int i, int quantidadePremios);
void configurarCartela();
Jogador gerarCartela(Jogador jogador);
void horaDeBingar();
void definirColocacaoJogador();
void realizarSorteio(int numPedra, int pedra, int pedrasSorteadas[]);
int sorteioPedra(int numPedra, int *pedrasSorteadas);
Jogador verificadorDePedraMarcada(Jogador jogador, int pedra);

// tratamento.h

void retirarEnter(char *string);
void trataQuantidadeJogadores();
void trataNomeJogador(char nome[], int condNome);
void trataCPF(int condCPF, int icpf[], char *cpf);
void trataNumTel(char numTel[], int condNumTel);
void trataQuantidadePremios(int qtdJogadores);
void trataValorPremio(float valor);
void trataConfigCartela1();
void trataConfigCartela2(int auxTamanho);
void validaConfiguracoes();
void validaGanhador(int i);
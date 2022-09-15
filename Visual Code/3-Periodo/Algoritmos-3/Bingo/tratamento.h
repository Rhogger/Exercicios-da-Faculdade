void retirarEnter(char *string)
{
  for (int i = 0; string[i] != '\0'; i++)
  {
    if (string[i + 1] == '\n')
    {
      string[i + 1] = '\0';
    }
  }
}

void trataQuantidadeJogadores()
{
  if (quantidadeJogadores < 1)
  {
    printf("\nNumero invalido!\n\n");
    limpaTela();
  }
}

void trataNomeJogador(char nome[], int condNome)
{
  for (int i = 0; i < strlen(nome); i++)
  {
    if ((nome[i] >= 'a' && nome[i] <= 'z') || (nome[i] >= 'A' && nome[i] <= 'Z'))
    {
      condNome = 1;
    }
    else if (isspace(nome[i]))
    {
      condNome = 1;
    }
    else
    {
      condNome = 0;
      break;
    }
  }
  if (condNome != 1)
  {
    printf("\nNome invalido! Insira apenas letras!\n\n");
    limpaTela();

    telaCadastrarParticipantes();
  }
}

void trataCPF(int condCPF, int icpf[], char *cpf)
{
  int somatorio = 0, primeiroDigito, resultPrimeiroDigito, resultSegundoDigito, segundoDigito;

  // Conversao de array de char para um array de int.
  for (int i = 0; i < 11; i++)
  {
    icpf[i] = cpf[i] - 48;
  }

  // Validação primeiro digito.
  for (int i = 0; i < 9; i++)
  {
    somatorio += icpf[i] * (10 - i);
  }

  resultPrimeiroDigito = somatorio % 11;

  if (resultPrimeiroDigito < 2)
  {
    primeiroDigito = 0;
  }
  else
  {
    primeiroDigito = 11 - resultPrimeiroDigito;
  }

  // Validação segundo digito.
  somatorio = 0;

  for (int i = 0; i < 10; i++)
  {
    somatorio += icpf[i] * (11 - i);
  }

  resultSegundoDigito = somatorio % 11;
  if (resultSegundoDigito < 2)
  {
    segundoDigito = 0;
  }
  else
  {
    segundoDigito = 11 - resultSegundoDigito;
  }

  // RESULTADOS DA VALIDACAO.
  if ((primeiroDigito != icpf[9]) && (segundoDigito != icpf[10]))
  {
    printf("\nCPF inserido INVALIDO\n\n");
    condCPF = 0;

    limpaTela();

    telaCadastrarParticipantes();
  }
  else
  {
    condCPF = 1;
  }
}

void trataNumTel(char numTel[], int condNumTel)
{
  for (int i = 0; i < strlen(numTel); i++)
  {
    if ((numTel[i] >= '0') && (numTel[i] <= '9'))
    {
      condNumTel = 1;
    }
    else
    {
      printf("\nEntrada de dados invalida: Insira apenas numeros!\n\n");
      condNumTel = 0;

      limpaTela();

      telaCadastrarParticipantes();
    }
  }
}

void trataQuantidadePremios(int qtdJogadores)
{
  if (quantidadePremios > qtdJogadores)
  {
    printf("\nNumero maior que a quantidade de participantes. \n");
  }
  else if (quantidadePremios < 1)
  {
    printf("\nNumero de premios menor que o permitido. Cadastre pelo menos 1!\n");
  }
  printf("\n");
}

void trataValorPremio(float valor)
{
  if (valor < 1)
  {
    printf("\nValor do premio menor que o permitido!\n");
    system("pause");
  }
}

void trataConfigCartela1()
{
  if (linha < 1 || coluna < 1)
  {
    printf("\nTamanho invalido! Digite novamente.\n\n");
    limpaTela();
  }
}

void trataConfigCartela2(int auxTamanho)
{
  if (auxTamanho >= intervalo)
  {
    printf("\nIntervalo menor ou igual o tamanho da cartela.");
    printf("\nDigite um valor maior.");
  }
  else
  {
    verificadorDeConfiguracaoCartela = 1;
  }
}

void validaConfiguracoes()
{
  if (quantidadeJogadores != 0 && quantidadePremios != 0)
  {
    mensagemBingo();
    horaDeBingar();
    exibirArquivoResultado();
  }
  else
  {
    telaMenuPrincipal();
    printf("\nTermine as configuracoes iniciais antes de comecar o bingo!\n\n");
  }

  limpaTela();
}

void validaGanhador(int i)
{
  if (jogador[i].colocacao == 0 && jogador[i].quantidadeDeAcertos == tamanho)
  {
    jogador[i].colocacao = posicaoJogador;
    exibirGanhador(i);
  }
}
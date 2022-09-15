void limpaTela()
{
  system("pause");
  system("cls");
}

void pause()
{
  printf("\n");
  system("pause");
}

// Exibição de Mensagens e Telas

void mensagemBingo()
{
  system("cls");
  linhaSuperiorMenu("BINGO");
  opcoesMenu("  ");
  opcoesMenu("              Tudo pronto!");
  opcoesMenu("  ");
  opcoesMenu("             Hora do bingo!");
  opcoesMenu("  ");
  linhaInferior();
  printf("\n");
  limpaTela();
}

void telaCadastrarParticipantes()
{
  system("cls");
  linhaSuperior();
  opcoesMenu("          Cadastrar Participantes");
  linhaInferior();
}

void telaCadastrarPremios()
{
  system("cls");
  linhaSuperior();
  opcoesMenu("          Cadastrar Premios");
  linhaInferior();
}

void telaConfigCartela()
{
  linhaSuperior();
  opcoesMenu("          Configurar cartela");
  linhaInferior();
}

void telaMenuPrincipal()
{
  system("cls");
  linhaSuperior();
  opcoesMenu("                 MENU");
  linhaInferior();
}

void telaBingo()
{
  system("cls");
  linhaSuperior();
  opcoesMenu("                BINGO");
  linhaInferior();
}

void telaGanhador()
{
  printf("\n  _______0__o_o__o_0_0_o_o___0__________");
  printf("\n  ______0___o__o__o0_0__o_o___0_________");
  printf("\n  _____0___o__o_o__0_0__o___o__0________");
  printf("\n  ____0_o___o___o__0_0___o___o__0_______");
  printf("\n  ____00o0000o00o0o0_0o00o00oo0oo0______");
  printf("\n  ___000o0o00000o000_000o00o0o000o0_____");
  printf("\n  ___00000o000o000o0_000o000o00000o0____");
  printf("\n  ___0o00oo00o0o00o0__0000o0o0o00000____");
  printf("\n  ___0o0o00000o00o0___000o0o0o0o0o00____");
  printf("\n  ____0o0o0000o0o0_____0000o00o00o0_____");
  printf("\n  _____0000o0000________ 00o000o000_____");
  printf("\n  ______0000000___________0000000_______");
  printf("\n  ________00__________________00________");
  printf("\n  _______00____________________00_______");
  printf("\n  ______00_____FELICIDADES!_____00______");
  printf("\n  _____00________________________00_____");
  printf("\n  ____00__________________________00____");
  printf("\n  _000000________________________000000_");
  printf("\n  ______________________________________\n\n");
}

// Impressão de Arquivos

void exibirCartela(Jogador jogador)
{
  printf("\nCartela de %s \n\n", jogador.nome);
  for (int j = 0; j < linha; j++)
  {
    for (int k = 0; k < coluna; k++)
    {
      printf(" %02d ", jogador.cartela[j][k]);
    }
    printf("\n");
  }
  printf("\n");
  limpaTela();
}

void exibirGanhador(int i)
{
  telaBingo();
  printf("\n%s ganhou em %do lugar! \n", jogador[i].nome, posicaoJogador);
  printf("\nPremio: %s.\n\n", premio[posicaoJogador - 1].nomePremio);

  posicaoJogador++;

  telaGanhador();
}

void exibirArquivoHistorico()
{
  ArquivoHistorico = fopen("arquivoHistorico.txt", "r");

  while (fgets(texto_str, 20, ArquivoHistorico) != NULL)
  {
    {
    }
    printf("%s", texto_str);
  }

  fclose(ArquivoHistorico);
  limpaTela();
}

void exibirArquivoResultado()
{
  ArquivoResultado = fopen("arquivoResultado.txt", "r");
  while (fgets(texto_str, 20, ArquivoResultado) != NULL)
  {
    printf("%s", texto_str);
  }
  fclose(ArquivoResultado);
}

void exibirArquivoPremios()
{
  char premios[quantidadePremios];
  for (int i = 0; i < quantidadePremios; i++)
  {
    sprintf(premios, "premio-%02d.txt", i + 1);
    ArquivoPremio = fopen(premios, "r");
    while (fgets(texto_str, 20, ArquivoPremio) != NULL)
    {
      printf("%s", texto_str);
    }
    fclose(ArquivoPremio);
    pause();
    printf("\n\n\n");
  }
}

void exibirArquivoJogadores()
{
  char jogadores[quantidadeJogadores];
  for (int i = 0; i < quantidadeJogadores; i++)
  {
    sprintf(jogadores, "Jogadores-%02d.txt", i + 1);
    ArquivoJogador = fopen(jogadores, "r");
    while (fgets(texto_str, 20, ArquivoJogador) != NULL)
      printf("%s", texto_str);
    fclose(ArquivoJogador);
    pause();
    printf("\n\n\n");
  }
}
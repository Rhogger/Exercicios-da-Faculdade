void linhaSuperior()
{
  printf("%c", 201);
  for (int i = 0; i < 40; i++)
  {
    printf("%c", 205);
  }
  printf("%c\n", 187);
}

void linhaSuperiorMenu(char string[])
{
  int tamanho;

  if (strlen(string) % 2 == 0)
  {
    tamanho = (38 - strlen(string)) / 2;
  }
  else
  {
    tamanho = (39 - strlen(string)) / 2;
  }

  printf("%c", 201);
  for (int i = 0; i < tamanho; i++)
  {
    printf("%c", 205);
  }

  printf(" %s ", string);

  if (strlen(string) % 2 == 1)
  {
    tamanho--;
  }

  for (int i = 0; i < tamanho; i++)
  {
    printf("%c", 205);
  }
  printf("%c\n", 187);
}

void linhaInferior()
{
  printf("%c", 200);
  for (int i = 0; i < 40; i++)
  {
    printf("%c", 205);
  }
  printf("%c\n", 188);
}

void opcoesMenu(char string[])
{
  int qtdLetras = strlen(string);

  printf("%c", 186);
  printf("%s", string);

  while (qtdLetras < 40)
  {
    printf("%c", 32);
    qtdLetras++;
  }

  printf("%c\n", 186);
}

void menuPrincipal()
{
  linhaSuperiorMenu("MENU");
  opcoesMenu(" ");
  opcoesMenu("  1. Configurar cartela.");
  opcoesMenu("  2. Cadastrar participantes.");
  opcoesMenu("  3. Cadastrar premios.");
  opcoesMenu("  4. Iniciar BINGO.");
  opcoesMenu("  5. Arquivos.");
  opcoesMenu(" ");
  opcoesMenu("  0. Encerrar programa.");
  opcoesMenu(" ");
  linhaInferior();
}

void menuArquivos()
{
  linhaSuperiorMenu("ARQUIVOS");
  opcoesMenu(" ");
  opcoesMenu("  1. Exibir arquivos de jogadores.");
  opcoesMenu("  2. Exibir arquivos de premios.");
  opcoesMenu("  3. Exibir historico");
  opcoesMenu("  4. Exibir ranking");
  opcoesMenu(" ");
  opcoesMenu("  0. retornar a tela inicial.");
  opcoesMenu(" ");
  linhaInferior();
}
void gerarArquivoPremio(int quantidadeDePremios, int i, Premio premio)
{
  char premios[quantidadeDePremios];
  sprintf(premios, "premio-%02d.txt", i + 1);
  ArquivoPremio = fopen(premios, "w");
  if (ArquivoPremio == NULL)
  {
    printf("ERRO: Arquivo já existente!");
    fclose(ArquivoPremio);
  }
  else
  {
    fprintf(ArquivoPremio, "Nome: %s\n\nValor: R$%.2f\n\nColocacao: %d \n", premio.nomePremio, premio.valorAssociado, premio.posicaoPremio + 1);
    fclose(ArquivoPremio);
  }
}

void gerarArquivoDoJogador(int quantidadeDeJogadores, int i, Jogador jogador)
{
  char jogadores[quantidadeDeJogadores];
  sprintf(jogadores, "Jogadores-%02d.txt", i + 1);
  ArquivoJogador = fopen(jogadores, "w");
  if (ArquivoJogador == NULL)
  {
    system("cls");
    printf("ERRO: Arquivo já existente!");
    fclose(ArquivoJogador);
  }
  else
  {
    fprintf(ArquivoJogador, "Nome: %s\n\nNumero de Celular: %s\n\nCPF: %s\n\nCartela: \n\n", jogador.nome, jogador.numeroTelefone, jogador.cpf);
    for (int j = 0; j < linha; j++)
    {
      for (int k = 0; k < coluna; k++)
      {
        fprintf(ArquivoJogador, " %02d", jogador.cartela[j][k]);
      }
      fprintf(ArquivoJogador, "\n");
    }
    fclose(ArquivoJogador);
  }
}

void gerarArquivoResultado(int pedrasSorteadas[])
{
  for (int i = quantidadeJogadores; i >= 1; i--)
  {
    for (int j = quantidadeJogadores; j >= 0; j--)
    {
      if (jogador[j].colocacao == i)
      {
        if (premio[i - 1].nomePremio != NULL)
        {
          fprintf(ArquivoResultado, "\n----------GANHADOR----------\n");
          fprintf(ArquivoResultado, "\nJogador: %s \n\nColocacao: %d \n\nPremio: %s \n\nCartela:\n\n", jogador[j].nome, jogador[j].colocacao, premio[i - 1].nomePremio);
        }
        else
        {
          fprintf(ArquivoResultado, "\nJogador: %s \n\nColocacao: %d \n\nCartela:\n\n", jogador[j].nome, jogador[j].colocacao);
        }

        for (int k = 0; k < linha; k++)
        {
          for (int l = 0; l < coluna; l++)
          {
            fprintf(ArquivoResultado, " %02d", jogador[j].cartela[k][l]);
          }
          fprintf(ArquivoResultado, "\n");
        }
        fprintf(ArquivoResultado, "\n");

        int temp = 1, qtdAcertos = 0;
        fprintf(ArquivoResultado, "\nNumeros faltantes: ");

        for (int k = 0; k < linha; k++)
        {
          for (int l = 0; l < coluna; l++)
          {
            for (int m = 0; m < intervalo; m++)
            {
              if (jogador[j].cartela[k][l] == pedrasSorteadas[m])
              {
                temp = 1;
                qtdAcertos++;
              }
              else
              {
                temp = 0;
              }
            }
          }
        }
        if (qtdAcertos != 0)
        {
          jogador[j].quantidadeFaltante = linha * coluna - jogador[j].quantidadeDeAcertos;
        }
        else
        {
          jogador[j].quantidadeFaltante = 0;
        }
        fprintf(ArquivoResultado, "%02d \n\n", jogador[j].quantidadeFaltante);
      }
    }
  }
}
void opcoesMenuPrincipal(int escolhaMenu)
{
  switch (escolhaMenu)
  {
  case 1:
  {
    configurarCartela();
    break;
  }
  case 2:
  {
    cadastrarParticipantes();
    break;
  }
  case 3:
  {
    telaCadastrarPremios();

    inserirQuantidadeDePremios(quantidadeJogadores);

    for (int i = 0; i < quantidadePremios; i++)
    {
      telaCadastrarPremios();
      premio[i] = inserirInformacoesPremio(i, quantidadePremios);
    }
    system("cls");
    break;
  }
  case 4:
  {
    validaConfiguracoes();
    break;
  }
  case 5:
  {
    system("cls");

    do
    {
      menuArquivos();
      printf("\nEscolha: ");
      scanf("%d", &escolhaMenuArquivo);
      opcoesMenuArquivo(escolhaMenuArquivo);
    } while (escolhaMenuArquivo != 0);
    break;
  }
  case 0:
  {
    telaMenuPrincipal();
    printf("\nPrograma encerrado.\n");
    break;
  }
  default:
  {
    printf("\n\nCodigo inexistente\n\n\n");
    limpaTela();
    break;
  }
  }
}

void opcoesMenuArquivo(int escolhaMenuArquivo)
{
  system("cls");

  switch (escolhaMenuArquivo)
  {
  case 1:
  {
    exibirArquivoJogadores();
    limpaTela();
    break;
  }
  case 2:
  {
    exibirArquivoPremios();
    limpaTela();
    break;
  }
  case 3:
  {
    exibirArquivoHistorico();
    limpaTela();
    break;
  }
  case 4:
  {
    exibirArquivoResultado();
    limpaTela();
    break;
  }
  case 0:
  {
    break;
  }
  }
}
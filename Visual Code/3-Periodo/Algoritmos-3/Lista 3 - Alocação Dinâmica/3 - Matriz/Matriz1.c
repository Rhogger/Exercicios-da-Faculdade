#include <stdio.h>
#include <stdlib.h>

double main()
{

  int linha1, coluna1;
  double **matriz1;

  int linha2, coluna2;
  double **matriz2;

  double **matriz3;

  printf("\n\nInsira as dimensoes da 1a matriz.\n\n");
  printf("Linhas: ");
  scanf("%d", &linha1);

  printf("Colunas: ");
  scanf("%d", &coluna1);

  printf("\n\nInsira as dimensoes da 2a matriz.\n\n");
  printf("Linhas: ");
  scanf("%d", &linha2);

  printf("Colunas: ");
  scanf("%d", &coluna2);

  if (linha1 != linha2 && coluna1 != coluna2)
  {

    printf("\n\n\nNao eh possivel somar as matrizes, as dimensoes sao diferentes!!! \n\n");
  }
  else
  {

    matriz1 = malloc(linha1 * sizeof(double *));

    for (int i = 0; i < coluna1; i++)
    {
      matriz1[i] = malloc(coluna1 * sizeof(double));
    }

    matriz2 = malloc(linha2 * sizeof(double *));

    for (int i = 0; i < coluna2; i++)
    {
      matriz2[i] = malloc(coluna2 * sizeof(double));
    }

    matriz3 = malloc(linha1 * sizeof(double *));

    for (int i = 0; i < coluna1; i++)
    {
      matriz3[i] = malloc(coluna1 * sizeof(double));
    }

    system("cls");

    printf("\n\nInsira os valores da 1a matriz %dx%d.\n", linha1, coluna1);
    for (int i = 0; i < linha1; i++)
    {
      for (int j = 0; j < coluna1; j++)
      {
        printf("Linha %d x Coluna%d: ", i + 1, j + 1);
        scanf("%lf", &matriz1[i][j]);
      }
    }

    system("cls");

    printf("\n\nInsira os valores da 2a matriz %dx%d.\n", linha2, coluna2);
    for (int i = 0; i < linha1; i++)
    {
      for (int j = 0; j < coluna1; j++)
      {
        printf("Linha %d x Coluna%d: ", i + 1, j + 1);
        scanf("%lf", &matriz2[i][j]);
      }
    }

    system("cls");

    for (int i = 0; i < linha1; i++)
    {
      for (int j = 0; j < coluna1; j++)
      {
        matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
      }
    }

    printf("\n\nMatriz 1: \n\n");
    for (int i = 0; i < linha1; i++)
    {
      for (int j = 0; j < coluna1; j++)
      {
        printf("| %.2lf ", matriz1[i][j]);
        if (j == coluna1 - 1)
        {
          printf("|");
        }
      }
      printf("\n");
    }

    printf("\n\n\n\nMatriz 2: \n\n");
    for (int i = 0; i < linha2; i++)
    {
      for (int j = 0; j < coluna2; j++)
      {
        printf("| %.2lf ", matriz2[i][j]);
        if (j == coluna2 - 1)
        {
          printf("|");
        }
      }
      printf("\n");
    }

    printf("\n\n\n\nMatriz 3: \n\n");
    for (int i = 0; i < linha1; i++)
    {
      for (int j = 0; j < coluna1; j++)
      {
        printf("| %.2lf ", matriz3[i][j]);
        if (j == coluna1 - 1)
        {
          printf("|");
        }
      }
      printf("\n");
    }
  }

  return 0;
}
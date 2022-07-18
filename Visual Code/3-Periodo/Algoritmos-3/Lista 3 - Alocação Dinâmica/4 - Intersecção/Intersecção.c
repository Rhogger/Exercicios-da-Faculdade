#include <stdio.h>
#include <stdlib.h>

int main()
{

  int qtd1, qtd2, qtd3 = 0;

  printf("\n\nInsira a quantidade de elementos do 1o conjunto: ");
  scanf("%d", &qtd1);

  printf("\n\nInsira a quantidade de elementos do 2o conjunto: ");
  scanf("%d", &qtd2);

  fflush(stdin);

  int vetor1[qtd1], vetor2[qtd2], *vetor3;

  printf("\n\nInsira os elementos do 1o conjunto: \n{\n");
  for (int i = 0; i < qtd1; i++)
  {
    scanf("%d", &vetor1[i]);
  }
  printf("} \n\n");

  fflush(stdin);

  printf("\n\nInsira os elementos do 2o conjunto: \n{\n");
  for (int i = 0; i < qtd2; i++)
  {
    scanf("%d", &vetor2[i]);
  }
  printf("} \n\n");

  fflush(stdin);

  // system("cls");

  vetor3 = tamanho(&vetor1, &vetor2, qtd1, qtd2, &qtd3);

  int k = 0;

  fflush(stdin);

  for (int i = 0; i < qtd1; i++)
  {
    for (int j = 0; j < qtd2; j++)
    {
      if (vetor1[i] == vetor2[j])
      {
        vetor3[k] = vetor1[i];
        k++;
        break;
      }
    }
    fflush(stdin);
  }

  printf("\n\nOs elementos do 3o conjunto: {");
  for (int i = 0; i < k; i++)
  {
    if (i == 0)
    {
      printf("%d", vetor3[i]);
    }
    else
    {
      printf(", %d", vetor3[i]);
    }
  }
  printf("} \n\n");
}

int tamanho(int *x1, int *x2, int n1, int n2, int *qtd)
{
  for (int i = 0; i < n1; i++)
  {
    for (int j = 0; j < n2; j++)
    {
      if (x1[i] == x2[j] && i < j)
      {
        *qtd++;
        printf("qtd: %d\n", *qtd);
        break;
      }
      fflush(stdin);
    }
  }

  return malloc(*qtd * sizeof(int));
}
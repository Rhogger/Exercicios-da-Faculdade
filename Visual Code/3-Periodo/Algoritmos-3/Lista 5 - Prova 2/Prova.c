#include <stdio.h>
#include <stdlib.h>

int tam1, tam2, tam3 = 0;
int *v1, *v2, *v3;

int *interseccao(int *v1, int *v2, int *v3, int tam1, int tam2)
{
  int acum = 0, k = 0;

  while (acum != 2)
  {
    for (int i = 0; i < tam1; i++)
    {
      for (int j = 0; j < tam2; j++)
      {
        if (v1[i] == v2[j])
        {
          if (acum == 0)
          {
            tam3++;
          }
          else if (acum == 1)
          {
            v3[k] = v2[j];
            k++;
          }
        }
      }
    }

    if (acum == 0)
    {
      v3 = malloc(tam3 * sizeof(int));
    }
    acum++;
  }

  return *v3;
}

void main()
{
  printf("Insira o tamanho do Vetor 1: ");
  scanf("%d", &tam1);

  printf("Insira o tamanho do Vetor 2: ");
  scanf("%d", &tam2);

  printf("\n\n\n");

  if ((tam1 < 1) || (tam2 < 1))
  {
    printf("Impossivel realizar a interseccao!");
  }
  else
  {
    v1 = malloc(tam1 * sizeof(int));
    v2 = malloc(tam2 * sizeof(int));

    printf("Insira os elementos do Vetor 1: \n");
    for (int i = 0; i < tam1; i++)
    {
      printf("Index[%d] : ", i + 1);
      scanf("%d", &v1[i]);
    }

    printf("\n\n\n");

    printf("Insira os elementos do Vetor 2: \n");
    for (int i = 0; i < tam2; i++)
    {
      printf("Index[%d] : ", i + 1);
      scanf("%d", &v2[i]);
    }

    printf("\n\n\n");

    v3 = interseccao(&v1, &v2, &v3, tam1, tam2);

    printf("A interseccao do Vetor 1 com o 2 ficou: \n\n");
    for (int i = 0; i < tam3; i++)
    {
      printf("Index[%d] : %d \n", i + 1, v3[i]);
    }
  }
}
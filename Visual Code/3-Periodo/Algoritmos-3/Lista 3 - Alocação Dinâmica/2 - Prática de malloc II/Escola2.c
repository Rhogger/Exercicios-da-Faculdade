#include <stdio.h>
#include <stdlib.h>

float main()
{

  int qtdAlunos;
  // int matricula, media;
  float **alunos;

  printf("\n\nInsira a quantidade de alunos: ");
  scanf("%d", &qtdAlunos);
  printf("\n");

  alunos = malloc(qtdAlunos * sizeof(float *));

  for (int i = 0; i < qtdAlunos; i++)
  {
    alunos[i] = malloc(2 * sizeof(float));
  }

  printf("\n\n\n=-=-=-=-= Cadastro dos dados dos alunos =-=-=-=-=");

  for (int i = 0; i < qtdAlunos; i++)
  {
    for (int j = 0; j < 2; j++)
    {

      printf("\n\nInsira matricula do Aluno %d: ", i + 1);
      scanf("%f", &alunos[i][j]);

      j++;

      printf("Insira a media do Aluno %d: ", i + 1);
      scanf("%f", &alunos[i][j]);
    }
  }

  printf("\n\n\n=-=-=-=-= Dados de cada Aluno =-=-=-=-=\n\n");
  for (int i = 0; i < qtdAlunos; i++)
  {
    for (int j = 0; j < 2; j++)
    {
      printf("Matricula: %.0f \n", alunos[i][j]);

      j++;

      printf("Media: %.2f \n\n", alunos[i][j]);
    }
  }

  fflush(stdin);

  return 0;
}
#include <stdio.h>
#include <stdlib.h>

main()
{

  // Variaveis
  char nome[30];
  int qtdAvaliacaoInt;
  float mediaNotas, totalNotas, qtdAvaliacaoFloat;

  // Ponteiros
  float *notas;

  printf("\n\nInsira o nome do aluno: ");
  gets(nome);

  printf("\nQuantas avaliacoes ele fez: ");
  scanf("%d", &qtdAvaliacaoInt);

  if (qtdAvaliacaoInt > 0)
  {

    qtdAvaliacaoFloat = qtdAvaliacaoInt;

    notas = malloc(qtdAvaliacaoFloat * sizeof(float));

    for (int i = 0; i < qtdAvaliacaoInt; i++)
    {

      printf("\nQual a nota da prova %d: ", i + 1);
      scanf("%f", &notas[i]);

      totalNotas += notas[i];
    }

    mediaNotas = totalNotas / qtdAvaliacaoFloat;

    printf("\n\nA Media Geral do Aluno eh: %.2f \n\n", mediaNotas);
  }
  else
  {

    printf("\nValor inserido eh menor que 1, logo nao eh possivel fazer o calculo!\n\n");
  }
}
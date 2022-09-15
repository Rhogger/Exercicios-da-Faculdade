#include <stdio.h>

float MediaAritmetica(float notaA1, float notaA2, float notaA3)
{

  float mediaA = (notaA1 + notaA2 + notaA3) / 3;

  return (mediaA);
}

float MediaPonderada(float notaP1, float notaP2, float notaP3)
{

  float mediaP = ((notaP1 * 5) + (notaP2 * 3) + (notaP3 * 2)) / 3;

  return (mediaP);
}

int main()
{

  float nota1, nota2, nota3, resultado;
  char escolhaMedia;

  printf("Digite as 3 notas do aluno: ");
  scanf("%f", &nota1);
  scanf("%f", &nota2);
  scanf("%f", &nota3);

  printf("Selecione a forma de avaliar: \nA - média aritmetica. \nP média ponderada. \n");
  scanf("%s", &escolhaMedia);

  switch (escolhaMedia)
  {
  case 'A':
    resultado = MediaAritmetica(nota1, nota2, nota3);
    break;

  case 'P':
    resultado = MediaPonderada(nota1, nota2, nota3);
    break;

  default:
    printf("Caractere invalido.");
    break;
  }

  printf("Média Final: %f", resultado);
}

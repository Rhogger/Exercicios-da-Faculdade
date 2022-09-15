#include <stdio.h>

float bhaskara(float a, float b, float RaizDelta)
{

  if (RaizDelta < 0)
  {
    printf("Sem raizes reais.");
  }
  else
  {
    float x1 = ((b * -1) + RaizDelta) / (2 * a);

    float x2 = ((b * -1) - RaizDelta) / (2 * a);

    printf("X1 = %f \nX2 = %f", x1, x2);
  }
}

float RaizDelta(float deltaA, float deltaB, float deltaC)
{
  deltaB = deltaB * deltaB;

  float delta = deltaB - (4 * deltaA * deltaC);

  if (delta < 0)
  {

    return (delta);
  }
  else
  {
    delta = sqrt(delta);

    return (delta);
  }
}

int main()
{

  float A, B, C, resultado;

  printf("Digite o Valor A: ");
  scanf("%f", &A);

  printf("Digite o Valor B: ");
  scanf("%f", &B);

  printf("Digite o Valor C: ");
  scanf("%f", &C);

  float Delta = RaizDelta(A, B, C);

  resultado = bhaskara(A, B, Delta);
}
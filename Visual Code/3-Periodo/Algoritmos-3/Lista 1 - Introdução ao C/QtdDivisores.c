#include <stdio.h>

int Divisores(int num)
{
  int qtdDivisores = 0;
  for (int i = num; i > 0; i--)
  {
    if (num % i == 0)
      qtdDivisores++;
  }
  return (qtdDivisores);
}

void main()
{

  int numero, resultado;
  printf("Insira um numero: ");
  scanf("%d", &numero);

  if (numero > 0)
  {
    resultado = Divisores(numero);
  }
  else
  {
    printf("O numero eh menor que 1, ou seja, nao calcula a quantidade de divisores.");
  }

  printf("O numero de divisores de %d eh %d", numero, resultado);
}

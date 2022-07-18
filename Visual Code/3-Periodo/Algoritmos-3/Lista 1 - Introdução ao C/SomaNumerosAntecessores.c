#include <stdio.h>

int SomaNumeros(int valorNum)
{

  int qtdNumeros = valorNum;
  for (int i = 0; i < valorNum; i++)
  {

    qtdNumeros = qtdNumeros + i;
  }

  return (qtdNumeros);
}
void main()
{

  int numero;

  printf("Insira um numero: ");
  scanf("%d", &numero);

  int resultado = SomaNumeros(numero);

  printf("O somatorio desse numero e: %d", resultado);
}
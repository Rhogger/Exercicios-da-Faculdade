#include <stdio.h>
#include <stdbool.h>

bool VerificaSinal(int numero)
{

  bool sinal;
  if (numero < 0)
  {
    sinal = false;
    return (sinal);
  }
  else if (numero > 0)
  {
    sinal = true;
    return (sinal);
  }
  else
  {
    printf("O numero zero e neutro.");
  }
}

void main()
{

  int num;
  bool sinalNum;

  printf("Digite um numero: ");
  scanf("%d", &num);

  sinalNum = VerificaSinal(num);

  if (sinalNum == true)
  {
    printf("O numero e positivo.");
  }
  else
  {
    printf("O numero e negativo.");
  }
}
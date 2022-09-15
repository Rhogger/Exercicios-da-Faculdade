#include <stdio.h>
#include <stdbool.h>

int VerificaNumPrimo(int numero)
{
  bool validacao;
  int acumulador = 0;
  for (int i = numero; i > 0; i--)
  {
    if (numero % i == 0)
    {
      acumulador++;
    }
  }
  if (acumulador == 2)
  {
    validacao = true;
  }
  else
  {
    validacao = false;
  }

  return (validacao);
}
void main()
{

  int num;

  printf("Insira um numero: ");
  scanf("%d", &num);

  bool resultado = VerificaNumPrimo(num);

  if (resultado == true)
  {
    printf("O numero %d eh primo.", num);
  }
  else
  {
    printf("O numero %d nao eh primo.", num);
  }
}
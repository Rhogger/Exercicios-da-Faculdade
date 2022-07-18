#include <stdio.h>

int qtdqtd(int valor, int div)
{

  int resultado, acum = 0;

  if (valor % div == 0)
  {
    while (valor % div == 0)
    {
      resultado = valor / div;
      valor = resultado;
      acum++;
    }
    return (acum);
  }
  else
  {
    return (-1);
  }
}

void main()
{

  int numero, divisor;

  printf("Insira um numero: ");
  scanf("%d", &numero);

  printf("Insira o divisor do numero: ");
  scanf("%d", &divisor);

  int resultado = qtdDivisores(numero, divisor);

  printf("A quantia de divisoes do numero %d eh: %d", numero, resultado);

  getchar();
}
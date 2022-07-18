#include <stdio.h>

int Potencializador(int x, int z)
{
  int resultado = x;
  for (int i = 1; i < z; i++)
  {
    resultado = resultado * x;
  }

  return (resultado);
}
void main()
{

  int numero1, numero2;

  printf("Insira o 1o numero: ");
  scanf("%d", &numero1);
  printf("Insira o 2o número: ");
  scanf("%d", &numero2);

  int potencia = Potencializador(numero1, numero2);

  printf("%d ** %d = %d", numero1, numero2, potencia);
}
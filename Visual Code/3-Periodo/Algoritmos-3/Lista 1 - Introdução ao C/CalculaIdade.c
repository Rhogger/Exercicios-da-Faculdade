#include <stdio.h>

int CalculaAnos(int xAnos)
{
  xAnos = xAnos * 365;

  return (xAnos);
}

int CalculaMeses(int xMeses)
{
  xMeses = xMeses * 30;

  return (xMeses);
}

int main()
{
  int anos, meses, dias, totalDias;

  printf("Quantos anos voce tem: ");
  scanf("%d", &anos);

  printf("Quantos meses: ");
  scanf("%d", &meses);

  printf("Quantos dias: ");
  scanf("%d", &dias);

  int anosX = CalculaAnos(anos);

  int mesesX = CalculaMeses(meses);

  totalDias = dias + anosX + mesesX;

  printf("Resultado: %d", totalDias;
}

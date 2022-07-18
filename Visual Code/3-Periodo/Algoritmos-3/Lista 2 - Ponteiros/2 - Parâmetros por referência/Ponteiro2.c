#include <stdio.h>
#include <stdlib.h>

int main()
{

  float first, second;

  printf("\n\nInsira um valor para a primeira variavel: ");
  scanf("%f", &first);

  printf("\nInsira um valor para a segunda variavel: ");
  scanf("%f", &second);

  Troca(&first, &second);

  printf("\n\nA primeira variavel agora tem o valor: %.2f", first);
  printf("\n\nA segunda variavel agora tem o valor: %.2f", second);

  return 0;
}

void Troca(float *pfirst, float *psecond)
{

  float temp;

  temp = *pfirst;
  *pfirst = *psecond;
  *psecond = temp;
}
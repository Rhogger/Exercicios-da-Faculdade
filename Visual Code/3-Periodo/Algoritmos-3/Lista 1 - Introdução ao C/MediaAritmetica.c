#include <stdio.h>

float mediaAritmetica(float somatoria, float vezesRepetidas)
{

  float mediaA = somatoria / (vezesRepetidas - 1);

  return (mediaA);
}
void main()
{
  float numero, media;
  int acumulador = 0, contador = 0;
  do
  {
    printf("Insira um valor: ");
    scanf("%f", &numero);
    contador = contador + 1;
    acumulador = acumulador + numero;
  } while (numero != 0);

  media = mediaAritmetica(acumulador, contador);

  printf("A media eh %.2f", media);
}
#include <stdio.h>
#include <stdbool.h>

int ValidaTriangulo(int lado1Triang, int lado2Triang, int lado3Triang)
{
  bool validacao;
  if ((lado1Triang + lado2Triang > lado3Triang) && (lado1Triang + lado3Triang > lado2Triang) && (lado3Triang + lado2Triang > lado1Triang))
  {
    validacao = true;
  }
  else
  {
    validacao = false;
  }
  return (validacao);
}

int TipoTriangulo(int lado1Triang, int lado2Triang, int lado3Triang)
{
  int tipo;
  if ((lado1Triang == lado2Triang) && (lado2Triang == lado3Triang))
  {
    tipo = 1;
  }
  else if ((lado1Triang != lado2Triang) && (lado2Triang != lado3Triang) && (lado1Triang != lado3Triang))
  {
    tipo = 2;
  }
  else
  {
    tipo = 3;
  }

  return (tipo);
}
void main()
{
  bool verificacao;
  int lado1, lado2, lado3, result;

  printf("Insira o tamanho em cm do lado 1");
  scanf("%d", &lado1);
  printf("Insira o tamanho em cm do lado 2");
  scanf("%d", &lado2);
  printf("Insira o tamanho em cm do lado 3");
  scanf("%d", &lado3);

  verificacao = ValidaTriangulo(lado1, lado2, lado3);

  if (verificacao == true)
  {
    result = TipoTriangulo(lado1, lado2, lado3);

    switch (result)
    {
    case 1:
      printf("Esse triangulo eh equilatero");
      break;
    case 2:
      printf("Esse triangulo eh escaleno. ");
      break;
    default:
      printf("Esse triangulo eh isosceles. ");
      break;
    }
  }
  else
  {
    printf("Esss medidas nao formam um triangulo.");
  }
}
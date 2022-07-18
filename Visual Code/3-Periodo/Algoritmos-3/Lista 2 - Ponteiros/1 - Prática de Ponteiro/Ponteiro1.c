#include <stdio.h>
#include <stdlib.h>

void main()
{

  // Variaveis
  int inteiro;
  float pFlutuante;
  char caractere;

  // Ponteiros
  int *pointerInt = &inteiro;
  float *pointerFloat = &pFlutuante;
  char *pointerChar = &caractere;

  printf("=-=-=-=-=-=-=-= Variaveis =-=-=-=-=-=-=-=-=");
  printf("\n\nInsira um valor inteiro: ");
  scanf("%d", &inteiro);

  printf("\nInsira um valor float: ");
  scanf("%f", &pFlutuante);

  printf("\nInsira um caractere: ");
  scanf("%s", &caractere);
  printf("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

  LimpaTela();

  printf("\n\nOs valores ficaram: \n\n");
  printf("Inteiro: %d;", inteiro);
  printf("\nFloat: %.2f;", pFlutuante);
  printf("\nCaractere: %c \n\n", caractere);

  LimpaTela();

  printf("\n\n=-=-=-=-=-=-=-= Ponteiros =-=-=-=-=-=-=-=-=");
  printf("\n\nAltere o conteudo de inteiro: ");
  scanf("%d", &*pointerInt);

  printf("\nAltere o conteudo de float: ");
  scanf("%f", &*pointerFloat);

  printf("\nAltere o conteudo de caractere: ");
  scanf("%s", &*pointerChar);
  printf("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

  LimpaTela();

  printf("\n\nOs valores ficaram: \n\n");
  printf("Inteiro: %d;", inteiro);
  printf("\nFloat: %.2f;", pFlutuante);
  printf("\nCaractere: %c \n\n", caractere);

  LimpaTela();
}

void LimpaTela()
{
  // LimpaTela();
  system("Pause");
  system("cls");
}
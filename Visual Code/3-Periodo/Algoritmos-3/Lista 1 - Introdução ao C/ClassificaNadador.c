#include <stdio.h>

int CategoriaNatacao(int idadeLimite)
{
  if (idadeLimite < 5)
  {
    printf("Pessoas menores de 5 anos nao estão classificadas a praticar natacao.");
  }
  else if (idadeLimite <= 7)
  {
    printf("A categoria do nadador e: INFANTIL A");
  }
  else if (idadeLimite <= 10)
  {
    printf("A categoria do nadador e: INFANTIL B");
  }
  else if (idadeLimite <= 13)
  {
    printf("A categoria do nadador e: JUVENIL A");
  }
  else if (idadeLimite <= 17)
  {
    printf("A categoria do nadador e: JUVENIL B");
  }
  else
  {
    printf("A categoria do nadador e: Adulto");
  }
}

void main()
{

  int idade;

  printf("Insira a idade do nadador: ");
  scanf("%d", &idade);

  CategoriaNatacao(idade);
}
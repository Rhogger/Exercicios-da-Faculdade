#include <stdio.h>
#include <conio.h>

main()
{
  int ano;

  do
  {
    printf("Digite o valor referente a um ano para determinar se ele eh bissexto ou nao: ");
    scanf("%d", &ano);

    if (ano > 1)
    {
      if (ano % 4 == 0)
      {
        if (ano % 100 == 0)
        {
          if (ano % 400 == 0)
          {
            printf("\nO ano digitado eh bissexto.\n");
          }
          else
          {
            printf("\nO ano digitado nao eh bissexto.\n");
          }
        }
        else
        {
          printf("\nO ano digitado eh bissexto.\n");
        }
      }
      else
      {
        printf("\nO ano digitado nao eh bissexto.\n");
      }
    }
    else
    {
      printf("\nNumero invalido.\n");
    }

    getch();
    system("cls");

  } while (ano > 0);
}
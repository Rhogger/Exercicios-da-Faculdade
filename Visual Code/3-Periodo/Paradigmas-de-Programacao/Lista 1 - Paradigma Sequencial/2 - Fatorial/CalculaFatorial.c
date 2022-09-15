#include <stdio.h>
#include <conio.h>

main()
{
  int num = 1, fatorial, j;

  printf("A seguir insira um valor para calcular seu fatorial.\n");
  printf("OBS: O algoritmo ira cancelar se voce digitar algum numero menor que 1 e maior que 9.\n\n");

  do
  {
    printf("\n\nInsira o valor: ");
    scanf("%d", &num);
    fatorial = num;
    j = num;

    if (num > 0 && num < 10)
    {

      if (num == 1)
      {
        fatorial = 1;
      }
      else
      {
        for (int i = 0; i < j - 1; i++)
        {
          fatorial = fatorial * (num - 1);
          num--;
        }
      }
      printf("O resultado desse fatorial eh: %d \n\n\n", fatorial);
    }
    else
    {
      printf("Numero invalido...");
    }

    getch();
    system("cls");
  } while (num > 0 && num < 10);
}
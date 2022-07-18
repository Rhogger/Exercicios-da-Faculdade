#include <stdio.h>

main()
{
  int num;

  printf("\nInsira um valor: ");
  scanf("%d", &num);

  if (num <= 3000)
  {
    num *= 1.35;
  }
  else if (num > 3000 && num <= 5000)
  {
    num *= 1.2;
  }
  else if (num > 5000)
  {
    num *= 1.05;
  }

  printf("\n\nO novo valor eh: %d\n\n", num);
}
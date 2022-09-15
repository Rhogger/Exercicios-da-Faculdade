import java.util.Scanner;

public class Atividade_1_5 {
  public static void main(String[] args) {

    // Ler 20 pares de valores (a e b) escrevendo qual é o maior valor.

    Scanner sc = new Scanner(System.in);

    int var_a, var_b, soma = 0;

    System.out.print("\nInsira valores para um conjunto de variaveis.\n");

    for (int i = 1; i <= 20; i++) {
      System.out.print("\nVariavel 1: ");
      var_a = sc.nextInt();
      System.out.print("\nVariavel 2: ");
      var_b = sc.nextInt();

      if (var_a > var_b) {
        System.out.printf("\nO valor 1: " + var_a + ", e maior que o valor 2: " + var_b + "\n");
      } else if (var_b > var_a) {
        System.out.printf("\nO valor 2: " + var_b + ", e maior que o valor 1: " + var_a + "\n");
      } else if (var_a == var_b) {
        System.out.print("\nOs dois valores sao iguais!\n");
      }
    }
  }
}

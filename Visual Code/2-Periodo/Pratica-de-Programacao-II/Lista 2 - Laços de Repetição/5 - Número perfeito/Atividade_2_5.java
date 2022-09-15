import java.util.Scanner;

public class Atividade_2_5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valor, i = 2, sum = 0;

    System.out.print(
        "\nO algoritmo ira identificar numeros perfeitos inseridos pelo usuario.\n\nO numero devera ser positivo e inteiro.\n\nInsira um valor: ");
    valor = sc.nextInt();
    System.out.print("\n\n");
    for (i = (valor - 1); i >= 1; i--) {
      if (i == 1) {
        System.out.print(i);
        sum = sum + i;
      } else if (valor % i == 0) {
        System.out.printf(i + " + ");
        sum = sum + i;
      }
    }
    if (valor == 0) {
      System.out.print("\n\nZero nao e perfeito!\n\n");
    } else if (valor < 0) {
      System.out.print("\n\nValor inserido não pode ser calculado! \n\n");
    } else if (sum == valor) {
      System.out.printf(" = " + valor);
      System.out.print("\n\nO numero " + valor + " e perfeito!\n\n");
    } else {
      System.out.printf(" <> " + valor);
      System.out.print("\n\nO numero " + valor + " nao e perfeito!\n\n");
    }

  }
}

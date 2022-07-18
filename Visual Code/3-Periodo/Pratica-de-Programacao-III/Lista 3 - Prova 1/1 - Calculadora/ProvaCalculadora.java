import java.util.*;

public class ProvaCalculadora {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num1, num2, escolha;

    System.out.print("\n\n\t\tInsira o 1o valor: ");
    num1 = input.nextInt();
    System.out.print("\n\n\t\tInsira o 2o valor: ");
    num2 = input.nextInt();

    System.out.print("\n\n\n\n\n\n\t\tEscolha a operacao: \n\n\t\t");
    System.out.print("\n\t\t1- Soma (+)\n");
    System.out.print("\n\t\t2- Subtracao (-)\n");
    System.out.print("\n\t\t3- Multiplicacao (*)\n");
    System.out.print("\n\t\t4- Divisão (/)\n");

    System.out.print("\n\n\t\tEscolha:");
    escolha = input.nextInt();

    switch (escolha) {

      case 1:

        Soma(num1, num2);

        break;

      case 2:

        Subtracao(num1, num2);

        break;

      case 3:

        Multiplicacao(num1, num2);

        break;

      case 4:

        Divisao(num1, num2);

        break;

      default:

        System.out.print("\n\nValor invalido.\n\n");

        break;
    }
  }

  public static void Soma(int number1, int number2) {

    System.out.printf("\n\n\t\tO resultado de %d + %d = %d\n\n", number1, number2, number1 + number2);

  }

  public static void Subtracao(int number1, int number2) {

    System.out.printf("\n\n\t\tO resultado de %d - %d = %d\n\n", number1, number2, number1 - number2);

  }

  public static void Multiplicacao(int number1, int number2) {

    System.out.printf("\n\n\t\tO resultado de %d * %d = %d\n\n", number1, number2, number1 * number2);

  }

  public static void Divisao(int number1, int number2) {

    if (number2 == 0) {

      System.out.print("\n\n\t\tIndefinido. (divisao por 0)");

    } else {

      float num1 = number1, num2 = number2;
      float resultado = num1 / num2;

      System.out.printf("\n\n\t\tO resultado de %d / %d = %.2f\n\n", number1, number2, resultado);

    }
  }
}
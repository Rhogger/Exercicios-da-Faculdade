import java.util.Scanner;

public class N2A2 {

  public static void main(String[] args) {

    int A, B, C, soma;

    Scanner leia = new Scanner(System.in);

    System.out.print("\nInsira o primeiro valor: ");
    A = leia.nextInt();
    System.out.print("\nInsira o segundo valor: ");
    B = leia.nextInt();
    System.out.print("\nInsira o terceiro valor: ");
    C = leia.nextInt();
    soma = A + B + C;
    System.out.printf("\nA soma de %d, %d e %d resulta em %d \n", A, B, C, soma);

  }

}

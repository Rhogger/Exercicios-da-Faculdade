import java.util.Scanner;

public class CS1A2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int A, B, result;

    System.out.print("\nInsira dois valores para obter o resultado da divisao do primeiro pelo segundo: \n");
    A = scan.nextInt();
    B = scan.nextInt();
    switch (B) {
      case 0:
        System.out.print("\nE impossivel dividir um numero por zero!\n");
      default:
        result = A / B;
        System.out.printf("\nO resultado da divisao foi de: " + result + "\n");
    }
  }
}

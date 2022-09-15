import java.util.Scanner;

public class ProvaN1_4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetorA = new int[10];

    int pair = 0;

    System.out.println("=-=-=-=-=-= TABELA =-=-=-=-=-=\n\n      Insira os numeros: ");

    for (int accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("\n              ");
      vetorA[accountant] = input.nextInt();
      if (vetorA[accountant] % 2 == 0) {
        pair++;
      }
    }

    if (pair > 1) {
      System.out.println("\n\nA tabela possui " + pair + " numeros pares!\n\n");
    } else if (pair == 0) {
      System.out.println("\n\nA tabela possui 1 numero par!\n\n");
    } else {
      System.out.println("\n\nA tabela nao possui numeros pares!\n\n");
    }
  }
}
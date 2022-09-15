import java.util.Scanner;

public class Atividade_3_5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetorA;

    int accountant, pairs = 0;

    vetorA = new int[10];

    System.out.print("\n\nVetor A[] : \n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("\nVetor [" + accountant + "] : ");
      vetorA[accountant] = sc.nextInt();
      if (vetorA[accountant] % 2 == 0) {
        pairs++;
      }
    }
    System.out.println("\n\nNo vetor A[] possui " + pairs + " numeros pares.\n");
  }
}

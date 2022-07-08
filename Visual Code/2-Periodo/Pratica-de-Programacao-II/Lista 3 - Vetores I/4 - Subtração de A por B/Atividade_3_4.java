import java.util.Scanner;

public class Atividade_3_4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetorA, vetorB, vetorC;

    int accountant;

    vetorA = new int[10];
    vetorB = new int[10];
    vetorC = new int[10];

    System.out.print("\n\nVetor A[] : \n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("\nA[" + accountant + "] : ");
      vetorA[accountant] = sc.nextInt();
    }
    System.out.print("\n\n\nVetor B[] :\n");
    for (accountant = 0; accountant < vetorB.length; accountant++) {
      System.out.print("\nB[" + accountant + "] : ");
      vetorB[accountant] = sc.nextInt();
    }
    System.out.print("\n\n\nVetor C[] :\n");
    for (accountant = 0; accountant < vetorC.length; accountant++) {
      vetorC[accountant] = vetorA[accountant] - vetorB[accountant];
      System.out.print("\nC [" + accountant + "] = " + vetorC[accountant]);
    }
  }
}

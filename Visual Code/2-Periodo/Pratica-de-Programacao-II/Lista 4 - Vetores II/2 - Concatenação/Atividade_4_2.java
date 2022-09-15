import java.util.Scanner;

public class Atividade_4_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[6];
    int[] vetorB = new int[6];
    int[] vetorC = new int[12];

    int accountant;

    System.out.print("\n\nInsira os valores do vetor A[] : \n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("\nA [" + accountant + "] = ");
      vetorA[accountant] = sc.nextInt();
      vetorC[accountant] = vetorA[accountant];
    }

    System.out.print("\n\n\nInsira os valores do vetor B[] : \n");
    for (accountant = 0; accountant < vetorB.length; accountant++) {
      System.out.print("\nB [" + accountant + "] = ");
      vetorB[accountant] = sc.nextInt();
      vetorC[accountant + 6] = vetorB[accountant];
    }
    System.out.print("\n\n\nValores do vetor C[] : \n");
    for (accountant = 0; accountant < vetorC.length; accountant++) {
      System.out.print("\nC[" + accountant + "] = " + vetorC[accountant]);
    }
    System.out.println("\n\n");
  }
}

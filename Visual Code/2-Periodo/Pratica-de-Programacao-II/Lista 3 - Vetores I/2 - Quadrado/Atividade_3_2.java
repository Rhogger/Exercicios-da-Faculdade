import java.util.Scanner;

public class Atividade_3_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetorA;
    int[] vetorB;
    int accountant;

    vetorA = new int[10];
    vetorB = new int[10];

    System.out.print("\nVetor A:\n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("\nInsira valor para o vetor A[" + accountant + "] : ");
      vetorA[accountant] = sc.nextInt();
    }
    System.out.print("\n\nVetor B:\n");
    for (accountant = 0; accountant < vetorB.length; accountant++) {
      vetorB[accountant] = vetorA[accountant] * vetorA[accountant];
      System.out.print("\nVetor B[" + accountant + "] : " + vetorB[accountant]);
    }
  }
}

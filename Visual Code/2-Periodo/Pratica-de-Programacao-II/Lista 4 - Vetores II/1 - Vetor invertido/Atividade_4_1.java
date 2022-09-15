import java.util.Scanner;

public class Atividade_4_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    int accountant1, accountant2 = 9;

    System.out.println("\n\nVetor A[] : ");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print("A[" + accountant1 + "] = ");
      vetorA[accountant1] = sc.nextInt();
      vetorB[accountant2] = vetorA[accountant1];
      accountant2 -= 1;
    }
    System.out.println("\n\nVetor B[] : \n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      accountant2 += 1;
      System.out.println("B[" + accountant2 + "] = " + vetorB[accountant2]);
    }
  }
}

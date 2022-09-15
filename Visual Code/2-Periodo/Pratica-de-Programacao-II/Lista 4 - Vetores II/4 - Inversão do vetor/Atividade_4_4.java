import java.util.Scanner;

public class Atividade_4_4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetorA = new int[20];
    int accountant, aux;

    System.out.print("\n\nInsira os valores do Vetor A[] :\n\n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("A[" + accountant + "] = ");
      vetorA[accountant] = input.nextInt();
    }
    for (accountant = 0; accountant < 10; accountant++) {
      aux = vetorA[accountant];
      vetorA[accountant] = vetorA[19 - accountant];
      vetorA[19 - accountant] = aux;
    }
    System.out.print("\n\nInversao do Vetor A[] : \n\n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.println("A[" + accountant + "] = " + vetorA[accountant]);
    }
  }
}

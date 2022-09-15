import java.util.Scanner;

public class Atividade_4_5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetorA = new int[5];

    int accountant;

    System.out.print("\n\nInsira os valores para o vetorA[] : \n\n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("A[" + accountant + "] = ");
      vetorA[accountant] = input.nextInt();
    }
    System.out.print("\n\nVetor A[] compactado: \n\n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      if (vetorA[accountant] > 0) {
        System.out.println("A[" + accountant + "] = " + vetorA[accountant]);
      }
    }
  }
}

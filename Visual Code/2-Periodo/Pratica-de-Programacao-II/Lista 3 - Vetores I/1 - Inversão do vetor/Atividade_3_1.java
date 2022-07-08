import java.util.Scanner;

public class Atividade_3_1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetor;
    int accountant = 1;
    vetor = new int[8];

    for (accountant = 0; accountant <= 8; accountant++) {
      System.out.print("\n\nInsira o valor para o vetor[" + accountant + "] : ");
      vetor[accountant] = sc.nextInt();
    }
    System.out.println("Ordem invertida: ");

    for (accountant = 8; accountant >= 0; accountant--) {
      System.out.print("\nVetor[" + accountant + "] = " + vetor[accountant]);
    }
  }
}

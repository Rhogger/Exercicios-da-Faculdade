import java.util.Scanner;

public class Bubble_Sort1_1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetorA = { 10, 8, 7, 0 };

    int aux, accountant, troca = 0, comp = 0;

    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print(" | " + vetorA[accountant]);
      if (accountant == (vetorA.length - 1)) {
        System.out.print(" |\n\n");
      }
    }

    input.close();

    for (accountant = 1; accountant < (vetorA.length); accountant++) {
      for (int accountant2 = 0; accountant2 < (vetorA.length - 1); accountant2++) {
        if (vetorA[accountant2] > vetorA[accountant2 + 1]) {
          aux = vetorA[accountant2 + 1];
          vetorA[accountant2 + 1] = vetorA[accountant2];
          vetorA[accountant2] = aux;
          troca++;
        }
        comp++;
      }
    }

    System.out.print("\n\n\n\nO Vetor A formatado, em decrescente: \n\n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print(" | " + vetorA[accountant]);
      if (accountant == (vetorA.length - 1)) {
        System.out.print(" |\n\n");
      }
    }

    System.out.println("comp" + comp + "troca" + troca);
  }
}

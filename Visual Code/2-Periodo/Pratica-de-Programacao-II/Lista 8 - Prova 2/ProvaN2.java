import java.util.Scanner;

public class ProvaN2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String[] vetorA = new String[10];

    int accountant1, accountant2;
    String key;

    System.out.print("\n\nEntrada do Vetor A[] : \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | ");
      vetorA[accountant1] = input.nextLine();
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n");
      }
    }
    for (accountant1 = 1; accountant1 < vetorA.length; accountant1++) {
      key = vetorA[accountant1];
      accountant2 = accountant1 - 1;

      while (accountant2 >= 0 && key < vetorA[accountant2]) {
        vetorA[accountant2 + 1] = vetorA[accountant2];
        accountant2--;
      }
      vetorA[accountant2 + 1] = key;
    }
    System.out.print("\n\nVetor Ordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n");
      }
    }
  }
}
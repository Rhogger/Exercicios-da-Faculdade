import java.util.Scanner;

public class Selection_Sort2_2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    char[] vetorA = new char[10];

    int accountant1, accountant2, less;
    char aux;

    System.out.print("\n\nVetor A[] Desordenado:\n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print("___ \n");
      vetorA[accountant1] = input.nextLine().charAt(0);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print("___\n");
      }
    }

    input.close();

    for (accountant1 = 0; accountant1 < (vetorA.length - 1); accountant1++) {
      less = accountant1;
      for (accountant2 = accountant1 + 1; accountant2 < vetorA.length; accountant2++) {
        if (vetorA[accountant2] < vetorA[less]) {
          less = accountant2;
        }
      }
      if (accountant1 != less) {
        aux = vetorA[accountant1];
        vetorA[accountant1] = vetorA[less];
        vetorA[less] = aux;
      }
    }

    System.out.print("\n\n\n\nO Vetor A[] com seus caracteres ordenados fica: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n");
      }
    }

    int[] vetorB = new int[10];

    System.out.print("\n\n\n\nO Vetor A[] com seus valores (de acordo com a Tabela ASCII) ordenados: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      vetorB[accountant1] = vetorA[accountant1];
      System.out.print(" | " + vetorB[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n");
      }
    }
  }
}

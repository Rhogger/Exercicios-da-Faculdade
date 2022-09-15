package N2;

import java.util.Scanner;

public class Selection_Sort1_1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetorA = new int[15];

    int less, aux, accountant1, accountant2;

    System.out.print("\n\nInsira os valores para um vetor. Em seguida, ele ira ser ordenado em forma crescente.\n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print("| ");
      vetorA[accountant1] = input.nextInt();
    }

    for (accountant1 = 0; accountant1 < (vetorA.length - 1); accountant1++) {
      less = accountant1;
      for (accountant2 = accountant1 + 1; accountant2 < vetorA.length; accountant2++) {
        if (vetorA[accountant2] < vetorA[less]) {
          less = accountant2;
        }
      }
      aux = vetorA[accountant1];
      vetorA[accountant1] = vetorA[less];
      vetorA[less] = aux;
    }

    System.out.print("\n\n\nO vetor ordenado ficou: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n");
      }
    }
  }
}

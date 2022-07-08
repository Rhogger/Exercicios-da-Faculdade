
public class Insertion_Sort2_1 {
  public static void main(String[] args) {

    int[] vetorA = { 82, 50, 71, 63, 85, 43, 39, 97, 14 };

    int accountant1, accountant2, aux;

    System.out.print("\n\nVetor A[] Desordenado:\n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n\n");
      }
    }

    System.out.print("Ordenacao do Vetor A[]: \n");
    for (accountant1 = 1; accountant1 < vetorA.length; accountant1++) {
      aux = vetorA[accountant1];
      accountant2 = accountant1 - 1;
      System.out.print("\n\nFase " + accountant1 + ": \n\nContador i: " + accountant1 + "\n\n");
      while (accountant2 >= 0 && vetorA[accountant2] > aux) {
        vetorA[accountant2 + 1] = vetorA[accountant2];
        accountant2--;
      }
      vetorA[accountant2 + 1] = aux;
      for (accountant2 = 0; accountant2 < vetorA.length; accountant2++) {
        System.out.print(" | " + vetorA[accountant2]);
        if (accountant2 == (vetorA.length - 1)) {
          System.out.print(" |\n\n\n");
        }
      }
      System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    }

    System.out.print("\n\n\n\nO Vetor A[] com seus valores ordenados fica: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n");
      }
    }
  }
}

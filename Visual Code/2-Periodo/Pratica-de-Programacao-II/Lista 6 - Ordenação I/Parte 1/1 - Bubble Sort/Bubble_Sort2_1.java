public class Bubble_Sort2_1 {
  public static void main(String[] args) {

    int[] vetorA = { 92, 80, 71, 63, 55, 41, 39, 27, 14 };

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
      System.out.print("\n\nFase " + accountant1 + ": \n\nContador i: " + accountant1 + "\n\n");
      for (accountant2 = 0; accountant2 < (vetorA.length - 1); accountant2++) {
        System.out.print("\nContador j: " + accountant2 + "\n\n");
        if (vetorA[accountant2] > vetorA[accountant2 + 1]) {
          aux = vetorA[accountant2 + 1];
          vetorA[accountant2 + 1] = vetorA[accountant2];
          System.out.print(vetorA[accountant2 + 1] + " <--> ");
          vetorA[accountant2] = aux;
          System.out.print(vetorA[accountant2] + "\n");
        } else {
          System.out.print("!!NAO HOUVE TROCA!!\n\n");
        }
      }
      System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
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

public class Selection_Sort2_1 {
  public static void main(String[] args) {

    int[] vetorA = { 82, 50, 71, 63, 85, 43, 39, 97, 14 };

    int accountant1, accountant2, aux, less;

    System.out.print("\n\nVetor A[] Desordenado:\n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n\n");
      }
    }

    System.out.print("Ordenacao do Vetor A[]: \n");
    for (accountant1 = 0; accountant1 < (vetorA.length - 1); accountant1++) {
      less = accountant1;
      System.out.print("\n\nFase " + (accountant1 + 1) + ": \n\nContador i: " + accountant1 + "\n\n");
      for (accountant2 = accountant1 + 1; accountant2 < vetorA.length; accountant2++) {
        if (vetorA[accountant2] > vetorA[less]) {
          less = accountant2;
        }
      }
      System.out.print("\nO menor esta na posicao " + less + "\n\n");
      if (accountant1 != less) {
        aux = vetorA[accountant1];
        System.out.print(vetorA[accountant1] + " <--> ");
        vetorA[accountant1] = vetorA[less];
        System.out.print(vetorA[less] + "\n");
        vetorA[less] = aux;
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

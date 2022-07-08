public class Bubble_Sort2_2 {
  public static void main(String[] args) {

    int[] vetorA = { 14, 27, 39, 41, 55, 63, 71, 80, 92 };

    int aux, accountant1, accountant2;

    System.out.print("\n\nVetor A[] Desordenado:\n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n\n");
      }
    }

    System.out.print("Ordenacao do Vetor A[]: \n");
    for (accountant1 = 1; accountant1 < vetorA.length; accountant1++) {
      for (accountant2 = 0; accountant2 < (vetorA.length - 1); accountant2++) {
        if (vetorA[accountant2] < vetorA[accountant2 + 1]) {
          aux = vetorA[accountant2 + 1];
          vetorA[accountant2 + 1] = vetorA[accountant2];
          vetorA[accountant2] = aux;
        }
      }
    }

    System.out.print("\n\n\n\nO Vetor A[] com seus valores ordenados fica: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      System.out.print(" | " + vetorA[accountant1]);
      if (accountant1 == (vetorA.length - 1)) {
        System.out.print(" |\n\n\n\n");
      }
    }
  }
}

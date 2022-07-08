public class Lista6_1 {
  public static void main(String[] args) {

    int[] vetorA = { 1, 9, 7, 6, 3, 88, 45, 12, 26, -5, 48, 96, 10, 0, 001 };

    int aux, accountant1, accountant2;

    System.out.print("\n\nVetor desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    for (accountant1 = 1; accountant1 < vetorA.length; accountant1++) {
      for (accountant2 = 0; accountant2 < (vetorA.length - 1); accountant2++) {
        if (vetorA[accountant2] < vetorA[accountant2 + 1]) {
          aux = vetorA[accountant2 + 1];
          vetorA[accountant2 + 1] = vetorA[accountant2];
          vetorA[accountant2] = aux;
        }
      }
    }

    System.out.print("\n\nVetor ordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }
  }
}

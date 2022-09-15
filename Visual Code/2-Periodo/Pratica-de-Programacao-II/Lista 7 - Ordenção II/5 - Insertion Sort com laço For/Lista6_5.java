public class Lista6_5 {
  public static void main(String[] args) {

    int[] vetorA = { 10, 8, 7, 0 };

    int accountant1, accountant2 = 0, key = 0, comp = 0, troca = 0;

    System.out.print("\n\nVetor A Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    for (accountant1 = 1; accountant1 < vetorA.length; accountant1++) {
      if (vetorA[accountant1] < vetorA[accountant1 - 1]) {
        for (accountant2 = 0; accountant2 < accountant1; accountant2++) {
          if (vetorA[accountant1] < vetorA[accountant2]) {
            key = vetorA[accountant2];
            vetorA[accountant2] = vetorA[accountant1];
            vetorA[accountant1] = key;
            troca++;
          }
          comp++;
        }
      }
    }

    System.out.print("\n\n\nVetor A Ordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }
    System.out.print("\n\n\n" + troca + "\n" + comp);
  }
}

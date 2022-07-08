public class Lista6_4 {
  public static void main(String[] args) {

    int[] vetorA = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
    int[] vetorB = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
    int[] vetorC = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };

    int accountant1, accountant2 = 0, trades = 0, compare = 0, key;

    //=-=-=-=-=-=-=-=-=-=-=-=   Vetor A   =-=-=-=-=-=-=-=-=-=-=-=

    System.out.print("\n\nVetor A Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    for (accountant1 = 1; accountant1 < vetorA.length; accountant1++) {
      accountant2 = accountant1 - 1;
      key = vetorA[accountant1];
      compare++;
      while (accountant2 >= 0 && key < vetorA[accountant2]) {
        vetorA[accountant2 + 1] = vetorA[accountant2];
        accountant2--;
      }
      if (accountant2 + 1 != accountant1) {
        vetorA[accountant2 + 1] = key;
        trades++;
      }
    }

    System.out.print("\n\n\nVetor A Ordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    System.out.print(
        "\n\n\nQuantidade de comparacoes: " + compare + "\n\nQuantidade de trocas: " + trades + "\n\n\n\n\n\n\n\n");

    //=-=-=-=-=-=-=-=-=-=-=-=   Vetor B   =-=-=-=-=-=-=-=-=-=-=-=
    compare = 0;
    trades = 0;

    System.out.print("\n\nVetor B Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorB.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorB[accountant1] + " | ");
    }

    for (accountant1 = 1; accountant1 < vetorB.length; accountant1++) {
      accountant2 = accountant1 - 1;
      key = vetorB[accountant1];
      compare++;
      while (accountant2 >= 0 && key < vetorB[accountant2]) {
        vetorB[accountant2 + 1] = vetorB[accountant2];
        accountant2--;
      }
      if (accountant2 + 1 != accountant1) {
        vetorB[accountant2 + 1] = key;
        trades++;
      }
    }

    System.out.print("\n\n\nVetor B Ordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorB.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorB[accountant1] + " | ");
    }

    System.out.print(
        "\n\n\nQuantidade de comparacoes: " + compare + "\n\nQuantidade de trocas: " + trades + "\n\n\n\n\n\n\n\n");

    //=-=-=-=-=-=-=-=-=-=-=-=   Vetor C   =-=-=-=-=-=-=-=-=-=-=-=
    compare = 0;
    trades = 0;

    System.out.print("\n\nVetor C Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorC.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorC[accountant1] + " | ");
    }

    for (accountant1 = 1; accountant1 < vetorC.length; accountant1++) {
      accountant2 = accountant1 - 1;
      key = vetorC[accountant1];
      compare++;
      while (accountant2 >= 0 && key < vetorC[accountant2]) {
        vetorC[accountant2 + 1] = vetorC[accountant2];
        accountant2--;
      }
      if (accountant2 + 1 != accountant1) {
        vetorC[accountant2 + 1] = key;
        trades++;
      }
    }

    System.out.print("\n\n\nVetor C Ordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorC.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorC[accountant1] + " | ");
    }

    System.out.print(
        "\n\n\nQuantidade de comparacoes: " + compare + "\n\nQuantidade de trocas: " + trades + "\n\n\n\n\n\n\n\n");
  }
}

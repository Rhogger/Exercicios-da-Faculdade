public class Lista6_3 {
  public static void main(String[] args) {

    int[] vetorA = { 7, 13, 3, 4, 20, 5, 8, 9, 12, 10, 8, 7, 5, 2, 2, 3, 6, 1 };
    int[] vetorB = { 20, 18, 14, 13, 12, 10, 9, 8, 7, 4, 3, 2, 1 };
    int[] vetorC = { 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20 };

    int accountant1, accountant2 = 0, aux, trades = 0, compare = 0, less;

    //=-=-=-=-=-=-=-=-=-=-=-=   Vetor A   =-=-=-=-=-=-=-=-=-=-=-=

    System.out.print("\n\nVetor A Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    for (accountant1 = 0; accountant1 < (vetorA.length - 1); accountant1++) {
      less = accountant1;
      for (accountant2 = accountant1 + 1; accountant2 < vetorA.length; accountant2++) {
        compare++;
        if (vetorA[less] > vetorA[accountant2]) {
          less = accountant2;
        }
      }
      if (less != accountant1) {
        aux = vetorA[accountant1];
        vetorA[accountant1] = vetorA[less];
        vetorA[less] = aux;
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

    System.out.print("\n\nVetor B Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorB.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorB[accountant1] + " | ");
    }

    for (accountant1 = 0; accountant1 < (vetorB.length - 1); accountant1++) {
      less = accountant1;
      for (accountant2 = accountant1 + 1; accountant2 < vetorB.length; accountant2++) {
        compare++;
        if (vetorB[less] > vetorB[accountant2]) {
          less = accountant2;
        }
      }
      if (less != accountant1) {
        aux = vetorB[accountant1];
        vetorB[accountant1] = vetorB[less];
        vetorB[less] = aux;
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

    System.out.print("\n\nVetor C Desordenado: \n\n");

    for (accountant1 = 0; accountant1 < vetorC.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorC[accountant1] + " | ");
    }

    for (accountant1 = 0; accountant1 < (vetorC.length - 1); accountant1++) {
      less = accountant1;
      for (accountant2 = accountant1 + 1; accountant2 < vetorC.length; accountant2++) {
        compare++;
        if (vetorC[less] > vetorC[accountant2]) {
          less = accountant2;
        }
      }
      if (less != accountant1) {
        aux = vetorC[accountant1];
        vetorC[accountant1] = vetorC[less];
        vetorC[less] = aux;
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

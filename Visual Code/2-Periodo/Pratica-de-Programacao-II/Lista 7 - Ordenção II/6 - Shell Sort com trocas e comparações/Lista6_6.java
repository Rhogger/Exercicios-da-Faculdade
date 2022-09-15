public class Lista6_6 {
  public static void main(String[] args) {

    int[] vetorA = { 45, 56, 12, 43, 95, 19, 8, 67 };
    int[] vetorB = { 8, 12, 19, 43, 45, 56, 67, 95 };
    int[] vetorC = { 95, 67, 56, 45, 43, 19, 12, 8 };
    int[] vetorD = { 19, 12, 8, 45, 43, 56, 67, 95 };

    int accountant1, accountant2, distance = 1, value, k = 3, compare = 0, trade = 0;

    //===========--------------=========== Vetor A ==========---------=============

    System.out.print("\n\n\nVetor A[] desordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    do {
      distance = k * distance + 1; //Regra para definir a distancia das comparações/trocas;
    } while (distance < vetorA.length);

    do {
      distance = distance / k; //Corta pela metade para poder comparar um N° por outro e arredonda por ser variável inteira;

      for (accountant1 = distance; accountant1 < vetorA.length; accountant1++) {
        value = vetorA[accountant1]; //Valor a ser verificado;
        accountant2 = accountant1 - distance; //Contador que irá pular as posições para comparar;
        compare++;
        while (accountant2 >= 0 && value < vetorA[accountant2]) { //Faz a troca;
          trade++;
          vetorA[accountant2 + distance] = vetorA[accountant2];
          accountant2 = accountant2 - distance;
        }
        vetorA[accountant2 + distance] = value;
      }
    } while (distance != 1);

    System.out.print("\n\n\nVetor A[] ordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorA.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorA[accountant1] + " | ");
    }

    System.out.print(
        "\n\nA quantidade de comparacoes foi: " + compare + "\n\nA quantidade de trocas foi: " + trade + "\n\n\n");

    compare = 0;
    trade = 0;
    distance = 1;

    //===========--------------=========== Vetor B ==========---------=============

    System.out.print("\n\n\nVetor B[] desordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorB.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorB[accountant1] + " | ");
    }

    do {
      distance = k * distance + 1; //Regra para definir a distancia das comparações/trocas;
    } while (distance < vetorB.length);

    do {
      distance = distance / k; //Corta pela metade para poder comparar um N° por outro e arredonda por ser variável inteira;

      for (accountant1 = distance; accountant1 < vetorB.length; accountant1++) {
        value = vetorB[accountant1]; //Valor a ser verificado;
        accountant2 = accountant1 - distance; //Contador que irá pular as posições para comparar;
        compare++;
        while (accountant2 >= 0 && value < vetorB[accountant2]) { //Faz a troca;
          trade++;
          vetorB[accountant2 + distance] = vetorB[accountant2];
          accountant2 = accountant2 - distance;
        }
        vetorB[accountant2 + distance] = value;
      }
    } while (distance != 1);

    System.out.print("\n\n\nVetor B[] ordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorB.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorB[accountant1] + " | ");
    }

    System.out.print(
        "\n\nA quantidade de comparacoes foi: " + compare + "\n\nA quantidade de trocas foi: " + trade + "\n\n\n");

    compare = 0;
    trade = 0;
    distance = 1;

    //===========--------------=========== Vetor C ==========---------=============

    System.out.print("\n\n\nVetor C[] desordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorC.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorC[accountant1] + " | ");
    }

    do {
      distance = k * distance + 1; //Regra para definir a distancia das comparações/trocas;
    } while (distance < vetorC.length);

    do {
      distance = distance / k; //Corta pela metade para poder comparar um N° por outro e arredonda por ser variável inteira;

      for (accountant1 = distance; accountant1 < vetorC.length; accountant1++) {
        value = vetorC[accountant1]; //Valor a ser verificado;
        accountant2 = accountant1 - distance; //Contador que irá pular as posições para comparar;
        compare++;
        while (accountant2 >= 0 && value < vetorC[accountant2]) { //Faz a troca;
          trade++;
          vetorC[accountant2 + distance] = vetorC[accountant2];
          accountant2 = accountant2 - distance;
        }
        vetorC[accountant2 + distance] = value;
      }
    } while (distance != 1);

    System.out.print("\n\n\nVetor C[] ordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorC.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorC[accountant1] + " | ");
    }

    System.out.print(
        "\n\nA quantidade de comparacoes foi: " + compare + "\n\nA quantidade de trocas foi: " + trade + "\n\n\n");

    compare = 0;
    trade = 0;
    distance = 1;

    //===========--------------=========== Vetor B ==========---------=============

    System.out.print("\n\n\nVetor D[] desordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorD.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorD[accountant1] + " | ");
    }

    do {
      distance = k * distance + 1; //Regra para definir a distancia das comparações/trocas;
    } while (distance < vetorD.length);

    do {
      distance = distance / k; //Corta pela metade para poder comparar um N° por outro e arredonda por ser variável inteira;

      for (accountant1 = distance; accountant1 < vetorD.length; accountant1++) {
        value = vetorD[accountant1]; //Valor a ser verificado;
        accountant2 = accountant1 - distance; //Contador que irá pular as posições para comparar;
        compare++;
        while (accountant2 >= 0 && value < vetorD[accountant2]) { //Faz a troca;
          trade++;
          vetorD[accountant2 + distance] = vetorD[accountant2];
          accountant2 = accountant2 - distance;
        }
        vetorD[accountant2 + distance] = value;
      }
    } while (distance != 1);

    System.out.print("\n\n\nVetor D[] ordenado: \n\n");
    for (accountant1 = 0; accountant1 < vetorD.length; accountant1++) {
      if (accountant1 == 0) {
        System.out.print("| ");
      }
      System.out.print(vetorD[accountant1] + " | ");
    }

    System.out.print(
        "\n\nA quantidade de comparacoes foi: " + compare + "\n\nA quantidade de trocas foi: " + trade + "\n\n\n");

    compare = 0;
    trade = 0;
    distance = 1;
  }
}

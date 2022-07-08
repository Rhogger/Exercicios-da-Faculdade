package Projeto;

import java.util.*;

public class BuscaBinaria2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int length = 0;

    //Declara o tamanho do vetor
    while (length < 3) {
      System.out.print("\n\nInsira o tamanho do vetor, sendo maior que 3: ");
      length = input.nextInt();
    }

    //Declaração de variaveis
    int[] vetor1 = new int[length];
    int[] vetor2 = new int[length];
    int inicio = 0, meio, fim = vetor1.length - 1, i = 0, encontrou = 0, num;

    //Entrada de Dados
    System.out.print("\n\nInsira valores para o vetor: \n\n");
    for (i = 0; i < vetor1.length; i++) {
      System.out.printf("\nPosicao %d : ", i);
      vetor1[i] = input.nextInt();
    }

    //Chama a Função mergeSort
    mergeSort(vetor1, vetor2, 0, vetor1.length - 1);

    //Impressão do Vetor Ordenado
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nVetor Ordenado: \n\n");
    for (i = 0; i < vetor1.length; i++) {
      if (i == 0) {
        System.out.print("| ");
      }
      System.out.print(vetor1[i] + " | ");
    }
    System.out.print("\n\n\n");

    //Realiza a busca binária 
    //Pede para Inserir o Numero que busca
    System.out.print("\n\nInsira o numero que deseja procurar: ");
    num = input.nextInt();
    meio = (inicio + fim) / 2;
    i = 0;
    inicio = meio;
    fim = meio;

    //Num pode estar somente no meio
    if (num == vetor1[meio]) {
      inicio = meio;
      fim = meio;
    }

    //Num pode estar na 1° metade, no meio e na 2° metade
    if (num <= vetor1[meio - 1] && num == vetor1[meio] && num >= vetor1[meio + 1]) {
      inicio = 0;
      fim = vetor1.length - 1;
    } else

    //Num pode estar na 1° metade e no meio
    if (num <= vetor1[meio - 1] && num == vetor1[meio]) {
      inicio = 0;
      fim = meio;
    } else

    //Num pode estar na 2° metade e no meio
    if (num == vetor1[meio] && num >= vetor1[meio + 1]) {
      inicio = meio;
      fim = vetor1.length - 1;
    } else

    //Num pode estar somente na 1° metade
    if (num < vetor1[meio]) {
      inicio = 0;
      fim = meio - 1;
    } else

    //Num pode estar somente na 2° metade 
    if (num > vetor1[meio]) {
      inicio = meio + 1;
      fim = vetor1.length - 1;
    }

    //Cria um Laço de repetição para saber quantos e quais numeros foram encontrados
    for (i = inicio; i <= fim; i++) {

      //Aqui identifica e imprime o valor e sua posição
      if (num == vetor1[i]) {
        System.out.printf("\n\nO valor (%d) buscado foi encontrado na posicao %d .\n\nReturn: 1\n\n", num, i);
        encontrou++;
      }
    }

    //Se não incrementar a variavel "encontrou", ele imprime que o valor não foi encontrado
    if (encontrou == 0) {
      System.out.printf("\n\nO valor (%d) buscado nao foi encontrado.\n\nReturn: -1\n\n", num);
    }
    System.out.print("\n\n\nInicio: " + inicio + "\nFIM: " + fim + "\nEncontrou: " + encontrou);
  }

  //Cria a Function mergeSort com os parâmetros (vetor1, vetor2, inicio, fim)
  private static void mergeSort(int[] vetor1, int[] vetor2, int inicio, int fim) {

    /*
    Declara as variaveis int inicio e fim para o algoritmo "saber" onde está o pivô;
    Se inicio for menor que o fim, ele cria a variavel meio;
    Em seguida, chama a Function mergeSort novamente com os parâmetros (vetor1, vetor2, inicio, meio)
    Para fazer a "divisão" do inicio do vetor até a metade;
    Depois chama de novo o mergeSort com os parâmetros (vetor1, vetor2, meio + 1, fim)
    Para fazer novamente a "divisão" da metade para o fim;
    */
    if (inicio < fim) {
      int meio = (inicio + fim) / 2;
      mergeSort(vetor1, vetor2, inicio, meio);
      mergeSort(vetor1, vetor2, meio + 1, fim);

      //Chama a Function inserir para realizar a ordenação por cada "divisão".
      inserir(vetor1, vetor2, inicio, meio, fim);
    }
  }

  //Cria a Function inserir com os parâmetros (vetor1, vetor2, inicio, meio, fim)
  private static void inserir(int[] vetor1, int[] vetor2, int inicio, int meio, int fim) {
    //Cria a variável CONTADORA (i) com a POSIÇÃO do inicio
    int i = inicio;

    /*Cria laço de repetição para realizar a ordenação do vetor do inicio ao fim (por "divisão");
    Enquanto o CONTADOR (i) estiver entre o inicio e o fim 
    O vetor2 vai receber os valores da mesma posição do vetor1.
    */
    for (i = inicio; i <= fim; i++)
      vetor2[i] = vetor1[i];

    //Declara as variáveis (J) como inicio e (K) como a 2° metade. 
    int j = inicio, k = meio + 1;

    //Cria outro laço de repetição para inserir os valores ordenamente.
    for (i = inicio; i <= fim; i++) {

      //Se a posição do vetor que está sendo percorrido for maior do que a 1° metade 
      //Vai inserir o valor do vetor2 em uma posição da 2° metade para o vetor1
      if (j > meio) {
        vetor1[i] = vetor2[k++];
      }

      //Se, na posição da 2° metade em que o vetor estiver sendo percorrido, for maior do que a posição do fim
      //Vai inserir o valor do vetor2 em uma posição do inicio até a metade para o vetor1
      else if (k > fim) {
        vetor1[i] = vetor2[j++];
      }

      //Se o valor do vetor2 na posição do inicio for menor que a o valor do vetor2 na 1° metade 
      //Vai inserir o valor do vetor2 em uma posição do inicio até a metade para o vetor1
      else if (vetor2[j] < vetor2[k]) {
        vetor1[i] = vetor2[j++];
      }

      //Se não satisfazer nenhuma dessas condições, ele atribui ao vetor1 o valor do vetor2 na 2° metade
      else {
        vetor1[i] = vetor2[k++];
      }
    }
  }
}

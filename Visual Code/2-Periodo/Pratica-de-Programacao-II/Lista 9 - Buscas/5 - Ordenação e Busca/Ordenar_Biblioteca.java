package Projeto;

import java.util.*;

public class Ordenar_Biblioteca {
  public static void main(String[] args) {

    //Declaração do Método de Leitura 
    Scanner input = new Scanner(System.in);

    //Declaração de Variáveis
    int[] vetor1 = new int[15];
    int[] vetor2 = new int[vetor1.length];
    int i = 0;

    //Entrada de Dados do Vetor Desordenado
    System.out.print("\n\nVetor Desordenado: \n\n");
    for (i = 0; i < vetor1.length; i++) {
      System.out.print("\nInsira um numero entre 1 e 1000. Posicao " + i + ": ");
      vetor1[i] = input.nextInt();

      //Enquanto o vetor for menor do que 1 ou maior que 1000, ele pede para inserir novamente.
      while (vetor1[i] < 1 || vetor1[i] > 1000) {
        System.out.print("\n\nNumero invalido!\n\n");
        System.out.print("\nInsira um numero entre 1 e 1000. Posicao " + i + ": ");
        vetor1[i] = input.nextInt();
      }
    }
    System.out.print("\n\n\nFim de Arquivo\n\n\n");

    //Chama a Function mergeSort
    mergeSort(vetor1, vetor2, 0, vetor1.length - 1);

    //Impressão do Vetor Ordenado
    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCodigos dos Livros: \n\n");

    //Dentro do FOR ele verifica quantos dígitos tem um elemento do vetor e insere os Zeros.  
    for (i = 0; i < vetor1.length; i++) {
      if (vetor1[i] < 10) {
        System.out.printf("| 000%d | \n", vetor1[i]);
      } else if (vetor1[i] > 9 && vetor1[i] < 100) {
        System.out.printf("| 00%d | \n", vetor1[i]);
      } else if (vetor1[i] > 10 && vetor1[i] < 1000) {
        System.out.printf("| 0%d | \n", vetor1[i]);
      } else {
        System.out.print("| " + vetor1[i] + " |\n");
      }
    }
    System.out.print("\n\n\n");
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

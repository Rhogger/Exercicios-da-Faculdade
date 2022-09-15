import java.util.*;

public class BuscaSequencial {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetor = { 9, 75, 77, 18, 48, 14, 2, 4, 91, 57, 56, 29, 22, 5, 8, 60, 62, 93, 97, 7, 49, 87, 81, 71, 38, 78,
        99, 19, 31, 67 };

    int key, aux = 0;

    for (int i = 0; i < vetor.length; i++) {
      if (i == 0) {
        System.out.print("\n\nApresentacao do Vetor: \n\n| ");
      }
      System.out.print(vetor[i] + " | ");
    }
    System.out.print("\n\n\nInsira o valor que deseja buscar: ");
    key = input.nextInt();

    for (int i = 0; i < vetor.length; i++) {
      if (key == vetor[i]) {
        System.out.printf("\n\nO Numero %d foi encontrado na posicao %d\n\n\n", vetor[i], i);
        aux++;
      }
    }
    if (aux == 0) {
      System.out.print("\n\nNão foi encontrado nenhum valor!\n\n\n");
    }
  }
}

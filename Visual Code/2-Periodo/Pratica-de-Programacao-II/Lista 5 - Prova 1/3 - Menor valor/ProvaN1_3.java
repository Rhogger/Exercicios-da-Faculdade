import java.util.Scanner;

public class ProvaN1_3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int length = 1, less = 0;

    System.out.println("\n\nCaso haja repeticao de um numero, a contagem ira parar.\n");
    System.out.print("Insira quantos numeros tem a lista: ");
    length = input.nextInt();

    int[] vetorA = new int[length];

    for (length = 0; length < vetorA.length; length++) {
      System.out.print("\nInsira um numero: ");
      vetorA[length] = input.nextInt();

      if (less == 0) {
        less = vetorA[length];
      } else if (vetorA[length] < less) {
        less = vetorA[length];
      }
    }

    System.out.println("\n\nO menor numero da lista e: " + less);
  }
}
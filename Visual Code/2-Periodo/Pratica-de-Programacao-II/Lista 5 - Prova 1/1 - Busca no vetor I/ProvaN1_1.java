import java.util.Scanner;

public class ProvaN1_1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int length = 1, aux = 0, valor;

    System.out.println("\n\nCaso haja repeticao de um numero, a contagem ira parar.\n");
    System.out.print("Insira quantos numeros tem a lista: ");
    length = input.nextInt();

    int[] vetorA = new int[length];

    for (length = 0; length < vetorA.length; length++) {
      System.out.print("\nInsira um numero: ");
      vetorA[length] = input.nextInt();
    }

    System.out.print("\n\nInsira o Numero que deseja procurar na lista: ");
    valor = input.nextInt();

    for (length = 0; length < vetorA.length; length++) {
      if (valor == vetorA[length]) {
        aux = 1;
      }
    }
    if (aux == 1) {
      System.out.println("\n\nO numero que procura pertence a lista!\n\n");
    } else {
      System.out.println("\n\nO numero que procura nao pertence a lista!\n\n");
    }
  }
}
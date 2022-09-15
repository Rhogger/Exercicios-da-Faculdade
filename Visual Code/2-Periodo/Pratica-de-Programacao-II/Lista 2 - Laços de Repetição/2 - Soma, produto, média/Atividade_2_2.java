import java.util.Scanner;

public class Atividade_2_2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float num_1 = 1, num_2 = 2, num_3 = 3, media, sum, multiplication, c = 1;

    System.out.println("\nInsira 3 valores para um conjunto, sera apresentado a soma, media e produto deles");
    System.out.println("Os valores deverao estar em ordem crescente, caso contrario o algoritmo encerrara.\n");
    while (num_1 <= num_2 && num_2 < num_3 || num_1 < num_2 && num_2 <= num_3) {
      sum = num_1 + num_2 + num_3;
      multiplication = num_1 * num_2 * num_3;
      media = sum / 3;
      if (c != 1) {
        System.out.printf("\nSoma = " + sum);
        System.out.printf("\nProduto = " + multiplication);
        System.out.printf("\nMedia = " + media);
      }
      c = c + 1;
      System.out.print("\n\n\n\nInsira o 1o valor: ");
      num_1 = sc.nextInt();
      System.out.print("\nInsira o 2o valor: ");
      num_2 = sc.nextInt();
      System.out.print("\nInsira o 3o valor: ");
      num_3 = sc.nextInt();
    }
    System.out.println("\n\nFim do programa!\n\n");
  }
}

import java.util.*;

public class PosicaoFibonacci {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num = 1, successor = 0, aux = 0, position;
    System.out.print("\n\nInsira a posicao do numero em Fibonacci que deseja saber: ");
    position = input.nextInt();
    System.out.print("\n\n");
    System.out.printf("\n\nRetorn: %d.\nRetorno com Sucesso!\n\n", CalcularPosicaoFibo(num, position, aux, successor));
  }

  public static int CalcularPosicaoFibo(int num,  , int aux, int successor) {

    System.out.printf("%d", num);

    if (position != 0) {
      System.out.print(",");
    } else {
      System.out.print("...");
      return 0;
    }

    successor = num + aux;
    aux = num;
    num = successor;
    position--;

    return CalcularPosicaoFibo(num, position, aux, successor);

  }
}

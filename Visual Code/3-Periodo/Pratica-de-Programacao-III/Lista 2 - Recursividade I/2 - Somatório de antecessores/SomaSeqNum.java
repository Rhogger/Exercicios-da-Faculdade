import java.util.*;

public class SomaSeqNum {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("\n\nInsira um valor e receba a soma de todos seus antecessores: ");
    num = input.nextInt();

    System.out.printf("\n\nA soma total dos numeros eh: %d\n\n", CalcularAntecessores(num));
  }

  public static int CalcularAntecessores(int num) {

    if (num == 0) {
      return 0;
    }

    return num + CalcularAntecessores(num - 1);
  }
}

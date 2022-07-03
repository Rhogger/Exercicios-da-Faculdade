import java.util.Scanner;

public class CS2A3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int var;

    System.out.print("\nInsira um valor para o programa definir se ele e par ou impar: ");
    var = sc.nextInt();
    if (var % 2 == 0) {
      System.out.print("\nO numero inserido e par!\n");
    } else {
      System.out.print("\n O numero inserido e impar!\n");
    }
  }
}

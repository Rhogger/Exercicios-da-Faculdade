import java.util.Scanner;

public class COND2 {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    double saldo, reajuste;

    System.out.print("\nInsira o saldo da sua conta: ");
    saldo = leia.nextDouble();
    if (saldo <= 0) {
      System.out.print("\nVoce esta sem saldo!\n");
    } else {
      reajuste = saldo * 1.05;
      System.out.printf("\nSeu reajuste e R$ " + reajuste + " ,do saldo de R$ " + saldo + "\n");
    }
  }
}

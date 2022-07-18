package lista1.src.app;

import lista1.src.Operacoes.ContaCorrente;
import java.util.Scanner;

public class Exercicio {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    ContaCorrente novaConta = new ContaCorrente();

    System.out.println();
    System.out.print("Insira o seu saldo inicial: ");
    novaConta.definirSaldoInicial(novaConta.saldo);

    System.out.printf("\n\nSaldo: %.2f \n\n", novaConta.saldo);

    System.out.print("Insira a quantia que deseja depositar: ");
    novaConta.sacar(novaConta.saldo);
    System.out.print("\n\n");

    novaConta.depositar(novaConta.saldo);
    System.out.print("\n\n");

    System.out.printf("\n\nSaldo: %.2f \n\n", novaConta.saldo);

    novaConta.sacar(novaConta.saldo);
    System.out.print("\n\n");

    System.out.printf("\n\nSaldo: %.2f \n\n", novaConta.saldo);

  }
}
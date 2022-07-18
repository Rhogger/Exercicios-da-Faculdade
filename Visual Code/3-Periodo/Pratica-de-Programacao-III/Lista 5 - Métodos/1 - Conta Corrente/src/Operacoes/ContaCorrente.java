package lista1.src.Operacoes;

import java.util.Scanner;

public class ContaCorrente {

  public float saldo = 0;

  public void definirSaldoInicial(float saldo) {

    this.saldo = saldo;

  }

  public float depositar(float saldo) {

    float valor;
    this.valor = valor;

    saldo = saldo + valor;

    return saldo;
  }

  public float sacar(float saldo) {

    float valor;
    boolean condicao = false;

    System.out.print("Insira a quantia que deseja sacar: ");
    valor = input.nextFloat();

    while (condicao == false) {

      if (valor <= saldo) {
        if (valor < 0.01) {

          System.out.print("\n\nNao eh possivel realizar saques menores que 1 centavo.");

          System.out.print("\n\nInsira novamente o valor a sacar: ");
          valor = input.nextFloat();

        } else {

          saldo = saldo - valor;
          condicao = true;

        }
      } else if (valor > saldo) {

        System.out.print("\n\nNao eh possivel realizar saques maior que o seu saldo bancario.");

        System.out.print("\n\nInsira novamente o valor a sacar: ");
        valor = input.nextFloat();
      }

    }

    return saldo;

  }
}

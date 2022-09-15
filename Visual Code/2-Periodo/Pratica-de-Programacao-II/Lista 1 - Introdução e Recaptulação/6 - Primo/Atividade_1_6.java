import java.util.Scanner;

public class Atividade_1_6 {
  public static void main(String[] args) {

    // Ler um número inteiro e escrever se ele é primo ou não.

    Scanner sc = new Scanner(System.in);

    int valor, prime = 0, i = 1;

    System.out.print("\nInsira um valor e descubra se e primo ou nao: ");
    valor = sc.nextInt();
    if (valor < 0) {
      System.out.print("\nNumeros negativos nao sao primos!\n");
    } else if (valor == 0) {
      System.out.print("\nZero nao e primo!\n");
    } else {
      while (i <= valor) {
        if (valor % i == 0) {
          prime = prime + 1;
        }
        i++;
      }
    }

    if (prime == 2) {
      System.out.print("\nO numero inserido e primo.\n");
    } else {
      System.out.print("\nO numero inserido nao e primo.\n");
    }
  }
}

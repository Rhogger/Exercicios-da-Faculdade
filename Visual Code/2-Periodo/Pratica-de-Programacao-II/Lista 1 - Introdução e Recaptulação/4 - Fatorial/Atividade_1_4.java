import java.util.Scanner;

public class Atividade_1_4 {
  public static void main(String[] args) {

    // Calcular o fatorial de um número inteiro lido do terminal.

    Scanner sc = new Scanner(System.in);

    int factorial = 1, num, soma = 1;

    System.out.print("\nInsira um valor para ser calculado o fatorial: ");
    num = sc.nextInt();
    if (num == 0) {
      soma = 1;
    } else if (num < 0) {
      System.out.print("Insira somente números positivos!\n");
    } else {
      while (factorial != num) {

        factorial++;
        soma = soma * factorial;
      }
    }
    System.out.printf("\n" + num + "! = " + soma + "\n");
  }
}

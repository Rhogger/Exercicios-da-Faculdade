import java.util.Scanner;

public class Atividade_2_7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valor = 1, more = 1, less = 1;

    System.out.print(
        "\n\nInsira valores para compor um conjunto. Ao fim do algoritmo, sera revelado o maior e menor valor inserido: \n\n");
    while (valor != 0) {
      if (valor > more) {
        more = valor;
      } else if (valor < less) {
        less = valor;
      }
      System.out.print("\nInsira um valor positivo e inteiro: ");
      valor = sc.nextInt();
      if (valor < 0) {
        while (valor < 0) {
          System.out.print("\nInsira novamente o valor: ");
          valor = sc.nextInt();
        }
      } else if (valor == 0) {
        System.out.print("\n\n!!!  Algoritmo encerrado  !!!\n\n");
      }
    }
    System.out.printf("\n\nO maior valor e : " + more + "\n\nO menor valor e: " + less + "\n\n");
  }
}

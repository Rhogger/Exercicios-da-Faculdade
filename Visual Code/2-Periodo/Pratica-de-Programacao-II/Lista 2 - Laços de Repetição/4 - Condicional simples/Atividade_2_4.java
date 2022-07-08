import java.util.Scanner;

public class Atividade_2_4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valor;

    System.out.print(
        "\n\nInsira numeros de 0 a 100 e o algoritmo ira identificar em que conjuntos eles fazem partes.\n\nConjunto: [0-25], [26-50], [51-75] e [76-100]\n\n!!Para encerrar o algoritmo, digite um numero negativo!!\n\nInsira um valor: ");
    valor = sc.nextInt();
    while (valor >= 0) {
      if (valor >= 0 && valor <= 25) {
        System.out.print("\n!!! O valor inserido esta dentro do conjunto [0-25] !!!\n\n");
      } else if (valor >= 26 && valor <= 50) {
        System.out.print("\n!!! O valor inserido esta dentro do conjunto [26-50] !!!\n\n");
      } else if (valor >= 51 && valor <= 75) {
        System.out.print("\n!!! O valor inserido esta dentro do conjunto [51-75] !!!\n\n");
      } else if (valor >= 76 && valor <= 100) {
        System.out.print("\n!!! O valor inserido esta dentro do conjunto [76-100] !!!\n\n");
      } else if (valor > 100) {
        System.out.print("\n!!! O valor inserido nao esta dentro de nenhum conjunto !!!\n\n");
      }
      System.out.print("insira novamente um valor: ");
      valor = sc.nextInt();
    }
    System.out.print("\n\nPrograma finalizado!");
  }
}

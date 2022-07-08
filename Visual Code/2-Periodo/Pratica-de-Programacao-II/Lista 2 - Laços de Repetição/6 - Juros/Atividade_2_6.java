import java.util.Scanner;

public class Atividade_2_6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double fees = 0.0, portion_valor, debt;

    System.out.print("\nInsira o valor da sua divida: ");
    debt = sc.nextInt();
    if (debt < 1) {
      System.out.print("\n\n!! O valor deve ser maior que 0 !!\n\n");
    } else {
      System.out.print(
          "\n\nSiga a tabela informativa de juros/parcela: \n\n.------------------------------------------.\n|  Quantidades de parcelas  |  % de juros  |\n|             1             |       0      |\n|             3             |      10      |\n|             6             |      15      |\n|             9             |      20      |\n|             12            |      25      |\n.------------------------------------------.\n\n\n");

      System.out.print(
          "Apresentacao da sua divida: \n\n.------------------------------------------------------------------------------------------.\n|  Valor da divida  |  Juros por parcela  |  Quantidades de parcelas  |  Valor da parcela  |\n|------------------------------------------------------------------------------------------|\n");

      for (int i = 0; i <= 12; i++) {
        if (i == 1) {
          portion_valor = (debt);
          System.out.printf("        %.2f              %.2f                        1                    %.2f\n", debt,
              fees, portion_valor);
        } else if (i == 3) {
          fees = (debt * 0.1);
          debt = (debt + fees);
          portion_valor = (debt / 3);
          System.out.printf("        %.2f              %.2f                      3                    %.2f\n", debt,
              fees, portion_valor);
        } else if (i == 6) {
          fees = (debt * 0.15);
          debt = (debt + fees);
          portion_valor = (debt / 6);

          System.out.printf("        %.2f              %.2f                      6                    %.2f\n", debt,
              fees, portion_valor);
        } else if (i == 9) {
          fees = (debt * 0.2);
          debt = (debt + fees);
          portion_valor = (debt / 9);

          System.out.printf("        %.2f              %.2f                      9                    %.2f\n", debt,
              fees, portion_valor);
        } else if (i == 12) {
          fees = (debt * 0.25);
          debt = (debt + fees);
          portion_valor = (debt / 12);

          System.out.printf("        %.2f              %.2f                     12                    %.2f\n", debt,
              fees, portion_valor);
        }
      }
      System.out
          .print(".------------------------------------------------------------------------------------------.\n");
    }
  }
}
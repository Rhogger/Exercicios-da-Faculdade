import java.util.Scanner;

public class Atividade_2_3 {
  public static void main(String[] args) {

    //Declaração do Scanner
    Scanner sc = new Scanner(System.in);

    //Declaração de variáveis
    int term_position, skip, i;
    float terms;

    // Campo informátivo de valores da PA
    System.out.print("\n\n------- Campo para informar as variaveis da PA -------\n\n");
    System.out.print("\nInsira o 1o termo: ");
    terms = sc.nextFloat();
    System.out.print("\nInsira a posicao do termo: ");
    term_position = sc.nextInt();
    System.out.print("\nInsira a razao: ");
    skip = sc.nextInt();

    //Apresentação dos termos antecessores ao que foi inserido em "term_position"
    System.out.print("\n\n\nOs primeiros termos da PA sao: \n");
    for (i = 1; i <= term_position;) {
      System.out.printf("\n" + terms);
      i = i + skip;
      if (skip > 0) {
        terms = terms + skip;
      } else {
        terms = terms - skip;
      }
    }

    // Campo informátivo de valores da PG
    System.out.print("\n\n------- Campo para informar as variaveis da PG -------\n\n");
    System.out.print("\nInsira o 1o termo: ");
    terms = sc.nextFloat();
    System.out.print("\nInsira a quantidade total de termos: ");
    term_position = sc.nextInt();
    System.out.print("\nInsira a razao: ");
    skip = sc.nextInt();

    //Apresentação de todos os termos da PG
    System.out.print("\n\n\nOs termos da PG sao: \n");
    for (i = 1; i <= term_position; i++) {
      System.out.printf("\n" + terms);
      terms = terms * skip;
    }
  }
}

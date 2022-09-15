import java.util.Scanner;

public class N2A1 {
  public static void main(String[] args) {

    String nome;
    float nota1, nota2, media;

    //Scan
    Scanner leia = new Scanner(System.in);

    //processamento
    System.out.print("\nDigite o nome do aluno: ");
    nome = leia.nextLine();
    System.out.print("\nDigite o valor da primeira nota: ");
    nota1 = leia.nextFloat();
    System.out.print("\nDigite o valor da segunda nota: ");
    nota2 = leia.nextFloat();
    media = (nota1 + nota2) / 2;
    System.out.printf("\nA media do aluno foi: %f \n", media);
  }
}

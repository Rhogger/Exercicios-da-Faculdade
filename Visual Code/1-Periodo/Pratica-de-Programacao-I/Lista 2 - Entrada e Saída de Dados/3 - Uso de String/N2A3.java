import java.util.Scanner;

public class N2A3 {
  public static void main(String[] args) {

    String nome, cidade;
    int idade;

    Scanner leia = new Scanner(System.in);

    System.out.print("\nInforme seu nome: ");
    nome = leia.nextLine();
    System.out.print("\n" + "Informe sua cidade onde nasceu: ");
    cidade = leia.nextLine();
    System.out.print("\nInforme sua idade: ");
    idade = leia.nextInt();
    System.out.printf("\nSeja bem vindo %s, de %d anos de %s \n", nome, idade, cidade, "\n");

  }
}

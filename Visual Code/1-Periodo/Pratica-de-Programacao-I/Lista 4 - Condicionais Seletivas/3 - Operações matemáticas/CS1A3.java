import java.util.Scanner;

public class CS1A3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int choice, A, B, result;

    System.out.print("\nInsira dois valores para serem realizado uma operacao: \n");
    A = scan.nextInt();
    B = scan.nextInt();
    System.out.print("\nEscolhas: \n.-------------------------------.\n|Codigo     Operacao \t        |"
        + "\n|  1 \t     Soma \t        |\n" + "|  2 \t     Subtracao \t        |\n" + "|  3 \t     Multiplicacao \t|\n"
        + "|  4 \t     Divisao \t        |\n");
    System.out.print(".-------------------------------.\n" + "\n");
    System.out.print("Insira o codigo desejado: ");
    choice = scan.nextInt();
    System.out.print("\n");
    switch (choice) {
      case 1:
        result = A + B;
        System.out.print("A soma do primeiro e do segundo valor resultou em: " + result + "\n");
        break;
      case 2:
        result = A - B;
        System.out.print("A substracao do primeiro e do segundo valor resultou em: " + result + "\n");
        break;
      case 3:
        result = A * B;
        System.out.print("A multiplicacao do primeiro e do segundo valor resultou em: " + result + "\n");
        break;
      case 4:
        result = A / B;
        System.out.print("A divisao do primeiro e do segundo valor resultou em: " + result + "\n");
        break;
      default:
        System.out.print("Nao foi possivel identificar esse codigo!");
    }
  }
}

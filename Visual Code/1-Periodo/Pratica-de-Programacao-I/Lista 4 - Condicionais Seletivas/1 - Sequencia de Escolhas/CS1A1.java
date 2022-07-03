import java.util.Scanner;

public class CS1A1 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Float A, B, result;
    int choice;

    System.out.print(
        "\nEscolhas: \n.-----------------------------------------------.\n|Codigo \t Operacao \t                |"
            + "\n|  1 \t Media entre os dois numeros \t        |\n"
            + "|  2 \t Diferenca do maior pelo menor \t        |\n" + "|  3 \t Produto entre os numeros digitados \t|\n"
            + "|  4 \t Divisao do primeiro pelo segundo \t|\n");
    System.out.print(".-----------------------------------------------.\n");
    System.out.print("\nInsira o codigo desejado: ");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        System.out.printf("Insira dois valores: \n");
        A = scan.nextFloat();
        B = scan.nextFloat();
        result = (A + B) / 2;
        System.out.printf("A media entre os dois numeros e: \n" + result + "\n");
        break;
      case 2:
        System.out.print("Insira dois valores: \n");
        A = scan.nextFloat();
        B = scan.nextFloat();
        if (B > A) {
          result = B - A;
          System.out.printf("A diferença dos valores e: " + result + "\n");
        } else {
          result = A - B;
          System.out.printf("A diferença dos valores e: " + result + "\n");
        }
        break;
      case 3:
        System.out.print("Insira dois valores: \n");
        A = scan.nextFloat();
        B = scan.nextFloat();
        result = A * B;
        System.out.printf("O produto e: " + result + "\n");
        break;
      case 4:
        System.out.print("Insira dois valores: \n");
        A = scan.nextFloat();
        B = scan.nextFloat();
        result = A / B;
        System.out.printf("O resultado e: " + result + "\n");
        break;
      default:
        System.out.print("Não foi possivel realizar nenhuma operacao!\n");
    }
  }
}

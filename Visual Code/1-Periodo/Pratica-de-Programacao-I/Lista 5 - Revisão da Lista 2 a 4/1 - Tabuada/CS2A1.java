import java.util.Scanner;

public class CS2A1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int var, choice, result;
    int aux = 1;

    System.out.print("\nInsira o codigo para realizar a tabuada de soma(1) e multiplicacao(2):");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        System.out.print("\nInsira o valor para ser feita a tabuada de Soma: ");
        var = scan.nextInt();
        result = var + aux;
        System.out.printf("\n" + var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        result = var + aux;
        System.out.printf(var + " + " + aux++ + " = " + result + "\n");
        break;
      case 2:
        System.out.print("\nInsira o valor para ser feita a tabuada de Multiplicacao: ");
        var = scan.nextInt();
        result = var * aux;
        System.out.printf("\n" + var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        result = var * aux;
        System.out.printf(var + " x " + aux++ + " = " + result + "\n");
        break;
      default:
        System.out.print("Esse codigo e invalido!");
    }
  }
}

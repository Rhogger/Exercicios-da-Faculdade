import java.util.Scanner;

public class CS2A2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Float h, b, A;

    System.out.print("\nPara calcular a area de um triangulo preciso da altura e comprimento da base do triangulo.\n");
    System.out.print("\nInforme a altura desse triangulo: ");
    h = scan.nextFloat();
    System.out.print("\nInforme o comprimento desse triangulo: ");
    b = scan.nextFloat();
    A = (b * h) / 2;
    System.out.printf("\nA area do triangulo e: " + A + "\n");
  }
}

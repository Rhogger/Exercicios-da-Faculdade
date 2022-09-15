import java.util.Scanner;

public class COND1 {

  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    float nota;

    System.out.print("\nQual a nota que o aluno tirou?\n" + "\tNota: ");
    nota = leia.nextFloat();
    if (nota < 0 || nota > 100) {
      System.out.print("\nEssas notas sao incompativeis com as requeridas!\n");
    } else if (nota >= 0 && nota <= 20) {
      System.out.println("\nO aluno foi reprovado!\n");
    } else if (nota > 20 && nota < 60) {
      System.out.println("\nO aluno esta em recuperacao!\n");
    } else if (nota >= 60) {
      System.out.println("\nO aluno foi aprovado!\n");
    }
  }
}
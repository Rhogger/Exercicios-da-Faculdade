import java.util.*;

public class Matriz_Aluno_Prova {
  public static void main(String[] args) {

    Random random = new Random();
    //Scanner input = new Scanner(System.in);
    int matrix[][] = new int[10][3];
    int less = 10, test = 0;

    System.out.print("\nInsira as notas de cada aluno, em cada prova no sistema.\n\n");

    for (int l = 0; l < 10; l++) {
      for (int c = 0; c < 3; c++) {
        //System.out.printf("\n\nInsira a nota do Aluno %d da prova %d : ", l, c);
        matrix[l][c] = random.nextInt(11);
        //matrix[l][c] = input.nextInt();
      }
    }

    System.out.print("        |    Nota 1     |     Nota 2    |     Nota 3    |");
    for (int l = 0; l < 10; l++) {
      System.out.print("\nAluno " + l + " |");
      for (int c = 0; c < 3; c++) {
        System.out.print("\t" + matrix[l][c] + "\t|");
      }
    }

    System.out.println("\n\n\n");

    for (int l = 0; l < 10; l++) {
      for (int c = 0; c < 3; c++) {
        if (matrix[l][c] < less) {
          test = c + 1;
          less = matrix[l][c];
        }
      }
      System.out.printf("\nO Aluno %d esta com a menor nota na Prova %d", l, test);
      less = 10;
    }

    System.out.println("\n\n");
  }
}

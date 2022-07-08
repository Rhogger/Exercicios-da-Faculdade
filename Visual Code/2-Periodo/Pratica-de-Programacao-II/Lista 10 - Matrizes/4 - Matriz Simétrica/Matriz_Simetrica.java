import java.util.*;

public class Matriz_Simetrica {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int matrix[][] = new int[8][8];
    int trans = 0;

    System.out.print("\nInsira valor para a Matriz:\n\n");
    System.out.print("\nMatriz Original:\n\n");

    for (int l = 0; l < 8; l++) {
      for (int c = 0; c < 8; c++) {
        //System.out.printf("[%d][%d]\n", l, c);
        //matrix[l][c]= input.nextInt();
        matrix[l][c] = random.nextInt(21);
        System.out.printf("\t" + matrix[l][c]);
      }
      System.out.println(" ");
    }

    System.out.print("\n\n\n\nMatriz Transposta:\n\n");

    for (int c = 0; c < 8; c++) {
      for (int l = 0; l < 8; l++) {
        System.out.printf("\t" + matrix[l][c]);
        if (matrix[l][c] != matrix[c][l]) {
          trans++;
        }
      }
      System.out.println(" ");
    }

    if (trans != 0) {
      System.out.print("\n\n\nEssa matriz nao e sitemtrica!\n\n\n");
    } else {
      System.out.print("\n\n\nEssa matriz e sitemtrica!\n\n\n");
    }
  }
}

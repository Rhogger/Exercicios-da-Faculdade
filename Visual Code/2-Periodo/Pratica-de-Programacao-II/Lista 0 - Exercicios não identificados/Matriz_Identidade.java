import java.util.*;

public class Matriz_Identidade{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[][] matrix = new int[4][4];

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix.length; column++) {
        if (row == column) {
          matrix[row][column] = 1;
        } else {
          matrix[row][column] = 0;
        }
      }
    }

    System.out.print("\n\nMatriz 4x4: \n\n");
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix.length; column++) {
        System.out.print(matrix[row][column] + "\t");
      }
      System.out.print("\n");
    }
  }
}

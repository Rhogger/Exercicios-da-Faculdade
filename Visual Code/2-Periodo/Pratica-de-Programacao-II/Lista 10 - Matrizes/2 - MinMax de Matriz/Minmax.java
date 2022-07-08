import java.util.*;
import java.text.DecimalFormat;

public class Minmax {
  public static void main(String[] args) {

    //Scanner input = new Scanner(System.in);
    Random random = new Random();
    DecimalFormat decimal = new DecimalFormat("0.00");
    float matrix[][] = new float[4][7];
    int auxL = 0, auxC = 0;
    float min = 1, minmax = 0;

    System.out.print("\nInsira valor para a Matriz:\n\n");
    for (int l = 0; l < 4; l++) {
      for (int c = 0; c < 7; c++) {
        //System.out.printf("[%d][%d]\n", l, c);
        //matrix[l][c]= input.nextInt();
        matrix[l][c] = random.nextFloat();
        System.out.printf("\t" + decimal.format(matrix[l][c]));
      }
      System.out.println(" ");
    }

    System.out.print("\n\n");

    for (int l = 0; l < 4; l++) {
      for (int c = 0; c < 7; c++) {
        System.out.printf("\t", decimal.format(matrix[l][c]));
        if (min > matrix[l][c]) {
          min = matrix[l][c];
          auxL = l;
        }
      }
    }

    for (int l = auxL; l <= auxL; l++) {
      for (int c = 0; c < 7; c++) {
        if (minmax < matrix[l][c]) {
          auxC = c;
          minmax = matrix[auxL][auxC];
        }
      }
    }

    System.out.printf(
        "\nO MINMAX dessa matriz se encontra na: \nLinha: %d\nColuna: %d\nSendo o valor do MINMAX: %.2f\n\n", auxL,
        auxC, minmax);
  }
}

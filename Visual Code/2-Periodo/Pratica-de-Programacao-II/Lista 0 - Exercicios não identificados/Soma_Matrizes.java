public class Soma_Matrizes {
  public static void main(String[] args) {

    int A[][] = new int[10][3], B[][] = new int[10][3], C[][] = new int[10][3];

    for (int row = 0; row < 10; row++) {
      for (int column = 0; column < 3; column++) {
        if (row % 2 == 0) {
          A[row][column] = 0;
          B[row][column] = 3;
          C[row][column] = 7;
        } else {
          A[row][column] = 1;
          B[row][column] = -2;
          C[row][column] = 0;
        }
      }
    }

    System.out.print("\n\n\n\nMatriz A (10x3): \n\n");
    for (int row = 0; row < 10; row++) {
      for (int column = 0; column < 3; column++) {
        System.out.print(A[row][column] + "\t");
      }
      System.out.print("\n");
    }

    System.out.print("\n\n\n\nMatriz B (10x3): \n\n");
    for (int row = 0; row < 10; row++) {
      for (int column = 0; column < 3; column++) {
        System.out.print(B[row][column] + "\t");
      }
      System.out.print("\n");
    }

    System.out.print("\n\n\n\nMatriz C (10x3): \n\n");
    for (int row = 0; row < 10; row++) {
      for (int column = 0; column < 3; column++) {
        System.out.print(C[row][column] + "\t");
      }
      System.out.print("\n");
    }

    System.out.print("\n\n\n\nSoma das Matrizes (10x3): \n\n");
    for (int row = 0; row < 10; row++) {
      for (int column = 0; column < 3; column++) {
        C[row][column] = A[row][column] + B[row][column] + C[row][column];
        System.out.print(C[row][column] + "\t");
      }
      System.out.print("\n");
    }
  }
}

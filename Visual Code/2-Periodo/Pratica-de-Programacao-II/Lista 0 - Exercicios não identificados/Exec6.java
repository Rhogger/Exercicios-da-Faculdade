public class Exec6 {
  public static void main(String[] args) {

    int matrix1[][] = new int[5][7];
    int matrix2[][] = new int[6][6];

    System.out.print("\nMatriz 1:\n\n");

    for (int l = 0; l < 5; l++) {
      for (int c = 0; c < 7; c++) {
        if (l == 0 || l == 4 || c == 0 || c == 6) {
          matrix1[l][c] = 1;
        } else {
          matrix1[l][c] = 2;
        }
        System.out.print("\t" + matrix1[l][c]);
      }
      System.out.println(" ");
    }

    System.out.print("\n\n\n\nMatriz 2:\n\n");

    for (int l = 0; l < 6; l++) {
      for (int c = 0; c < 6; c++) {
        if (l == c) {
          matrix2[l][c] = 1;
        } else if (l + c == 5) {
          matrix2[l][c] = 2;
        } else {
          matrix2[l][c] = 3;
        }
        System.out.print("\t" + matrix2[l][c]);
      }
      System.out.println(" ");
    }

  }
}

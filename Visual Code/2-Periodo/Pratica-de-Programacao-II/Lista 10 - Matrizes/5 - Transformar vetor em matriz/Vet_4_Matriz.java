import java.util.*;

public class Vet_4_Matriz {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int vetor[] = new int[18];
    int matrix[][] = new int[3][6];
    int i = 0;

    System.out.print("\nInsira os valores:\n\n");
    System.out.print("\nVetor :\n\n");

    for (i = 0; i < 18; i++) {
      //System.out.printf("[%d][%d]\n", l, c);
      //matrix[l][c]= input.nextInt();
      vetor[i] = random.nextInt(101);
      System.out.printf("\t" + vetor[i]);
    }

    i = 0;
    System.out.print("\nMatriz :\n\n");

    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 6; c++) {
        matrix[l][c] = vetor[i];
        System.out.printf("\t" + matrix[l][c]);
        i++;
      }
      System.out.println(" ");
    }
  }
}

import java.util.Scanner;

public class Atividade_3_6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[10];

    int accountant, less = 0, equals = 0;
    double more = 0;

    System.out.print("\n\nVetor A[] : \n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      System.out.print("\nA[" + accountant + "] : ");
      vetorA[accountant] = sc.nextInt();
      if (vetorA[accountant] < 15) {
        less = vetorA[accountant] + less;
      } else if (vetorA[accountant] == 15) {
        equals = equals + 1;
      } else if (vetorA[accountant] > 15) {
        more = more + vetorA[accountant];
      }
    }
    more = more / 10;
    System.out.println("\nNo Vetor A[] : ");
    System.out.println("\nA soma dos menores que 15 = " + less);
    System.out.println("\nOs elementos iguais a 15 = " + equals);
    System.out.printf("\nA media dos maiores que 15 = %.2f\n\n", more);
  }
}

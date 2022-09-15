import java.util.Scanner;

public class Atividade_4_3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] vetorA = new int[20];
    int[] vetorB = new int[20];
    char[] vetorC = new char[4];
    double[] vetorD = new double[20];

    int accountant;
    double operation = 0;
    char op = 0;

    System.out.print("\n\nInsira valores para os vetores A[] e B[] : \n");
    for (accountant = 0; accountant < vetorA.length; accountant++) {
      if (op == 4) {
        op = 0;
      }
      System.out.print("\nA[" + accountant + "] = ");
      vetorA[accountant] = input.nextInt();
      System.out.print("\nB[" + accountant + "] = ");
      vetorB[accountant] = input.nextInt();
      System.out.print("\n\nInsira a operacao desejada ( + , - , / , * ) : ");
      input.nextLine();
      vetorC[op] = input.next().charAt(0);

      if (vetorC[op] == '+') {
        operation = vetorA[accountant] + vetorB[accountant];
      } else if (vetorC[op] == '-') {
        operation = vetorA[accountant] - vetorB[accountant];
      } else if (vetorC[op] == '*') {
        operation = vetorA[accountant] * vetorB[accountant];
      } else if (vetorC[op] == '/' && vetorB[accountant] != 0) {
        operation = vetorA[accountant] / vetorB[accountant];
      } else if (vetorC[op] == '/' && vetorB[accountant] == 0) {
        System.out.println("\nCaractere invalido, insira novamente!\n");
      }
      vetorD[accountant] = operation;
      if (vetorC[op] == '/' && vetorB[accountant] == 0) {
        System.out.print("\nImpossivel dividir por 0!\n");
      } else {
        System.out.printf("\nRESULTADO: %d %c %d = %2f\n\n", vetorA[accountant], vetorC[op], vetorB[accountant],
            vetorD[accountant]);
      }
      System.out.println("\n\n");

      if (op < 4) {
        op++;
      }
    }
    input.close();
  }
}

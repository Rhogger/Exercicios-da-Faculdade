import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int matrixA[][] = new int[3][3];

		System.out.println("Insira os valores para a matriz A[] : ");
		System.out.println();

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA.length; j++) {
				System.out.printf("Matrix A[%d] = ", i);
				matrixA[i][j] = input.nextInt();
			}
		}

		int odd = 0, pairs = 0;

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA.length; j++) {
				if (matrixA[i][j] % 2 == 0) {
					pairs++;
				} else {
					odd++;
				}
			}
		}

		System.out.println();
		System.out.printf("Essa matriz possui %d pares e %d ímpares!", pairs, odd);
	}

}

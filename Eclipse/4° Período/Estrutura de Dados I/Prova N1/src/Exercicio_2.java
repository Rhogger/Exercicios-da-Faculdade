import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetorA[] = new int[6];
		int vetorB[] = new int[6];
		int vetorC[] = new int[12];

		System.out.println("Insira os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Vetor A[%d] = ", i);
			vetorA[i] = input.nextInt();
		}

		System.out.println();
		System.out.println();
		System.out.println("Insira os valores do vetor B[] : ");
		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Vetor B[%d] = ", i);
			vetorB[i] = input.nextInt();
		}

		int j = 0;

		for (int i = 0; i < 12; i++) {
			if (i < 6) {
				vetorC[i] = vetorA[i];
			} else {
				vetorC[i] = vetorB[j];
				j++;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Os valores do vetor C[] : ");
		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			System.out.printf("Vetor C[%d] = %d", i, vetorC[i]);
			System.out.println();
		}

	}

}

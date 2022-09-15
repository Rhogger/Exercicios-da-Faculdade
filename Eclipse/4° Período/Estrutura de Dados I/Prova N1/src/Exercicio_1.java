import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetorA[] = new int[10];
		int elementsEquals12 = 0;
		float elementsLower12 = 0;
		int elementsHigher12 = 0;

		System.out.println("Insira os valores para o vetor A [] : ");
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("A [%d] = ", i);
			vetorA[i] = input.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 12) {
				elementsHigher12 += vetorA[i];
			} else if (vetorA[i] == 12) {
				elementsEquals12++;
			} else if (vetorA[i] < 12) {
				elementsLower12 += vetorA[i];
			}
		}

		System.out.println();
		System.out.printf("A soma de elementos que são superiores a 12 são: %d", elementsHigher12);
		System.out.println();
		System.out.println();
		System.out.printf("A quantidade de elementos que são iguais a 12 são: %d", elementsEquals12);
		System.out.println();
		System.out.println();
		System.out.printf("A média dos elementos menores que 12 é: %.2f", elementsLower12 / 10);
		System.out.println();
	}

}

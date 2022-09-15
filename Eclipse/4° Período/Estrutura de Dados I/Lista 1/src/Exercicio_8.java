public class Exercicio_8 extends ScannerInput {

	int vetorA[] = new int[12];
	int X, Y, soma;

	public void setVetorA() {
		System.out.println("Insira os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Vetor A[%d] = ", i);
			this.vetorA[i] = input.nextInt();
		}
	}

	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}

	public void calculateSoma() {
		soma = this.vetorA[X] + this.vetorA[Y];
	}

	public int getSoma() {
		return soma;
	}
}

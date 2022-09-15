public class Exercicio_10 extends InputRand {

	int matrixA[][] = new int[3][6];
	int vetorA[] = new int[18];

	public void getMatrixA() {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.printf("%3d ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrixA() {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				this.matrixA[i][j] = rand.nextInt(0, 100);
			}
		}
	}

	public void inputVetor() {
		int k = 0;

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				this.vetorA[k] = this.matrixA[i][j];
				k++;
			}
		}
	}

	public void getVetorA() {
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("%3d ", vetorA[i]);
		}
	}
}

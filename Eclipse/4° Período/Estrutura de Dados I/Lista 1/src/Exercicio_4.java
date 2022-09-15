public class Exercicio_4 extends ScannerInput {

	int vetorA[] = new int[10];
	int somaInferior, equal15 = 0, mediaUnit = 0;
	float media;

	public void setVetorA() {
		System.out.println("Insira os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Vetor A[%d] = ", i);
			this.vetorA[i] = input.nextInt();
		}
	}

	public void calculateVetor() {
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				this.somaInferior = somaInferior + this.vetorA[i];
			} else if (vetorA[i] == 15) {
				this.equal15++;
			} else if (vetorA[i] > 15) {
				this.media = vetorA[i] + this.media;
				this.mediaUnit++;
			}
		}
	}

	public int getSomaInferior() {
		return somaInferior;
	}

	public int getEqual15() {
		return equal15;
	}

	public float getMedia() {
		return media / mediaUnit;
	}
}

public class Exercicio_7 extends ScannerInput {

	int vetorA[] = new int[6];
	int vetorB[] = new int[6];
	int vetorC[] = new int[12];

	public void setVetorA() {
		System.out.println("Insira os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Vetor A[%d] = ", i);
			this.vetorA[i] = input.nextInt();
		}
	}

	public void setVetorB() {
		System.out.println("Insira os valores do vetor B[] : ");
		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Vetor B[%d] = ", i);
			this.vetorB[i] = input.nextInt();
		}
	}

	public void setVetorC() {
		int j = 0;

		for (int i = 0; i < 12; i++) {
			if (i < 6) {
				this.vetorC[i] = vetorA[i];
			} else {
				this.vetorC[i] = vetorB[j];
				j++;
			}
		}
	}

	public void getVetorC() {
		System.out.println("Os valores do vetor C[] : ");
		System.out.println();

		for (int i = 0; i < vetorC.length; i++) {
			System.out.printf("Vetor C[%d] = %d", i, vetorC[i]);
			System.out.println();
		}
	}
}

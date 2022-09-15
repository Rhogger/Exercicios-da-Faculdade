public class Exercicio_2 extends ScannerInput {
	int vetorA[] = new int[10];
	int vetorB[] = new int[10];

	public void setVetorA() {
		System.out.println("Insira os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Vetor A[%d] = ", i);
			this.vetorA[i] = input.nextInt();
		}
	}

	public void getVetorB() {
		System.out.println("Valores do Vetor B[] : ");
		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Vetor B[%d] = %d", i, vetorB[i]);
			System.out.println();
		}
	}

	public void setVetorB() {
		for (int i = 0; i < vetorB.length; i++) {
			this.vetorB[i] = vetorA[i] * i;
		}
	}

}

public class Exercicio_3 extends ScannerInput {

	int vetorA[] = new int[10];
	int soma;

	public void setVetorA() {
		System.out.println("Insira os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Vetor A[%d] = ", i);
			this.vetorA[i] = input.nextInt();
		}
	}

	public int getSoma() {
		return soma;
	}

	public void calculateSoma() {
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				this.soma = soma + this.vetorA[i];
			}
		}
	}
}

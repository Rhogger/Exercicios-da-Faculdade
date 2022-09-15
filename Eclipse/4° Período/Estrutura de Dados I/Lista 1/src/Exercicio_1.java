public class Exercicio_1 extends ScannerInput {
	int vetor[] = new int[9];

	public void setVetor() {
		System.out.println("Insira os valores do vetor: \n");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Vetor[%d] : ", i);
			this.vetor[i] = input.nextInt();
		}
	}

	public void inversedRead() {
		System.out.println("Impressão dos valores: \n");

		for (int i = vetor.length - 1; i > 0; i--) {
			System.out.printf("Vetor[%d] : %d\n", i, this.vetor[i]);
		}
	}
}

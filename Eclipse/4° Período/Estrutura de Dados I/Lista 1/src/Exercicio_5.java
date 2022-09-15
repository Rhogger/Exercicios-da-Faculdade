import java.util.Random;

public class Exercicio_5 extends ScannerInput {

	int vetorA[] = new int[10];
	float percentual0 = 0, percentual1 = 0;
	
	Random rand = new Random();

	public void setVetorA() {
		System.out.println("Os valores do vetor A[] : ");
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			do {
				vetorA[i] = rand.nextInt(2);
				System.out.printf("Vetor A[%d] = %d", i, vetorA[i]);
				System.out.println();
			} while (vetorA[i] != 0 && vetorA[i] != 1);

			setPercentual0(i);
			setPercentual1(i);
		}
	}

	public float getPercentual0() {
		return percentual0;
	}

	public void setPercentual0(int i) {
		if (vetorA[i] == 0) {
			this.percentual0++;
		}
	}

	public void calculatePercentual0() {
		this.percentual0 = (this.percentual0 / 10) * 100;
	}

	public float getPercentual1() {
		return percentual1;
	}

	public void setPercentual1(int i) {
		if (vetorA[i] == 1) {
			this.percentual1++;
		}

	}

	public void calculatePercentual1() {
		this.percentual1 = (this.percentual1 / 10) * 100;
	}

}

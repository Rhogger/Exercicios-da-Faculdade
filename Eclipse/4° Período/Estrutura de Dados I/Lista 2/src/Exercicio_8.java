public class Exercicio_8 extends InputRand {

	int matrixA[][] = new int[15][5];
	int repeatedNumbers[] = new int[75];
	int numberOfRepetitions[] = new int[75];
	int repeatedNumber = 0;

	public void getMatrixA() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrixA() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				this.matrixA[i][j] = rand.nextInt(0, 100);
			}
		}
	}

	public void verifyRepeteadNumbers() {

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 15; k++) {
					for (int l = 0; l < 5; l++) {
						if (matrixA[i][j] == matrixA[k][l]) {
							repeatedNumbers[repeatedNumber] = matrixA[i][j];
							numberOfRepetitions[repeatedNumber]++;
						}
					}
				}
				repeatedNumber++;
			}
		}
	}
	
	public void adjustmentNumberOfRepetiotions() {
		for(int i = 0; i < numberOfRepetitions.length; i++) {
			numberOfRepetitions[i]--;
		}
	}

	public void showRepeatedNumbers() {
		repeatedNumber = 0;

		for (int i = 0; i < repeatedNumbers.length; i++) {
			if (numberOfRepetitions[i] != 0) {
				System.out.printf("Numero : %d", repeatedNumbers[i]);
				System.out.println();
				System.out.printf("Repetições : %d", numberOfRepetitions[i]);
				System.out.println();
				System.out.println();
				for (int j = 0; j < repeatedNumbers.length; j++) {
					if (repeatedNumbers[i] == repeatedNumbers[j]) {
						numberOfRepetitions[j] = 0;
					}
				}
			}
		}
	}
}

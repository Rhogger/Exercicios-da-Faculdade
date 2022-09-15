public class Exercicio_7 extends InputRand {

	float matrixA[][] = new float[4][7];
	float lessNumber, higherNumber;
	int lineOfLessNumber;

	public void getMatrixA() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%7.2f ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrixA() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				this.matrixA[i][j] = rand.nextFloat(-100, 100);
			}
		}
	}

	public void findLessNumberOfMatrix() {
		lessNumber = 100;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (lessNumber > matrixA[i][j]) {
					lessNumber = matrixA[i][j];
					lineOfLessNumber = i;
				}
			}
		}
	}

	public void findMinMax() {
		higherNumber = -100;

		for (int j = 0; j < 7; j++) {
			if (higherNumber < matrixA[lineOfLessNumber][j]) {
				higherNumber = matrixA[lineOfLessNumber][j];
			}
		}
	}

	public float getLessNumber() {
		return lessNumber;
	}

	public float getHigherNumber() {
		return higherNumber;
	}

	public int getLineOfLessNumber() {
		return lineOfLessNumber;
	}
	
	
}

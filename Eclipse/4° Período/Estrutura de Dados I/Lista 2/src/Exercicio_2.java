public class Exercicio_2 extends InputRand {

	int length;
	int matrix[][];

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void createMatrix() {
		this.matrix = new int[length][length];
	}

	public void getMatrix() {
		System.out.println("Matrix: ");
		System.out.println();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrix() {
		createMatrix();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				this.matrix[i][j] = rand.nextInt(-10,10);
			}
		}
	}

	public boolean validateLength() {
		if (this.length > 3) {
			return true;
		} else {
			return false;
		}
	}

	public int sumFirstRow() {
		int sum = 0;

		for (int j = 0; j < matrix.length; j++) {
			sum += matrix[0][j];
		}

		return sum;
	}

	public int sumThirdColumn() {
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][2];
		}

		return sum;
	}

	public int sumMainDiagonal() {
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
			}
		}

		return sum;
	}

	public int sumSecondaryDiagonal() {
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i + j == matrix.length - 1) {
					sum += matrix[i][j];
				}
			}
		}

		return sum;
	}

	public int sumAllElementsOfMatrix() {
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
		}

		return sum;
	}
}

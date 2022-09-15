public class Exercicio_5 extends InputRand {

	int vetorA[];
	int matrixA[][];
	int row, column;

	public void setRow(int row) {
		this.row = row;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public boolean validateRow(int row) {
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateColumn(int column) {
		if (column > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void createMatrixA() {
		this.matrixA = new int[row][column];
	}

	public void getMatrixA() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%3d ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrixA() {
		createMatrixA();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				this.matrixA[i][j] = rand.nextInt(-10, 10);
			}
		}
	}

	public void createVetorA() {
		this.vetorA = new int[column];
	}

	public void getVetorA() {
		for (int i = 0; i < column; i++) {
			System.out.printf("%3d ", vetorA[i]);
		}
		System.out.println();
	}

	public void sumColumns() {
		int sum = 0;
		
		createVetorA();

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				sum += matrixA[j][i];
			}
			this.vetorA[i] = sum;
			sum = 0;
		}
	}
}

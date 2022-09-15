public class Exercicio_3 extends InputRand {

	int row, column;
	int matrixA[][], matrixB[][];

	public void setRow(int row) {
		this.row = row;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public boolean validateRow() {
		if (this.row > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateColumn() {
		if (this.column > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void createMatrixA() {
		this.matrixA = new int[row][column];
	}

	public void createMatrixB() {
		this.matrixB = new int[row][column];
	}

	public void getMatrixA() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%3d ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void getMatrixB() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%3d ", matrixB[i][j]);
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

	public void setMatrixB() {
		createMatrixB();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrixA[i][j] % 2 == 0) {
					this.matrixB[i][j] = 0;
				} else {
					this.matrixB[i][j] = 1;
				}
			}
		}
	}
}

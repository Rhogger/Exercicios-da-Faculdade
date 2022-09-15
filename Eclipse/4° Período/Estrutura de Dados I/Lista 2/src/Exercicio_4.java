public class Exercicio_4 extends InputRand {

	int matrixA[][], matrixB[][], matrixC[][];
	int rowA, columnA, rowB, columnB;

	public void setRowA(int rowA) {
		this.rowA = rowA;
	}
	
	public void setColumnA(int columnA) {
		this.columnA = columnA;
	}

	public void setRowB(int rowB) {
		this.rowB = rowB;
	}

	public void setColumnB(int columnB) {
		this.columnB = columnB;
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
		this.matrixA = new int[rowA][columnA];
	}

	public void createMatrixB() {
		this.matrixB = new int[rowB][columnB];
	}

	public void createMatrixC() {
		this.matrixC = new int[rowA][columnB];
	}

	public void getMatrixA() {
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < columnA; j++) {
				System.out.printf("%3d ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void getMatrixB() {
		for (int i = 0; i < rowB; i++) {
			for (int j = 0; j < columnB; j++) {
				System.out.printf("%3d ", matrixB[i][j]);
			}
			System.out.println();
		}
	}

	public void getMatrixC() {
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < columnB; j++) {
				System.out.printf("%3d ", matrixC[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrixA() {
		createMatrixA();

		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < columnA; j++) {
				this.matrixA[i][j] = rand.nextInt(-10, 10);
			}
		}
	}

	public void setMatrixB() {
		createMatrixB();

		for (int i = 0; i < rowB; i++) {
			for (int j = 0; j < columnB; j++) {
				this.matrixB[i][j] = rand.nextInt(-10, 10);
			}
		}
	}
	
	public boolean validateMatrixC() {
		if (this.columnA == this.rowB) {
			return true;
		} else {
			return false;
		}
	}

	public void calculateMatrixC() {
		createMatrixC();

		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < columnA; j++) {
				for (int k = 0; k < columnB; k++) {
					this.matrixC[i][k] += this.matrixA[i][j] * this.matrixB[j][k];
				}
			}
		}
	}
}

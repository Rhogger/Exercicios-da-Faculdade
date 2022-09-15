public class Exercicio_1 extends InputRand {

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
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public void generateMatrix() {
		createMatrix();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
	}
}

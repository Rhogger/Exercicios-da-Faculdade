public class Exercicio_9 extends InputRand {

	int matrixA[][] = new int[8][8];
	
	public void getMatrixA() {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA.length; j++) {
				System.out.printf("%3d ", matrixA[i][j]);
			}
			System.out.println();
		}
	}

	public void setMatrixA() {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA.length; j++) {
				this.matrixA[i][j] = rand.nextInt(0, 10);
			}
		}
	}
	
	public boolean verifyMatrixIsSimetric() {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA.length; j++) {
				if(matrixA[i][j] != matrixA[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}

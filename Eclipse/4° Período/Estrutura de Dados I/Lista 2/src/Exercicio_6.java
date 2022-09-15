public class Exercicio_6 extends InputRand {

	int matrixA[][] = new int[10][3];
	int lessGrade[] = new int[10];

	public void setMatrixA() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				this.matrixA[i][j] = rand.nextInt(0, 10);
			}
		}
	}

	public void verifyLowestGrade() {
		int lessGrade = 10;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if (lessGrade > matrixA[i][j]) {
					lessGrade = matrixA[i][j];
					this.lessGrade[i] = lessGrade;
				}
			}
			lessGrade = 10;
		}
	}

	public void getRelatoryExams() {
		System.out.println("._____________________________________________.");
		System.out.println("| Alunos  |  Prova 1  |  Prova 2  |  Prova 3  |");
		for (int i = 0; i < 10; i++) {
			System.out.printf("|   %2d    |", i + 1);
			for (int j = 0; j < 3; j++) {
				System.out.printf("    %2d     |", matrixA[i][j]);
			}
			System.out.println();
		}
		System.out.println("._____________________________________________.");
	}

	public void getRelatoryLessGrade() {
		int exam[] = new int[3];

		System.out.println("._____________________________________________.");
		System.out.println("|  Alunos |  Prova 1  |  Prova 2  |  Prova 3  |");
		for (int i = 0; i < 10; i++) {
			System.out.printf("|    %2d   |", i + 1);
			for (int j = 0; j < 3; j++) {
				if (matrixA[i][j] == lessGrade[i]) {
					System.out.print("     X     |");
					exam[j]++;
				} else {
					System.out.print("           |");
				}
			}
			System.out.println();
		}
		System.out.println("|         |           |           |           |");
		System.out.printf("|  Total  |    %2d     |    %2d     |    %2d     |", exam[0], exam[1], exam[2]);
		System.out.println();
		System.out.println("._____________________________________________.");
	}
}

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int escolhaMenu, numExercicio = 1;
		String filename;

		System.out.println("Exercícios: \n");

		System.out.println("0 - Sair.\n\n");

		for (int i = 0; i < 10; i++, numExercicio++) {
			filename = "Questão-" + numExercicio + ".txt";

			Path caminho = Paths.get(
					"C:/Programas/Exercicios-da-Faculdade/Eclipse/4° Período/Estrutura de Dados I/Lista 2/" + filename);

			try {

				byte[] conteudo = Files.readAllBytes(caminho);
				String leitura = new String(conteudo);

				System.out.println(leitura);
				System.out.println("\n");

			} catch (Exception abrirArquivo) {

				System.out.println("\n\nErro ao abrir arquivo!");

			}
		}

		System.out.println();
		System.out.print("Escolha um exercício: ");
		escolhaMenu = input.nextInt();
		System.out.println();
		System.out.println();
		clearScreen();

		switch (escolhaMenu) {

		case 0:
			break;

		case 1:
			Exercicio_1 questao1 = new Exercicio_1();

			System.out.print("Insira o tamanho da matriz identidade: ");
			questao1.setLength(input.nextInt());
			System.out.println();

			questao1.generateMatrix();

			System.out.printf("A matriz identidade de ordem %d, ficou: ", questao1.getLength());
			System.out.println();
			System.out.println();
			questao1.getMatrix();

			break;

		case 2:
			Exercicio_2 questao2 = new Exercicio_2();

			System.out.print("Insira o tamanho da matriz: ");
			questao2.setLength(input.nextInt());
			System.out.println();

			while (questao2.validateLength() == false) {
				System.out.print("Insira novamente o tamanho da matriz: ");
				questao2.setLength(input.nextInt());
				System.out.println();
			}

			questao2.setMatrix();
			questao2.getMatrix();
			System.out.println();
			System.out.println();

			System.out.printf("A soma dos elementos da primeira linha é: %d", questao2.sumFirstRow());
			System.out.println();
			System.out.printf("A soma dos elementos da terceira coluna é: %d", questao2.sumThirdColumn());
			System.out.println();
			System.out.printf("A soma dos elementos da diagonal principal é: %d", questao2.sumMainDiagonal());
			System.out.println();
			System.out.printf("A soma dos elementos da diagonal secundária é: %d", questao2.sumSecondaryDiagonal());
			System.out.println();
			System.out.printf("A soma de todos os elementos da matriz é: %d", questao2.sumAllElementsOfMatrix());
			System.out.println();

			break;

		case 3:

			Exercicio_3 questao3 = new Exercicio_3();

			System.out.print("Insira a quantidade de linhas da Matriz A: ");
			questao3.setRow(input.nextInt());
			System.out.println();

			while (questao3.validateRow() == false) {
				System.out.print("Insira novamente a quantidade de linhas da Matriz A: ");
				questao3.setRow(input.nextInt());
				System.out.println();
			}

			System.out.print("Insira a quantidade de colunas da Matriz A: ");
			questao3.setColumn(input.nextInt());
			System.out.println();

			while (questao3.validateColumn() == false) {
				System.out.print("Insira novamente a quantidade de colunas da Matriz A: ");
				questao3.setColumn(input.nextInt());
				System.out.println();
			}

			System.out.println("Matriz A: ");
			System.out.println();
			questao3.setMatrixA();
			questao3.getMatrixA();
			System.out.println();
			System.out.println();

			System.out.println("Matriz B: ");
			System.out.println();
			questao3.setMatrixB();
			questao3.getMatrixB();
			System.out.println();
			System.out.println();

			break;

		case 4:

			Exercicio_4 questao4 = new Exercicio_4();

			System.out.print("Insira a quantidade de linhas da Matriz A: ");
			questao4.setRowA(input.nextInt());
			System.out.println();

			while (questao4.validateRow(questao4.rowA) == false) {
				System.out.print("Insira novamente a quantidade de linhas da Matriz A: ");
				questao4.setRowA(input.nextInt());
				System.out.println();
			}

			System.out.print("Insira a quantidade de colunas da Matriz A: ");
			questao4.setColumnA(input.nextInt());
			System.out.println();

			while (questao4.validateColumn(questao4.columnA) == false) {
				System.out.print("Insira novamente a quantidade de colunas da Matriz A: ");
				questao4.setColumnA(input.nextInt());
				System.out.println();
			}

			System.out.println();
			System.out.println();

			System.out.print("Insira a quantidade de linhas da Matriz B: ");
			questao4.setRowB(input.nextInt());
			System.out.println();

			while (questao4.validateRow(questao4.rowB) == false) {
				System.out.print("Insira novamente a quantidade de linhas da Matriz B: ");
				questao4.setRowB(input.nextInt());
				System.out.println();
			}

			System.out.print("Insira a quantidade de colunas da Matriz B: ");
			questao4.setColumnB(input.nextInt());
			System.out.println();

			while (questao4.validateColumn(questao4.columnB) == false) {
				System.out.print("Insira novamente a quantidade de colunas da Matriz B: ");
				questao4.setColumnB(input.nextInt());
				System.out.println();
			}

			System.out.println("Matriz A: ");
			System.out.println();
			questao4.setMatrixA();
			questao4.getMatrixA();
			System.out.println();
			System.out.println();

			System.out.println("Matriz B: ");
			System.out.println();
			questao4.setMatrixB();
			questao4.getMatrixB();
			System.out.println();
			System.out.println();

			if (questao4.validateMatrixC() == true) {
				System.out.println("Matriz C: ");
				System.out.println();
				questao4.calculateMatrixC();
				questao4.getMatrixC();
				System.out.println();
				System.out.println();
			} else {
				System.out.println("Não é possível fazer multiplicação das matrizes A e B.");
				System.out.println();
			}

			break;

		case 5:

			Exercicio_5 questao5 = new Exercicio_5();

			System.out.print("Insira a quantidade de linhas da Matriz A: ");
			questao5.setRow(input.nextInt());
			System.out.println();

			while (questao5.validateRow(questao5.row) == false) {
				System.out.print("Insira novamente a quantidade de linhas da Matriz A: ");
				questao5.setRow(input.nextInt());
				System.out.println();
			}

			System.out.print("Insira a quantidade de colunas da Matriz A: ");
			questao5.setColumn(input.nextInt());
			System.out.println();

			while (questao5.validateColumn(questao5.column) == false) {
				System.out.print("Insira novamente a quantidade de colunas da Matriz A: ");
				questao5.setColumn(input.nextInt());
				System.out.println();
			}

			System.out.println("Matriz A: ");
			System.out.println();
			questao5.setMatrixA();
			questao5.getMatrixA();
			System.out.println();
			System.out.println();
			questao5.sumColumns();
			System.out.println("Vetor A: ");
			System.out.println();
			questao5.getVetorA();

			break;

		case 6:

			Exercicio_6 questao6 = new Exercicio_6();

			System.out.println("Relatório Escolar: Notas das Provas");
			System.out.println();
			questao6.setMatrixA();
			questao6.getRelatoryExams();
			System.out.println();
			System.out.println();

			System.out.println("Relatório Escolar: Menor Nota do Aluno");
			System.out.println();
			questao6.verifyLowestGrade();
			questao6.getRelatoryLessGrade();

			break;

		case 7:

			Exercicio_7 questao7 = new Exercicio_7();
			
			System.out.println("Matriz A: ");
			System.out.println();
			questao7.setMatrixA();
			questao7.getMatrixA();
			System.out.println();
			System.out.println();
			questao7.findLessNumberOfMatrix();
			questao7.findMinMax();
			System.out.println("O MINMAX dessa matriz é: ");
			System.out.println();
			System.out.printf("Menor elemento da matriz: %.2f", questao7.getLessNumber());
			System.out.println();
			System.out.printf("Linha em que se encontra o menor elemento: %d", questao7.getLineOfLessNumber() + 1);
			System.out.println();
			System.out.printf("O Maior elemento da %d° linha  é o %.2f", questao7.getLineOfLessNumber() + 1, questao7.getHigherNumber());
			System.out.println();
			System.out.println();
			
			break;

		case 8:

			Exercicio_8 questao8 = new Exercicio_8();

			System.out.println("Matriz A: ");
			System.out.println();
			questao8.setMatrixA();
			questao8.getMatrixA();
			System.out.println();
			System.out.println();
			
			questao8.verifyRepeteadNumbers();
			questao8.adjustmentNumberOfRepetiotions();
			questao8.showRepeatedNumbers();
			System.out.println("fim");
			
			
			break;

		case 9:

			Exercicio_9 questao9 = new Exercicio_9();
			
			System.out.println("Matriz A: ");
			System.out.println();
			questao9.setMatrixA();
			questao9.getMatrixA();
			System.out.println();
			System.out.println();
			
			if(questao9.verifyMatrixIsSimetric() == true) {
				System.out.println("A matriz é simétrica!");
			}else {
				System.out.println("A matriz não é simétrica!");
			}
			

			break;

		case 10:

			Exercicio_10 questao10 = new Exercicio_10();

			System.out.println("Matriz A: ");
			System.out.println();
			questao10.setMatrixA();
			questao10.getMatrixA();
			System.out.println();
			System.out.println();
			
			System.out.println("Vetor A: ");
			System.out.println();
			questao10.inputVetor();
			questao10.getVetorA();			
			
			break;

		default:

			System.out.println("Exercício inexistente!");
		}
	}

	public static void clearScreen() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	}
}

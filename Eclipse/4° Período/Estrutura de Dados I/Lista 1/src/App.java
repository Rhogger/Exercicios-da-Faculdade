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

		for (int i = 0; i < 8; i++, numExercicio++) {
			filename = "Questão-" + numExercicio + ".txt";

			Path caminho = Paths.get(
					"C:/Programas/Exercicios-da-Faculdade/Eclipse/4° Período/Estrutura de Dados I/Lista 1/" + filename);

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

			questao1.setVetor();
			System.out.println();
			questao1.inversedRead();

			break;

		case 2:
			Exercicio_2 questao2 = new Exercicio_2();

			questao2.setVetorA();
			System.out.println();

			questao2.setVetorB();
			questao2.getVetorB();

			break;

		case 3:

			Exercicio_3 questao3 = new Exercicio_3();

			questao3.setVetorA();
			System.out.println();

			questao3.calculateSoma();
			System.out.printf("A soma é: %d", questao3.getSoma());

			break;

		case 4:

			Exercicio_4 questao4 = new Exercicio_4();

			questao4.setVetorA();
			System.out.println();

			questao4.calculateVetor();

			System.out.printf("A soma dos inferiores a 15 são: %d", questao4.getSomaInferior());
			System.out.println();

			System.out.printf("Os elementos iguais a 15 são: %d", questao4.getEqual15());
			System.out.println();

			System.out.printf("A média dos elementos superios a 15 são: %.2f", questao4.getMedia());
			System.out.println();

			break;

		case 5:

			Exercicio_5 questao5 = new Exercicio_5();

			questao5.setVetorA();
			System.out.println();

			questao5.calculatePercentual0();
			questao5.calculatePercentual1();

			System.out.printf("A porcentagem de números 0 é: %.2f %%", questao5.getPercentual0());
			System.out.println();

			System.out.printf("A porcentagem de números 1 é: %.2f %%", questao5.getPercentual1());
			System.out.println();

			break;

		case 6:

			Exercicio_6 questao6 = new Exercicio_6();

			questao6.setVetorA();
			System.out.println();

			questao6.setVetorB();
			questao6.getVetorB();

			break;

		case 7:

			Exercicio_7 questao7 = new Exercicio_7();

			questao7.setVetorA();
			System.out.println();

			questao7.setVetorB();
			System.out.println();

			questao7.setVetorC();
			questao7.getVetorC();

			break;

		case 8:

			Exercicio_8 questao8 = new Exercicio_8();
			int x, y;

			questao8.setVetorA();
			System.out.println();

			do {
				System.out.print("Insira uma posição X do vetor: ");
				x = input.nextInt();
				questao8.setX(x);
				System.out.println();

				System.out.print("Insira uma posição Y do vetor: ");
				y = input.nextInt();
				questao8.setY(y);
				System.out.println();
			} while (x < 0 || x > 11 && y < 0 || y > 11);

			questao8.calculateSoma();
			System.out.println();

			System.out.printf("A soma dos dois elementos VetorA[%d] + VetorA[%d] = %d", x, y, questao8.getSoma());
			break;

		default:

			System.out.println("Exercício inexistente!");
		}
	}

	public static void clearScreen() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	}
}

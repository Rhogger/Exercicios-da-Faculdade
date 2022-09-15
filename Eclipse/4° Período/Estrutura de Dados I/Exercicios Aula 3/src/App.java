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

		for (int i = 0; i < 3; i++, numExercicio++) {
			filename = "Questão-" + numExercicio + ".txt";

			Path caminho = Paths.get(
					"C:/Programas/Exercicios-da-Faculdade/Eclipse/4° Período/Estrutura de Dados I/Exercicios Aula 3/"
							+ filename);

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

			System.out.println("Digite uma frase qualquer: ");
			System.out.println();
			questao1.setPhrase();
			System.out.println();

			System.out.printf("Essa frase possui %d caracteres.", questao1.getPhraseLength());
			System.out.println();
			break;

		case 2:

			Exercicio_2 questao2 = new Exercicio_2();

			System.out.println("Digite uma frase qualquer: ");
			System.out.println();
			questao2.setPhrase1();
			System.out.println();

			System.out.println("Digite algo para complementar a primeira frase: ");
			System.out.println();
			questao2.setPhrase2();
			System.out.println();

			questao2.concatPhrase();
			System.out.println("A concatenação das duas frases é: ");
			System.out.println();
			System.out.println(questao2.getPhrase());

			break;

		case 3:

			System.out.println("Maria Moura".contains("pedro"));
			System.out.println();
			System.out.println("Pedro Tintino".startsWith("pedro"));
			System.out.println();
			System.out.println("Carlos Araujo".endsWith("Araujo"));
			System.out.println();
			System.out.println("Felipe Alberto Santos".startsWith("Alberto"));
			System.out.println();
			System.out.println("Felipe Alberto Santos".endsWith("Alberto"));
			System.out.println();
			System.out.println("Felipe Alberto Santos".contains("Alberto"));
			System.out.println();

			break;

		default:

			System.out.println("Exercício inexistente!");

			break;
		}
	}

	public static void clearScreen() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	}

}

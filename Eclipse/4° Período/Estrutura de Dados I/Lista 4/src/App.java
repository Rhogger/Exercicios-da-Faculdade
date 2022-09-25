import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int escolhaMenu, numExercicio = 1;
		String filename;

		System.out.println("Exercícios: \n");

		System.out.println("0 - Sair.\n\n");

		for (int i = 0; i < 2; i++, numExercicio++) {
			filename = "Questão-" + numExercicio + ".txt";

			Path caminho = Paths.get(
					"C:/Programas/Exercicios-da-Faculdade/Eclipse/4° Período/Estrutura de Dados I/Lista 4/" + filename);

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

		input.nextLine();

		switch (escolhaMenu) {

		case 0:
			break;

		case 1:

			ArrayList<String> collors = new ArrayList<String>();

			String collor = "";

			do {
				System.out.print("Insira o nome de uma cor ou aperte enter para sair: ");
				collor = input.nextLine();
				System.out.println();

				if (collor.equals("")) {
					break;
				} else {
					collors.add(collor);
				}

			} while (collor.equals("") == false);
			
			for (int i = 0; i < collors.size(); i++) {
				System.out.printf("Cor %d : %s", i + 1, collors.get(i));
				System.out.println();
			}

			System.out.println();

			if (collors.size() > 0) {
				collors.add(0, "Gianguia");
				collors.add(0, "Gianguiaaaa");
			}
			
			for (int i = 0; i < collors.size(); i++) {
				System.out.printf("Cor %d : %s", i + 1, collors.get(i));
				System.out.println();
			}

			System.out.println();


			Collections.sort(collors);

			for (int i = 0; i < collors.size(); i++) {
				System.out.printf("Cor %d : %s", i + 1, collors.get(i));
				System.out.println();
			}

			break;

		case 2:

			ArrayList<String> phraseInverted = new ArrayList<String>();

			String phrase;

			System.out.print("Digite qualquer coisa: ");
			phrase = input.nextLine();
			System.out.println();
			System.out.println();

			String words[] = phrase.split(" ");

			for (int i = 0; i < words.length; i++) {
				phraseInverted.add(words[i]);
			}

			for (int i = 0; i < phraseInverted.size(); i++) {
				System.out.print(phraseInverted.get(phraseInverted.size() - 1 - i));
				System.out.print(" ");
			}

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
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

		for (int i = 0; i < 6; i++, numExercicio++) {
			filename = "Questão-" + numExercicio + ".txt";

			Path caminho = Paths.get(
					"C:/Programas/Exercicios-da-Faculdade/Eclipse/4° Período/Estrutura de Dados I/Lista 3/" + filename);

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

			System.out.print("Digite qualquer coisa: ");
			questao1.setPhrase();
			System.out.println();
			System.out.println();
			System.out.printf("a) O numero de caracteres dessa String é: %d", questao1.getPhraseLength());
			System.out.println();
			System.out.printf("b) A String com todas suas letras maiusculas fica: %s", questao1.getPhraseToUpperCase());
			System.out.println();
			System.out.printf("c) O numero de vogais da String é: %d", questao1.getQuantityOfVowels());
			System.out.println();
			System.out.printf("d) A String começa com \"UNI\"? R: %b", questao1.IsPhraseStarts());
			System.out.println();
			System.out.printf("e) A String termina com \"ADO\"? R: %b", questao1.IsPhraseEnds());
			System.out.println();
			System.out.printf("f) Numero de digitos da String: %d", questao1.getQuantityOfNumbers());
			System.out.println();
			System.out.printf("g) A String é um palíndromo? R: %b", questao1.IsPalimdrome());
			System.out.println();

			break;

		case 2:

			Exercicio_2 questao2 = new Exercicio_2();

			System.out.print("Digite qualquer coisa: ");
			questao2.setPhrase();
			System.out.println();

			questao2.generateInitials();
			System.out.println(questao2.getInitials());

			break;
		case 3:

			Exercicio_3 questao3 = new Exercicio_3();

			System.out.print("Digite qualquer coisa: ");
			questao3.setPhrase();
			System.out.println();

			System.out.printf("O total de caracteres é: %d", questao3.getPhraseLength());
			System.out.println();

			System.out.printf("A quantidade de palavras é: %d", questao3.getWordsOfPhrase());
			System.out.println();

			break;
		case 4:

			Exercicio_4 questao4 = new Exercicio_4();

			System.out.print("Digite qualquer coisa: ");
			questao4.setPhrase();
			System.out.println();

			System.out.println("A String sem vogais ficou assim: ");
			System.out.println();
			questao4.removeVowels();
			System.out.println(questao4.getPhrase());

			break;
		case 5:

			Exercicio_5 questao5 = new Exercicio_5();

			System.out.print("Digite qualquer coisa: ");
			questao5.setPhrase();
			System.out.println();

			System.out.printf("A String possui %d \"a\"!", questao5.quantityOfA());
			System.out.println();

			break;
		case 6:

			Exercicio_6 questao6 = new Exercicio_6();

			System.out.print("Digite as 5 palavras: ");
			questao6.setPhrase();
			System.out.println();

			System.out.print("Digite a palavra que queira buscar: ");
			questao6.setWord();
			System.out.println();

			if (questao6.findWord() == true) {
				System.out.println("A palavra digitada foi encontrada");
			} else {
				System.out.println("A palavra digitada não foi encontrada");
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

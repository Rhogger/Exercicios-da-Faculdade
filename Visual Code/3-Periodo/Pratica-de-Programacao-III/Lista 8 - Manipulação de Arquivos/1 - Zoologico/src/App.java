import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		String filename;

		int numJaula = 0, idade, escolhaMenu;
		String nomeAnimal, alimentacao;

		do {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("=-=-=-=-=-=-=-= MENU =-=-=-=-=-=-=-=-= ");
			System.out.println("1 - Criar e Cadastrar uma Jaula.");
			System.out.println("2 - Visualizar os dados de uma Jaula.");
			System.out.println("3 - Excluir uma Jaula.");
			System.out.println();
			System.out.print("Escolha: ");
			escolhaMenu = input.nextInt();
			System.out.println();
			System.out.println();

			switch (escolhaMenu) {

			case 1:

				System.out.println("Insira o numero da Jaula menor que 1 para finalizar a processo.");
				System.out.println();
				System.out.println();

				System.out.print("Número da Jaula: ");
				numJaula = input.nextInt();
				input.nextLine();

				if (numJaula < 1) {
					break;
				}

				filename = "Jaula" + numJaula + ".txt";

				File file = new File(filename);

				if (file.createNewFile()) {
					FileWriter fileW = new FileWriter(filename);

					System.out.print("Nome do Animal: ");
					nomeAnimal = input.nextLine();

					System.out.print("Idade do Animal: ");
					idade = input.nextInt();

					input.nextLine();

					System.out.print("Classificação Alimentícia: ");
					alimentacao = input.nextLine();

					System.out.println("\n\nArquivo criado com sucesso!");
					System.out.println();

					fileW.write("Jaula: " + numJaula + "\n");
					fileW.write("Nome: " + nomeAnimal + "\n");
					fileW.write("Idade: " + idade + "\n");
					fileW.write("Classificação Alimentícia: " + alimentacao + "\n");
					fileW.close();
				} else {
					System.out.println("Arquivo já existe!");
				}

				System.out.println();
				System.out.printf("O caminho para o Arquivo %s é: %s \n\n\n", file.getName(), file.getAbsolutePath());

				break;

			case 2:

				System.out.print("Insira o N° da Jaula que deseja visualizar: ");
				numJaula = input.nextInt();

				filename = "Jaula" + numJaula + ".txt";

				Path caminho = Paths.get("C:/Users/rhogg/eclipse-workspace/Zoologico/" + filename);

				try {

					byte[] conteudo = Files.readAllBytes(caminho);
					String leitura = new String(conteudo);

					JOptionPane.showMessageDialog(null, leitura);

				} catch (Exception abrirArquivo) {

					System.out.println("\n\nErro ao Abrir Arquivo!");

				}

				break;

			case 3:

				System.out.print("Insira o N° da Jaula que deseja excluir: ");
				numJaula = input.nextInt();

				filename = "Jaula" + numJaula + ".txt";

				File fileD = new File(filename);

				boolean fileDeleted = fileD.delete();

				if (fileDeleted) {
					System.out.println("\n\nArquivo Excluído!");
				} else {
					System.out.println("\n\nArquivo não existe!");
				}

			}
		} while (numJaula > 0);

	}

}

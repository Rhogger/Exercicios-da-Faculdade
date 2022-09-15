import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int questao;

		do {
			System.out.print("Insira o N° da questão que deseja fazer ou 0 para sair: ");
			questao = input.nextInt();
			System.out.println();
			System.out.println();
			input.nextLine();

			switch (questao) {

			case 0:

				System.out.println("Finalizar operação.");
				break;

			case 1:

				Login auth = new Login();

				System.out.print("Username: ");
				auth.setUser(input.nextLine());

				System.out.print("Password: ");
				auth.setPass(input.nextLine());

				if ((auth.getUser().compareToIgnoreCase("LN") == 0)
						&& (auth.getPass().compareToIgnoreCase("corporation") == 0)) {
					System.out.println("Usuário autenticado no sistema");
				} else {
					System.out.println("Falha na autenticação");
				}
				break;

			case 2:

				SubstituirChar subAB = new SubstituirChar();

				System.out.print("Digite uma frase: ");
				subAB.setFrase(input.nextLine());

				System.out.println("Com a substituição de todos A por B ficou: ");
				System.out.println();
				System.out.println(subAB.getFrase().replace('a', 'b'));
				System.out.println();
				break;

			case 3:

				SubstituirChar subSpace = new SubstituirChar();

				System.out.print("Digite uma frase: ");
				subSpace.setFrase(input.nextLine());

				System.out.println("Com a substituição de todos A por B ficou: ");
				System.out.println();
				System.out.println(subSpace.getFrase().replaceAll(" ", ""));
				System.out.println();
				break;

			case 4:

				NomeCompleto pessoa = new NomeCompleto();

				System.out.print("Insira seu nome: ");
				pessoa.setNome(input.nextLine());

				System.out.print("Insira o sobrenome: ");
				pessoa.setSobrenome(input.nextLine());

				pessoa.setNomeCompleto(pessoa.getNome() + " " + pessoa.getSobrenome());

				System.out.printf("Nome Completo: %s \n", pessoa.getNomeCompleto());

				int valid = pessoa.getNomeCompleto().indexOf(" ");

				System.out.printf("Último nome: %s", pessoa.getNomeCompleto().substring(valid + 1));
				System.out.println();
				System.out.println();
				System.out.println();
				break;

			case 5:

				CompararAlfa usuario = new CompararAlfa();

				System.out.print("Insira uma palavra qualquer: ");
				usuario.setPalavra1(input.nextLine());

				System.out.print("Insira outra palavra qualquer: ");
				usuario.setPalavra2(input.nextLine());

				if (usuario.getPalavra1().compareToIgnoreCase(usuario.getPalavra2()) == 0) {
					System.out.println("As palavras são iguais!");
				} else if (usuario.getPalavra1().compareToIgnoreCase(usuario.getPalavra2()) > 0) {
					System.out.printf("%s \n", usuario.getPalavra2());
					System.out.printf("%s \n", usuario.getPalavra1());
				} else if (usuario.getPalavra1().compareToIgnoreCase(usuario.getPalavra2()) < 0) {
					System.out.printf("%s \n", usuario.getPalavra1());
					System.out.printf("%s \n", usuario.getPalavra2());
				}
				System.out.println();
				System.out.println();
				System.out.println();
				break;

			case 6:

				Login sigIn = new Login();

				try {
					System.out.print("Digite o nome: ");
					sigIn.setUser(input.nextLine());

					System.out.print("Digite seu email: ");
					sigIn.setEmail(input.nextLine());

					sigIn.validEmail();
					System.out.println();
					System.out.println();
					System.out.println();
				} catch (StringIndexOutOfBoundsException tamanhoString) {
					System.out.println("E-mail inválido!");
				}
				System.out.println();
				System.out.println();
				System.out.println();
				break;

			default: 
				
				System.out.println("Questão inválida!");
			}

		} while (questao != 0);

	}
}

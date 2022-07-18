import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int choice;

		Agenda agenda = new Agenda();
		ArrayList<Contato> lista = new ArrayList<Contato>();

		System.out.println("Insira o nome da Lista telefônica: ");
		agenda.setNomeAgenda(input.nextLine());
		System.out.println();

		System.out.println("Insira a data da página: ");
		agenda.setData(input.nextLine());
		System.out.println();

		System.out.println("Insira a página da Agenda: ");
		agenda.setPagina(input.nextInt());
		System.out.println();
		

		do {

			input.nextLine();

			Contato contato = new Contato();

			System.out.println();
			System.out.println("Insira o nome do contato: ");
			contato.setNomePessoa(input.nextLine());
			System.out.println();

			System.out.println("Insira o número do contato: ");
			contato.setTelefone(input.nextLine());
			System.out.println();

			System.out.println("Insira o endereço do contato: ");
			contato.setEndereço(input.nextLine());
			System.out.println();

			System.out.println("Insira o email do contato: ");
			contato.setEmail(input.nextLine());
			System.out.println();

			System.out.println("Insira a empresa do contato: ");
			contato.setEmpresa(input.nextLine());
			System.out.println();

			System.out.println("Insira o CPF do contato: ");
			contato.setCpf(input.nextLine());
			System.out.println();

			System.out.println("Insira o CNPJ da empresa do contato: ");
			contato.setCnpj(input.nextLine());
			System.out.println();

			lista.add(contato);

			System.out.println("Quer registrar mais contatos? ");
			System.out.println("1- Sim \n2- Não");
			choice = input.nextInt();

		} while (choice == 1);
		
		System.out.println("\n\n\n\n");
		System.out.printf("Agenda: %s \n", agenda.getNomeAgenda());
		System.out.printf("Data: %s \n", agenda.getData());
		System.out.printf("Página: %d \n\n", agenda.getPagina());

		int cont = 1;

		for (Contato c : lista) {

			System.out.printf("Contato %d \n", cont);
			System.out.printf("Nome: %s \n", c.getNomePessoa());
			System.out.printf("CPF: %s \n", c.getCpf());
			System.out.printf("Número: %s \n", c.getTelefone());
			System.out.printf("Endereço: %s \n", c.getEndereço());
			System.out.printf("Email: %s \n", c.getEmail());
			System.out.printf("Empresa: %s \n", c.getEmpresa());
			System.out.printf("CNPJ: %s \n", c.getCnpj());
			System.out.println("\n\n");

			cont++;

		}
	}
}

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//TODO implementar regex em todos os atributos de todas as classes;
		//TODO adicionar mais atributos;

		Scanner input = new Scanner(System.in);
		
		String name, cpf, phonenumber, address;
		int type;
		
		System.out.println("=-=-=-=-=-=-= Cadastro de Pessoa =-=-=-=-=-=-=");
		System.out.print("Nome: ");
		name = input.nextLine();
		
		System.out.print("CPF: ");
		cpf = input.nextLine();
		
		System.out.print("Número de Telefone: ");
		phonenumber = input.nextLine();
		
		System.out.print("Endereço: ");
		address = input.nextLine();
		
		do {
			System.out.println("Tipo de pessoa: ");
			System.out.println("1- Cliente");
			System.out.println("2- Funcionário");
			System.out.println();
			System.out.print("Escolha: ");
			type = input.nextInt();
		}
		
		
		
		
		
	}

}

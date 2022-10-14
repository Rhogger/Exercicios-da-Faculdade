import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Queue fila = new LinkedList();
		Contact contato = new Contact();

		String enter;
		char condition;

		System.out.println("Adicione os contatos à lista: ");
		System.out.println();

		do {
			System.out.print("Nome: ");
			contato.setName(input.nextLine());
			System.out.println();

			System.out.print("Endereço: ");
			contato.setAddress(input.nextLine());
			System.out.println();

			System.out.print("Número de Celular: ");
			contato.setNumber(input.nextLine());
			System.out.println();

			fila.add(contato.toString());

			do {
				System.out.println("Deseja adicionar mais contatos?");
				System.out.println("S/N?");
				condition = input.next().charAt(0);
				System.out.println();
			} while (condition != 'S' && condition != 'N');

			input.nextLine();

		} while (condition == 'S');

		int length = fila.size();
		
		for (int i = 0; i < length; i++) {
			System.out.println(fila.poll());
			System.out.println();

			System.out.println("Tecle Enter para continuar");
			enter = input.nextLine();
		}
	}

}

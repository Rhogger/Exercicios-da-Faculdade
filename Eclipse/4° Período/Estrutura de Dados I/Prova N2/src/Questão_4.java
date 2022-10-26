import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questão_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Queue queue = new LinkedList();

		Document doc = new Document();

		char condition;

		do {
			System.out.print("Insira o nome do documento: ");
			doc.setName(input.nextLine());	

			System.out.print("Informe a quantidade de folhas a serem impressas: ");
			doc.setNumberOfSheets(input.nextInt());
			System.out.println();

			queue.add(doc.toString());

			do {
				System.out.print("Deseja inserir mais elementos (S/N)? R: ");
				condition = input.next().charAt(0);
				System.out.println();
			} while (condition != 'S' && condition != 's' && condition != 'N' && condition != 'n');

			input.nextLine();
		} while (condition == 'S' || condition == 's');

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();

		System.out.print("Fila de Documentos: \n" + queue);
		System.out.println();

		int length = queue.size();
		String enter;

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();

		for (int i = 0; i < length; i++) {
			System.out.println("Imprimindo....");
			System.out.println();
			System.out.println(queue.poll());
			
			System.out.print("Tecle enter para proceguir...");
			enter = input.nextLine();
			System.out.println();
			System.out.println();
		}

		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();

		System.out.print("Fila de Documentos: \n" + queue);
		System.out.println();

	}

}

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		LinkedList<String> elements = new LinkedList<String>();

		String element;

		do {
			System.out.print("Insira algo aqui ou tecle Enter para sair: ");

			element = input.nextLine();

			System.out.println();

			elements.add(element);

		} while (element.equals("") == false);
		
		elements.removeLast();

		elements.addFirst("First Element");
		elements.addLast("Last Element");

		if (elements.size() > 2) {
			elements.remove(2);
		}

		elements.removeFirst();
		elements.removeLast();

		Collections.sort(elements);

		System.out.println(elements);

		elements.clear();

	}

}

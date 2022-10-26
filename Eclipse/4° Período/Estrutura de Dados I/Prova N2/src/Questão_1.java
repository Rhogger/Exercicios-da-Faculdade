import java.util.LinkedList;
import java.util.Scanner;

public class Questão_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<Integer>();

		char condition;
		int number;

		do {
			System.out.print("Insira um número: ");
			number = input.nextInt();
			System.out.println();

			list.add(number);

			do {
				System.out.print("Deseja inserir mais elementos (S/N)? R: ");
				condition = input.next().charAt(0);
				System.out.println();
			} while (condition != 'S' && condition != 's' && condition != 'N' && condition != 'n');
		} while (condition == 'S' || condition == 's');

		System.out.printf("O número de nós é: %d", list.size());
		System.out.println();
		System.out.println();

		int numNode = 0, num;

		System.out.print("Insira um valor: ");
		num = input.nextInt();
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > num) {
				numNode++;
			}
		}

		System.out.printf("O número de nós maior que %d é: %d", num, numNode);
		System.out.println();
		System.out.println();

		System.out.print("Insira um valor: ");
		num = input.nextInt();
		System.out.println();

		if (list.size() < num) {
			num = list.size();
		}

		for (int i = 0; i < num; i++) {
			list.remove();
		}

		if (list.isEmpty() == false) {
			System.out.println("O restante dos valores da Lista: " + list);
		} else {
			System.out.println("A lista esta vazia!");
		}
	}

}

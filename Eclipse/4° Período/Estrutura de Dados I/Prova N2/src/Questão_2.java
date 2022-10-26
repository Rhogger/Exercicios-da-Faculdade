import java.util.ArrayList;
import java.util.Scanner;

public class Questão_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("Os elementos da Lista são: " + list);
		System.out.println();

		list.add(14);

		System.out.println("Os elementos da Lista são: " + list);
		System.out.println();

		System.out.print("Insira um valor: ");
		int num = input.nextInt();
		System.out.println();

		list.add(num);

		System.out.println("Os elementos da Lista são: " + list);
		System.out.println();

		System.out.print("Insira um valor: ");
		num = input.nextInt();
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == num) {
				list.remove(i);
				break;
			}
		}

		System.out.println("Os elementos da Lista são: " + list);
		System.out.println();
	}

}
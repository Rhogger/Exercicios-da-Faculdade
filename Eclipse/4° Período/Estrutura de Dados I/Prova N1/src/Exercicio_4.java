import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String name;

		System.out.println("Digite seu nome abaixo: ");
		System.out.println();
		name = input.nextLine();

		String lastName[] = name.split(" ");

		System.out.println();
		System.out.printf("Seu sobrenome e %s ?", lastName[lastName.length - 1]);

	}

}

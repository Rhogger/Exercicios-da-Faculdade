import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String phrase;

		System.out.println("Digite qualquer coisa abaixo: ");
		System.out.println();

		phrase = input.nextLine();

		int spaces = 0, vowels = 0, letters = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ') {
				spaces++;
			} else if (phrase.toLowerCase().charAt(i) == 'a' || phrase.toLowerCase().charAt(i) == 'e'
					|| phrase.toLowerCase().charAt(i) == 'i' || phrase.toLowerCase().charAt(i) == 'o'
					|| phrase.toLowerCase().charAt(i) == 'u') {
				vowels++;
			} else if (phrase.toLowerCase().charAt(i) >= 97 && phrase.toLowerCase().charAt(i) <= 122) {
				letters++;
			}
		}
		
		System.out.println();
		System.out.printf("Existem %d espaços nessa String!",spaces);
		System.out.println();
		System.out.printf("Existem %d vogais nessa String!",vowels);
		System.out.println();
		System.out.printf("Essa String possui %d letras!",letters+vowels);
		System.out.println();
		System.out.printf("Essa String possui %d caracteres!",phrase.length());
	}

}

import java.util.Iterator;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Insira os valores do vetor: ");
			vetor[i] = input.nextInt();
			soma = soma + vetor[i];
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("A soma total é: %d", soma);

	}
}

import java.util.Scanner;

public class Exercicio1fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("\n\n\t\t----- Serie de Fibonacci -----\n\n");
		System.out.println("Digite a quantidade de numeros para imprimir da serie de Fibonacci: ");
		num = sc.nextInt();
		System.out.printf("\n\nOs %d primeiros números da série de Fibonacci: ", num);
		System.out.print("| ");
		for (int i = 1; i <= num; i++) {
			System.out.print(calculaFibonacci(i) + " | ");
		}

		sc.close();
	}

	public static int calculaFibonacci(int num) {
		if (num == 1) {
			return 0;
		} else if (num == 2) {
			return 1;
		} else
			return calculaFibonacci(num - 1) + calculaFibonacci(num - 2);
	}
}
public class ExercicioFibonacci {
	public static void main(String[] args) {

		System.out.println("\n\n----- Serie de Fibonacci -----\n\n");
		System.out.println("Os 30 primeiros numeros da serie de Fibonacci: ");
		for (int i = 1; i <= 30; i++) {
			System.out.printf("\n\t %d", calculaFibonacci(i));
		}
		System.out.print("\n");
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
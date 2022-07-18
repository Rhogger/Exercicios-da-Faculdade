import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = 0, b = 0;
		boolean cond= false;

		do {
			try {
				System.out.println();
				System.out.println();
				System.out.print("Insira o valor de A: ");
				a = input.nextInt();
				System.out.println();

				System.out.print("Insira o valor de B: ");
				b = input.nextInt();
				System.out.println();

				System.out.printf("A divisão de B por A é: %d", realizarDivisao(a, b));
				System.out.println();
			} catch (ArithmeticException divisao_por_0) {
				System.out.println("Não é possível dividir por 0!");
			} catch (InputMismatchException tipo_variavel) {
				System.out.println("A entrada de dados não é do tipo inteiro");
			} catch (Exception indefinido) {
				System.out.println("Houve um erro com a operação!");
			}
			
			if(a==0 && b==0) {
				cond=true;
			}
		} while (cond == false);
	}

	static int realizarDivisao(int a, int b) {
		return b / a;
	}

}

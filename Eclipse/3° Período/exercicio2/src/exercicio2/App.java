package exercicio2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.print("Insira o nome do funcionário: ");
		funcionario.setName(input.nextLine());

		System.out.print("\nInsira o sobrenome do funcionario: ");
		funcionario.setSurname(input.nextLine());

		System.out.printf("\nQuantas horas o/a %s trabalhou esse mês? ", funcionario.fullName());
		funcionario.setWorkedHours(input.nextFloat());

		System.out.printf("Quantos R$ o %s recebe por hora?  ", funcionario.fullName());
		funcionario.setValuePerHour(input.nextFloat());

		System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		System.out.println("Nome Completo: " + funcionario.fullName());
		System.out.println("Salário Base: " + funcionario.calculateSalary());
		System.out.print("Horas Extra no Mês: ");
		funcionario.incrementHours(input.nextFloat());
		System.out.println("Salario Completo: " + funcionario.calculateSalary());
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

	}

}

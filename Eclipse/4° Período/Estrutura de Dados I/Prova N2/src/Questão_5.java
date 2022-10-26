import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questão_5 {

	public static Queue queue = new LinkedList();

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		int password = 1, option;

		do {

			menu();

			option = input.nextInt();

			System.out.println();
			System.out.println();

			switch (option) {
			case 1:

				addPatient(password);
				password++;
				System.out.println();
				break;

			case 2:
				attendPatient();
				System.out.println();
				break;

			case 3:
				isEmptyQueue();
				System.out.println();
				break;

			case 4:
				nextPatient();
				System.out.println();
				break;

			case 5:
				numberOfPatients();
				System.out.println();
				break;

			case 0:
				break;

			default:
				System.out.println("Essa opção é inválida.");
				System.out.println();
				break;
			}

			if (option != 1) {
				Thread.sleep(2000);	
			}
			
			Thread.sleep(2000);	
			clearConsole();

		} while (option != 0);
	}

	public static void menu() {
		System.out.println("Escolha uma das opções: ");
		System.out.println();

		System.out.println("1 - Inserir o paciente na fila de espera.");
		System.out.println("2 - Chamar o paciente para ser atendido.");
		System.out.println("3 - Verificar se a fila está cheia ou vazia.");
		System.out.println("4 - Verificar o próximo paciente a ser atendido.");
		System.out.println("5 - Informar quantos pacientes existem na fila de espera.");
		System.out.println("6 - Finalizar o expediente.");
		System.out.println();

		System.out.print("Escolha: ");
	}

	public static void addPatient(int password) {
		System.out.println("Paciente " + password + " entrou na fila.");
		queue.add(password);
	}

	public static void attendPatient() {
		if (queue.isEmpty() == false) {
			System.out.println("Paciente com senha: " + queue.poll() + " foi atendido!");
		} else {
			System.out.println("Não tem pacientes para atender.");
		}
	}

	public static void isEmptyQueue() {
		if (queue.isEmpty() == true) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("A fila está cheia.");
		}
	}

	public static void nextPatient() {
		if (queue.isEmpty() == false) {
			System.out.println("O proximo paciente será o de senha: " + queue.element());
		} else {
			System.out.println("Este foi o último paciente.");
		}
	}

	public static void numberOfPatients() {
		System.out.println("A fila possui " + queue.size() + " pacientes.");
	}

	public static void clearConsole() {
		System.out.println(
				"\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t\n\t");
	}
}

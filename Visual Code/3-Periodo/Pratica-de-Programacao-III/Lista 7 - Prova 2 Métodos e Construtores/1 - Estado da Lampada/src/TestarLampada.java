import java.util.Scanner;

public class TestarLampada {

	public static void main(String[] args) {

		boolean status = false;
		int potencia, escolha, opcao;

		Scanner input = new Scanner(System.in);
		Lampada lampada1 = new Lampada(true);
		Lampada lampada2 = new Lampada(20, false);

		do {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Escolha uma lâmpada para usar: ");
			System.out.println("0 - Nenhuma");
			System.out.println("1 - Lâmpada 1");
			System.out.println("2 - Lâmpada 2");
			System.out.print("Escolha: ");
			escolha = input.nextInt();
			System.out.println();
			System.out.println();

			if (escolha == 1) {
				do {

					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("Escolha uma das ações: ");
					System.out.println("0 - Nenhuma");
					System.out.println("1 - Ligar a Luz");
					System.out.println("2 - Desligar a Luz");
					System.out.println("3 - Definir potência");
					System.out.println("4 - Verificar estado da Lâmpada");
					System.out.println("5 - Verificar potência da Lâmpada");
					System.out.print("Escolha: ");
					opcao = input.nextInt();
					System.out.println();

					switch (opcao) {
					case 0:
						status = true;
						break;

					case 1:
						System.out.println("Luz acesa!");
						lampada1.acender();
						break;

					case 2:
						System.out.println("Luz desligada!");
						lampada1.apagar();
						break;

					case 3:
						System.out.print("Insira a potência da Lâmpada: ");
						lampada1.definirPotencia(input.nextInt());
						break;

					case 4:
						lampada1.informarSituacao();
						break;

					case 5:
						lampada1.informarPotencia();
						break;

					default:
						System.out.println("Número inserido inválido!");
						break;
					}
				} while (status == false);
			} else if (escolha == 2) {
				do {

					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("Escolha uma das ações: ");
					System.out.println("0 - Nenhuma");
					System.out.println("1 - Ligar a Luz");
					System.out.println("2 - Desligar a Luz");
					System.out.println("3 - Definir potência");
					System.out.println("4 - Verificar estado da Lâmpada");
					System.out.println("5 - Verificar potência da Lâmpada");
					System.out.print("Escolha: ");
					opcao = input.nextInt();
					System.out.println();

					switch (opcao) {
					case 0:
						status = true;
						break;

					case 1:
						System.out.println("Luz acesa!");
						lampada2.acender();
						break;

					case 2:
						System.out.println("Luz desligada!");
						lampada2.apagar();
						break;

					case 3:
						System.out.print("Insira a potência da Lâmpada: ");
						lampada2.definirPotencia(input.nextInt());
						break;

					case 4:
						lampada2.informarSituacao();
						break;

					case 5:
						lampada2.informarPotencia();
						break;

					default:
						System.out.println("Número inserido inválido!");
						break;
					}
				} while (status == false);
			} else if (escolha == 0) {
				break;
			} else {
				System.out.println("Número informado inválido!");
			}

			status = false;

		} while (escolha != 0);
	}

}

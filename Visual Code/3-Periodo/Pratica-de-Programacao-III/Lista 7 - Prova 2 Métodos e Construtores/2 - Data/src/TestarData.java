public class TestarData extends Data {
	
	public TestarData(int dia, int mes, int ano) {
		super(dia, mes, ano);
		
	}

	public static void main(String[] args) {

		System.out.println("Data de hoje: ");
		Data hoje = new Data(17, 05, 2022);
		hoje.printData();

		System.out.println("\nNatal: ");
		Data natal = new Data(25, 12, 2022);
		natal.printData();

		System.out.println("\nTeste dia de hoje:");
		TestarData hoje1 = new TestarData(17, 05, 2002);
		hoje1.escreverOMes();
		hoje1.verificarAnoBissexto();
		hoje1.quantoFaltaFimDoAno();

		System.out.println("\nTeste data natal: ");
		TestarData Natal = new TestarData(25, 12, 2022);
		Natal.escreverOMes();
		Natal.verificarAnoBissexto();
		Natal.quantoFaltaFimDoAno();

	}


	void escreverOMes() {
		String nomeDoMes;
		switch (mes) {
		case 1:
			nomeDoMes = "Janeiro";
			break;
		case 2:
			nomeDoMes = "Fevereiro";
			break;
		case 3:
			nomeDoMes = "Mar�o";
			break;
		case 4:
			nomeDoMes = "Abril";
			break;
		case 5:
			nomeDoMes = "Maio";
			break;
		case 6:
			nomeDoMes = "Junho";
			break;
		case 7:
			nomeDoMes = "Julho";
			break;
		case 8:
			nomeDoMes = "Agosto";
			break;
		case 9:
			nomeDoMes = "Setembro";
			break;
		case 10:
			nomeDoMes = "Outubro";
			break;
		case 11:
			nomeDoMes = "Novembro";
			break;
		case 12:
			nomeDoMes = "Dezembro";
			break;
		default:
			nomeDoMes = "inv�lido";
			break;
		}

		System.out.println(nomeDoMes);
	}

	public void verificarAnoBissexto() {
		if (ano % 400 == 0) {
			System.out.println("O ano é bissexto");
		} else {
			if ((ano % 4 == 0) && (ano % 100 != 0)) {
				System.out.println("O ano é bissexto");
			} else {
				System.out.println("O ano não é bissexto");
			}
		}

	}

	public void quantoFaltaFimDoAno() {
		int dias, i;
		dias = 0;

		for (i = mes; i <= 12; i = i + 1) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = dias + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dias = dias + 30;
				break;
			case 2:
				if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
					dias = dias + 29;
				} else {
					dias = dias + 28;
				}
				break;
			}
		}

		dias = dias - dia;

		System.out.println("Faltam " + dias + " dias para o fim do ano");

	}

}

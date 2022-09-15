
public class App {

	/*
	 * Quando você têm partes similares do código que podem ser agrupadas,
	 * geralmente código que está duplicado, então você deve mover essas partes para
	 * um novo método que tenha um nome que faça sentido.
	 * 
	 * A principal motivação para esta refatoração é eliminar do código métodos
	 * muito grandes que realizam mais de uma tarefa e geralmente precisam estar
	 * cheios de comentários para que seja compreendido.
	 */

	public void imprimirSaldo() {
		Response.write("Saldo da conta do cliente" + getConta());
	}
	
	public void imprimirNome() {
		Response.write("Nome: " + get_nome());
	}
	
	public void imprimirValor() {
		Response.write("Valor: " + get_valor());
	}

	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}

	public String get_nome() {
		return _nome;
	}
	
	public void set_nome(int _nome) {
		this._nome = _nome;
	}

	public int get_valor() {
		return _valor;
	}
	
	public void set_valor(int _valor) {
		this._valor = _valor;
	}
	
	
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//

	public double calculaPrecoTotal(Collection<Item> items, boolean clienteVIP){
		
		double total = 0;
		
		for (Item item : items) {
			total += item.getPreco();
		}
		
		if (clienteVIP) {
			total *= 0.90;
		} else {
			total *= 0.95;
		}
		
		DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
		
		if (diaSemana == DayOfWeek.SUNDAY) {
			total += 10.00;
		{ else {
			total += 5.00;
		}
	}

}

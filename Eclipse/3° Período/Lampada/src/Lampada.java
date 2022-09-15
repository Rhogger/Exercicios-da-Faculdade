public class Lampada {

	int potencia;
	boolean acesa;

	public Lampada(boolean acesa) {
		super();
		this.acesa = acesa;
	}

	public Lampada(int potencia, boolean acesa) {
		super();
		this.potencia = potencia;
		this.acesa = acesa;
	}

	void acender() {
		acesa = true;
	}

	void apagar() {
		acesa = false;
	}

	void informarSituacao() {
		if (acesa == true) {
			System.out.println("A luz está acesa");
		} else {
			System.out.println("A luz está apagada");
		}
	}

	public void definirPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	void informarPotencia() {
		System.out.println("A potência da lâmpada é " + potencia);
	}

}
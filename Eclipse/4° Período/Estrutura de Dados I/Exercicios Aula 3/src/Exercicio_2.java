public class Exercicio_2 extends ScannerInput {

	String phrase1, phrase2, phrase;

	public void setPhrase1() {
		this.phrase1 = input.nextLine();
	}

	public void setPhrase2() {
		this.phrase2 = input.nextLine();
	}

	public void concatPhrase() {
		this.phrase = phrase1 + " " + phrase2;
	}

	public String getPhrase() {
		return phrase;
	}
}

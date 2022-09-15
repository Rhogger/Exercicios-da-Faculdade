public class Exercicio_1 extends ScannerInput {

	String phrase;

	public void setPhrase() {
		this.phrase = input.nextLine();
	}

	public int getPhraseLength() {
		return phrase.length();
	}
}

public class Exercicio_5 extends ScannerInput {

	String phrase;

	public void setPhrase() {
		this.phrase = input.nextLine();
	}

	public int quantityOfA() {
		int a = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.toLowerCase().charAt(i) == 'a') {
				a++;
			}
		}

		return a;
	}
}

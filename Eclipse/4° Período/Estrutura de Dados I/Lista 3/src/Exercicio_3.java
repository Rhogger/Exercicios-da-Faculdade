import java.util.Iterator;

public class Exercicio_3 extends ScannerInput {

	String phrase;

	public void setPhrase() {
		this.phrase = input.nextLine();
	}

	public int getPhraseLength() {
		return this.phrase.length();
	}

	public int getWordsOfPhrase() {
		int words = 0;
		int letters = 0;

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ') {
				letters++;
			}

			if (phrase.charAt(i) == ' ' && letters > 0) {
				words++;
				letters = 0;
			}
		}

		if (letters > 0) {
			words++;
		}

		return words;
	}
}

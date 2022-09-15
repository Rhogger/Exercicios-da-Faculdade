public class Exercicio_1 extends ScannerInput {

	String phrase;

	public void setPhrase() {
		this.phrase = input.nextLine();
	}

	public int getPhraseLength() {
		return this.phrase.length();
	}

	public String getPhraseToUpperCase() {
		return this.phrase.toUpperCase();
	}

	public int getQuantityOfVowels() {
		int quantityOfVowels = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.toLowerCase().charAt(i) == 'a' || phrase.toLowerCase().charAt(i) == 'e'
					|| phrase.toLowerCase().charAt(i) == 'i' || phrase.toLowerCase().charAt(i) == 'o'
					|| phrase.toLowerCase().charAt(i) == 'u') {
				quantityOfVowels++;
			}
		}

		return quantityOfVowels;
	}

	public boolean IsPhraseStarts() {
		return this.phrase.toUpperCase().startsWith("UNI");
	}

	public boolean IsPhraseEnds() {
		return this.phrase.toUpperCase().endsWith("ADO");
	}

	public int getQuantityOfNumbers() {
		int quantityOfNumbers = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == '0' || phrase.charAt(i) == '1' || phrase.charAt(i) == '2' || phrase.charAt(i) == '3'
					|| phrase.charAt(i) == '4' || phrase.charAt(i) == '5' || phrase.charAt(i) == '6'
					|| phrase.charAt(i) == '7' || phrase.charAt(i) == '8' || phrase.charAt(i) == '9') {
				quantityOfNumbers++;
			}
		}

		return quantityOfNumbers;
	}

	public boolean IsPalimdrome() {
		StringBuilder str = new StringBuilder(phrase);
		String phrase2;

		phrase2 = str.reverse().toString();

		if (phrase.equals(phrase2)) {
			return true;
		} else {
			return false;
		}
	}
}

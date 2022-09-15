public class Exercicio_6 extends ScannerInput {

	String phrase[] = new String[5];
	String word;

	public void setPhrase() {
		for (int i = 0; i < phrase.length; i++) {
			this.phrase[i] = input.nextLine();
			System.out.println();
		}
	}

	public void setWord() {
		this.word = input.nextLine();
	}

	public boolean findWord() {
		for (int i = 0; i < 5; i++) {
			if (this.word.equals(this.phrase[i])) {
				return true;
			}
		}

		return false;
	}
}

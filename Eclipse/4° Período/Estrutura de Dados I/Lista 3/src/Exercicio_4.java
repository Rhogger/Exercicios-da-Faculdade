public class Exercicio_4 extends ScannerInput {

	String phrase;

	public void setPhrase() {
		this.phrase = input.nextLine();
	}

	public String getPhrase() {
		return phrase;
	}

	public void removeVowels() {
		String phraseModified = "";
		
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.toLowerCase().charAt(i) != 'a' 
			 && phrase.toLowerCase().charAt(i) != 'e'
		   	 && phrase.toLowerCase().charAt(i) != 'i' 
		 	 && phrase.toLowerCase().charAt(i) != 'o'
			 && phrase.toLowerCase().charAt(i) != 'u') {
				phraseModified += phrase.charAt(i);
			}
		}

		phrase = phraseModified;
	}
}

public class Exercicio_2 extends ScannerInput {

	String phrase, initials = "";

	public void setPhrase() {
		this.phrase = input.nextLine();
	}

	public String getInitials() {
		return initials;
	}

	public void generateInitials() {
		if (verifyPrepositions() == false) {
			for (int i = 0; i < phrase.length(); i++) {

				if (phrase.charAt(i) == ' ' && phrase.charAt(i + 1) != ' ') {
					initials += phrase.toUpperCase().charAt(i + 1);
				}
			}
		} else if (verifyPrepositions() == true) {
			boolean validate = true;

			for (int i = 0; i < phrase.length(); i++) {
				if (i == 0 && phrase.charAt(i) != ' ') {
					initials += phrase.toUpperCase().charAt(i);
				}

				if (phrase.charAt(i) == ' ') {
					if (i + 2 < phrase.length()) {
						if (phrase.charAt(i + 2) == ' ') {
							if (phrase.substring(i + 1, i + 2).equalsIgnoreCase("E")) {
								validate = false;
							}
						}

						if (phrase.charAt(i + 3) == ' ') {
							if (phrase.substring(i + 1, i + 3).equalsIgnoreCase("DA")
									|| phrase.substring(i + 1, i + 3).equalsIgnoreCase("DE")
									|| phrase.substring(i + 1, i + 3).equalsIgnoreCase("DI")
									|| phrase.substring(i + 1, i + 3).equalsIgnoreCase("DO")
									|| phrase.substring(i + 1, i + 3).equalsIgnoreCase("DU")) {
								validate = false;
							}
						}
					}

					if (i + 3 < phrase.length()) {
						if (phrase.charAt(i + 4) == ' ') {
							if (phrase.substring(i + 1, i + 4).equalsIgnoreCase("DAS")
									|| phrase.substring(i + 1, i + 4).equalsIgnoreCase("DOS")) {
								validate = false;
							}
						}
					}

					if (validate == true) {
						initials += phrase.toUpperCase().charAt(i + 1);
					}

					validate = true;
				}
			}
		}
	}

	public boolean verifyPrepositions() {
		if (this.phrase.toUpperCase().contains(" DA ") ||
			this.phrase.toUpperCase().contains(" de ")
			|| this.phrase.toUpperCase().contains(" DI ") 
			|| this.phrase.toUpperCase().contains(" DO ")
			|| this.phrase.toUpperCase().contains(" DU ") 
			|| this.phrase.toUpperCase().contains(" DAS ")
			|| this.phrase.toUpperCase().contains(" DOS ") 
			|| this.phrase.toUpperCase().contains(" DA ")
			|| this.phrase.toUpperCase().contains(" E ")) {
			return true;
		}
		return false;
	}
}
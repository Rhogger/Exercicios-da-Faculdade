//Questão 4

public class Document {
	String name;
	int numberOfSheets;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSheets() {
		return numberOfSheets;
	}

	public void setNumberOfSheets(int numberOfSheets) {
		this.numberOfSheets = numberOfSheets;
	}

	@Override
	public String toString() {
		return "Nome: " + name + ".docx\n" + "Quantidade: " + numberOfSheets + "\n\n";
	}
	
	

}

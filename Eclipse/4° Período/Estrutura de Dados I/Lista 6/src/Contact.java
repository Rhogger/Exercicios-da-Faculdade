public class Contact {

	String name;
	String address;
	String number;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Contato [Nome: " + name + "\nEndereço: " + address + "\nNúmero Celular: " + number + "]";
	}
}

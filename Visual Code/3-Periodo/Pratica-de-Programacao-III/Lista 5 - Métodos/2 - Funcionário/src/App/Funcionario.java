public class Funcionario {

	private String name, surname;
	private float workedHours, valuePerHour, salary;

	public Funcionario() {

	}

	public Funcionario(String name, String surname, float workedHours, float valuePerHour) {
		super();
		this.name = name;
		this.surname = surname;
		this.workedHours = workedHours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setWorkedHours(float workedHours) {
		this.workedHours = workedHours;
	}

	public void setValuePerHour(float valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public String fullName() {

		return this.name + " " + this.surname;
	}

	public float calculateSalary() {

		this.salary = this.workedHours * this.valuePerHour;

		return salary;
	}

	public void incrementHours(float amount) {
		this.workedHours += amount;
	}
}

public class Login {

	private String user, pass, email;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void validEmail() {

		int validArroba = email.indexOf("@");
		int validDot = email.indexOf(".");
		String validName = email.substring(0, validArroba - 1);

		if ((validArroba < validDot) && validName.length() > 2 ) {
			System.out.println("E-mail válido!");
		} else {
			System.out.println("E-mail inválido!");
		}
	}

}

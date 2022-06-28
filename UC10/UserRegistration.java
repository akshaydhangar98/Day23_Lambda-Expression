package Day20UserRegistrationJUnit;

public class UserRegistration {

	public boolean firstName(String name) {
		String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(firstName)) {
			return true;
		}
		return false;
	}
	
	public static boolean lastName(String lastName) {
		String LastName = "[A-Z]{1}[a-z]{3}";
		if(lastName.matches(lastName)) {
			return true;
		}
		return false;
	}
	
	public static boolean emailId(String emailId) {
		String pattern="^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		if(emailId.matches(pattern)) {
			return true;
		}
		return false;
	}
	
	public static boolean mobileNumber(String mobileNumber) {
		String mobileNo = "^(91)\\s{1}[7-9]{1}[0-9]{9}$";
		if (mobileNumber.matches(mobileNo)) {
			return true;
		}
		return false;
	}
	
	public static boolean password(String password) {
		String pass = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
		if(password.matches(pass)) {
			return true;
		}
		return false;
	}
}
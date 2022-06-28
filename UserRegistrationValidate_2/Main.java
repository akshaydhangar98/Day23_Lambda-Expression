package UserRegistrationValidate_2;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		UserRegistration userregistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FirstName");
		String firstName = sc.nextLine();
		userregistration.validateFirstName(firstName);
		
		System.out.println("Enter the LastName");
		String lastname = sc.nextLine();
		userregistration.validateLastName(lastname);
		
		System.out.println("Enter the Email");
		String emailId = sc.nextLine();
		userregistration.validateEmail(emailId);
		
		System.out.println("Enter the Mobile No");
		String mobileNo = sc.nextLine();
		userregistration.validateMobileNo(mobileNo);
		
		System.out.println("Enter the Password");
		String Password = sc.nextLine();
		userregistration.validatePassword(Password);
		userregistration.register();
		
	}
}
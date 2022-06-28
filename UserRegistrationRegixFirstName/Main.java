package UserRegistrationRegixFirstName;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		UserRegistration userregistration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FirstName");
		String firstName = sc.nextLine();
		userregistration.validateFirstName(firstName);
		
	}	
}



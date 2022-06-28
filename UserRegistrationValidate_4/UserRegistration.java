package UserRegistrationValidate_4;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void validateFirstName(String firstName) {
    	String nameRegix = "^[A-Z][a-z]{2,}$";
    	Pattern pattern = Pattern.compile(nameRegix);
    	if(pattern.matcher(firstName).matches()) {
    		System.out.println(" FirstName is Valid");
    	}else
    	{
    		System.out.println("FirstName is Invalid");
    	}
 }
 
 public static void validateLastName(String lastname) {
    	String lname = "^[A-Z][a-z]{2,}$";
    	Pattern pattern = Pattern.compile(lname);
    	if(pattern.matcher(lastname).matches()) {
    		System.out.println(" LastName is Valid");
    	}else
    	{
    		System.out.println("LastName is Invalid");
    	}
 }
 public static void validateEmail(String emailId) {
    	String email = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    	Pattern pattern = Pattern.compile(email);
    	if(pattern.matcher(emailId).matches()) {
    		System.out.println(" Email is Valid");
    	}else
    	{
    		System.out.println("Email is Invalid");
    	}
 }
 public static void validateMobileNo(String mobileNo) {
    	String mobile =  "^[0-9]{2}[0-9]{10}";
    	Pattern pattern = Pattern.compile(mobile);
    	if(pattern.matcher(mobileNo).matches()) {
    		System.out.println(" Mobile no is Valid");
    	}else
    	{
    		System.out.println("Mobile no is Invalid");
    	}
 }
 public static void validatePassword(String Password) {
    	String pass = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
    	Pattern pattern = Pattern.compile(pass);
    	if(pattern.matcher(Password).matches()) {
    		System.out.println("Password is Valid");
    	}else
    	{
    		System.out.println("Password is Invalid");
    	}
 }
 
 public static void register() {
		 System.out.println("Registered Successfully..");
 }

}

package UserRegistrationRegixFirstName;

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
		
	}

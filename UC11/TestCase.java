package Day20;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCase {
	
	UserRegistration registration = new UserRegistration();

	@Test
	public void testFirstName() {
		
		assertTrue(registration.firstName("Akshay"));
		
	}
	
	@Test
	public void testLastName() {
		assertTrue(registration.lastName("Dhangar"));
	}
	
	@Test
	public void testEmailID() {
		assertTrue(registration.emailId("abc-xyz@gmail.com.in"));
	}
	
	@Test
	public void testMobileNumber() {
		assertTrue(registration.mobileNumber("91 9960322320"));
	}
	
	@Test
	public void testPassword() {
		assertTrue(registration.password("akshay@78"));
	}
}



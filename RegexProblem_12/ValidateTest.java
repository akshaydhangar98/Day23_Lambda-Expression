package RegexProblem_12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateTest {

	Validate validate = new Validate();

	@Test
	void givenFirstName_beingValid_shouldReturnTrue() {
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyFirstName("Akshay"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenFirstName_beingInValid_shouldReturnFalse() {
		Assertions.assertFalse(validate.isValidFirstName("akshay"));
		Assertions.assertFalse(validate.isValidFirstName("1akshay"));
		Assertions.assertFalse(validate.isValidFirstName("Ak"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyFirstName("akshay"));
			Assertions.assertFalse(userInput.verifyFirstName("1akshay"));
			Assertions.assertFalse(userInput.verifyFirstName("Ak"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenLastName_beingValid_shouldReturnTrue() {
		Assertions.assertTrue(validate.isValidLastName("DHANGAR"));
		Assertions.assertTrue(validate.isValidLastName("Dhangar"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyLastName("DHANGAR"));
			Assertions.assertTrue(userInput.verifyLastName("Dhangar"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenLastName_beingInValid_shouldReturnFalse() {
		Assertions.assertFalse(validate.isValidLastName("akshay"));
		Assertions.assertFalse(validate.isValidLastName("1akshay"));
		Assertions.assertFalse(validate.isValidLastName("Ak"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyLastName("akshay"));
			Assertions.assertFalse(userInput.verifyLastName("1akshay"));
			Assertions.assertFalse(userInput.verifyLastName("Ak"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	void givenEmail_beingValid_shouldReturnTrue() {
		Assertions.assertTrue(validate.isValidEmail("abc.xyz@bl.co.in"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyEMail("abc.xyz@bl.co.in"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmail_beingInValid_ShouldReturnFalse() {
		Assertions.assertFalse(validate.isValidEmail("abc.xyz@com"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyEMail("abc.xyz@bl.au.aa.in"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPhone_beingValid__ShouldReturnTrue() {
		Assertions.assertTrue(validate.isValidPhone("91 1234567890"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyMobile("91 1234567890"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPhone_beingInValid_ShouldReturnFalse() {
		Assertions.assertFalse(validate.isValidPhone("1234543210"));
		
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyMobile("1234543210"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPassword_beingValid__ShouldReturnTrue() {
		Assertions.assertTrue(validate.isValidPassword("Abcd@123"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertTrue(userInput.verifyPassword("Abcd@123"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPassword_beingInValid_ShouldReturnFalse() {
		Assertions.assertFalse(validate.isValidPassword("Pi32oh#%"));
		UserEntries userInput = new UserEntries();
		try {
			Assertions.assertFalse(userInput.verifyPassword("Pi32oh#%"));
		} catch (InvalidEntryExceptions e) {
			System.out.println(e);
		}
	}
}
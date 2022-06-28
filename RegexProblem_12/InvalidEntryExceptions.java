package RegexProblem_12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvalidEntryExceptions extends Exception {
	enum ExceptionType {
		INVALID_NAME, INVALID_MOBILE, INVALID_PASSWORD, INVALID_EMAIL
	}

	ExceptionType type;

	public InvalidEntryExceptions(ExceptionType type, String warning) {
		super(warning);
		this.type = type;
	}
}
package REGEXProblem_13;
@FunctionalInterface

public interface UserRegistrationInterface {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
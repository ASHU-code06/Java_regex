package User_Registeration;

public class UserValidator {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String email = "johndoe@example.com";
        String mobile = "917017222545";
        String password = "aS8@shmmmmmummm";

        // Using lambda functions to validate user entries
        validate(firstName, s -> s.matches("^[A-Z]{1}[a-z]{2,}$"), "Invalid first name");
        validate(lastName, s -> s.matches("^[A-Z]{1}[a-z]{2,}$"), "Invalid last name");
        validate(email, s -> s.matches("^[^.][A-Za-z0-9+-.]{1,}@[A-Za-z0-9+_-]{0,}[.][com|in|au|net]{1,3}[.]{0,1}[com|in|au|net]{1,3}$"), "Invalid email");
        validate(mobile, s -> s.matches("^[91]{2}[0-9]{10}$"), "Invalid mobile number");
        validate(password, s -> s.matches("^(?=.*[a-z]){1,}(?=.*[A-Z]){1,}(?=.*[0-9]){1,}(?=.*[$@$!%*?&])[A-Za-z0-9$@$!%*?&]{5,}$"), "Invalid password");
    }

    private static void validate(String input, Validator validator, String errorMessage) {
        if (validator.validate(input)) {
            System.out.println(input + " is valid.");
        } else {
            System.out.println(input + " is not valid. " + errorMessage);
        }
    }
}


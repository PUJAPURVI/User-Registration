public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName();
        userRegistration.validateLastName();
        userRegistration.validateEmail();
        userRegistration.validateMobileNumber();
        userRegistration.validatePassword();
    }
}

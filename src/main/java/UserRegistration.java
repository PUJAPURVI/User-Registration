
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistration {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public static final String EMAIL_PATTERN = "^[a-zA-Z]{3,}[.+-][a-zA-Z0-9]*[@][a-zA-Z]+[.][a-z]{3,}" +
            "([_+-.][a-zA-Z])*$";
    public static final String MOBILE_NUMBER_PATTERN = "^[+91|0]+[ ]?[6-9]{1}[0-9]{9}$";

    public static final String PASSWORD_PATTERN = "^[a-zA-Z0-9]{8,}$";

    public static final String PASSWORD_PATTERN_AT_LEAST_ONE_UPPER_CASE = "^((?=.*[A-Z]))[a-zA-Z0-9]{8,}$";

    public static final String PASSWORD_Pattern_AT_LEAST_ONE_NUMERIC_NAUMBER = "^(?=.*[A-Z])(?=.*[0-9])" +
            "[a-zA-Z0-9]{8,}$";

    public static final String PASSWORD_PATTERN_EXACTLY_ONE_SPECIAL_CHARACTER = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!%])" +
            "[a-zA-Z0-9$@!%]{8,}$";

    public static final String PASSWORD_PATTERN_ALL_EMAIL_SAMPLE = "^[a-z]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+." +
            "[a-z]{2,3}+([.,]?[a-z]{2,3}){0,1}$";
    ;


    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {
        return patternChecker(lastName, LAST_NAME_PATTERN);
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        return patternChecker(email, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        return patternChecker(mobileNumber, MOBILE_NUMBER_PATTERN);
    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        return patternChecker(password, PASSWORD_PATTERN);
    }

    public boolean validatePasswordAtLeastOneUpperCase(String password) throws UserRegistrationException{
        return patternChecker(password, PASSWORD_PATTERN_AT_LEAST_ONE_UPPER_CASE);
    }

    public boolean validatePasswordAtLeastOneNumericNumber(String password) throws UserRegistrationException {
        return patternChecker(password, PASSWORD_Pattern_AT_LEAST_ONE_NUMERIC_NAUMBER);
    }

    public boolean validatePasswordExactOneSpecialCharacter(String password) throws UserRegistrationException {
        return patternChecker(password, PASSWORD_PATTERN_EXACTLY_ONE_SPECIAL_CHARACTER);
    }

    public boolean validPasswordForAllEmailSample(String password) throws UserRegistrationException {
        return patternChecker(password, PASSWORD_PATTERN_ALL_EMAIL_SAMPLE);
    }

    private boolean patternChecker(String input, String fieldPattern) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,
                        "Please Give Valid Entry");
            return result;
        } catch (NullPointerException exception) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,
                    "Entry Should Be Not null ");
        }
    }

    public void validateFirstName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String name = sc.next();

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            System.out.println("Given First Name Is Valid.");
        } else {
            System.out.println("Given First Name Is InValid!");
        }
    }

    public void validateLastName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your last name");
        String name = sc.next();

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            System.out.println("Given Last Name Is Valid.");
        } else {
            System.out.println("Given Last Name Is InValid!");
        }
    }

    public void validateEmail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Email Id");
        String email = sc.next();

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Given Email Id Is Valid.");
        } else {
            System.out.println("Given Email Id Is InValid!");
        }
    }

    public void validateMobileNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Mobile Number");
        String mobile = sc.nextLine();

        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(mobile);

        if (matcher.matches()) {
            System.out.println("Given Mobile Number Is Valid.");
        } else {
            System.out.println("Given Mobile Number Is InValid!");
        }
    }

    public void validatePassword() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Password");
        String password = sc.next();

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Given Password Is Valid.");
        } else {
            System.out.println("Given Password Is InValid!");
        }
    }

}



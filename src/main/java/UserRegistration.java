
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
        public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
        public static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
        public static final String EMAIL_PATTERN = "^[a-zA-Z]{3,}[.+-][a-zA-Z0-9]*[@][a-zA-Z]+[.][a-z]{3,}" +
                "([_+-.][a-zA-Z])*$";
        public static final String MOBILE_NUMBER_PATTERN = "^[+91|0]+[ ]?[6-9]{1}[0-9]{9}$";

        public static final String PASSWORD_PATTERN =  "^[a-zA-Z0-9]{8,}$";

        public static final String PASSWORD_PATTERN_AT_LEAST_ONE_UPPER_CASE = "^((?=.*[A-Z]))[a-zA-Z0-9]{8,}$";

        public static final String PASSWORD_Pattern_AT_LEAST_ONE_NUMERIC_NAUMBER = "^(?=.*[A-Z])(?=.*[0-9])" +
            "[a-zA-Z0-9]{8,}$";

        public static final String PASSWORD_PATTERN_EXACTLY_ONE_SPECIAL_CHARACTER = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!%])" +
                "[a-zA-Z0-9$@!%]{8,}$";

        public static final String PASSWORD_PATTERN_ALL_EMAIL_SAMPLE = "^[a-z]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+." +
                "[a-z]{2,3}+([.,]?[a-z]{2,3}){0,1}$";;


    public boolean validateFirstName(String firstName) {
            return patternChecker(firstName, NAME_PATTERN);
        }
        public boolean validateLastName(String lastName) {
            return patternChecker(lastName, LAST_NAME_PATTERN);
        }
        public boolean validateEmail(String email) {
        return patternChecker( email, EMAIL_PATTERN);
        }
        public boolean validateMobileNumber(String mobileNumber) {
            return patternChecker(mobileNumber, MOBILE_NUMBER_PATTERN);
        }
        public boolean validatePassword(String password) {
            return patternChecker(password, PASSWORD_PATTERN);
        }
        public boolean validatePasswordAtLeastOneUpperCase(String password) {
            return patternChecker(password, PASSWORD_PATTERN_AT_LEAST_ONE_UPPER_CASE);
        }
        public boolean validatePasswordAtLeastOneNumericNumber(String password) {
        return patternChecker(password,PASSWORD_Pattern_AT_LEAST_ONE_NUMERIC_NAUMBER);
        }
        public boolean validatePasswordExactOneSpecialCharacter(String password) {
        return patternChecker(password,PASSWORD_PATTERN_EXACTLY_ONE_SPECIAL_CHARACTER);
        }
        public boolean validPasswordForAllEmailSample(String password) {
        return patternChecker(password,PASSWORD_PATTERN_ALL_EMAIL_SAMPLE);
        }

        public boolean patternChecker(String input, String fieldPattern) {
            Pattern pattern = Pattern.compile(fieldPattern);
            Matcher matcher = pattern.matcher(input);
            return matcher.matches();
        }
    }



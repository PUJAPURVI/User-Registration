
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Puja");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Nerkar");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Pu");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Ne");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Pu1");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Ne1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Nerk@r");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Nerk@r");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmail("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_whenValid_showReturnTrue() {
        boolean result = userRegistration.validateMobileNumber("+91 8780803252");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_whenValid_showReturnTrue() {
        boolean result = userRegistration.validatePassword("Pujan9876");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_atLeast_oneUpperCase() {
        boolean result = userRegistration.validatePasswordAtLeastOneUpperCase("Puja12334");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_atLeast_oneNumericNumber() {
        boolean result = userRegistration.validatePasswordAtLeastOneNumericNumber("Puja12@1");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_exactly_one_special_character() {
        boolean result = userRegistration.validatePasswordExactOneSpecialCharacter("Puja@123");
        Assert.assertTrue(result);
    }
    @Test
    public void givenAllEmailSample() {
        boolean result = userRegistration.validPasswordForAllEmailSample("abc.100@abc.com.au");
        Assert.assertTrue(result); ;
    }

}


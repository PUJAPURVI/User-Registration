
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
        boolean result = userRegistration.validatePasswordAtLeastOneNumericNumber("Purvi123");
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
    @Test

    public void lastNameSadTest() {
        boolean result = userRegistration.validateLastName("Bagle");
        Assert.assertTrue(result);
    }
    @Test
    public void firstNameSadTest() {
        boolean result = userRegistration.validateFirstName("Purvi");
        Assert.assertTrue(result);
    }
    @Test
    public void emailSadTest() {
        boolean result = userRegistration.validateEmail("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public void phoneNumberSadTest() {
        boolean result = userRegistration.validateMobileNumber("+91 9998686118");
        Assert.assertTrue(result);
    }
    @Test
    public void passwordSadTest() {
        boolean result = userRegistration.validatePassword("Puri3289");
        Assert.assertTrue(result);
    }
    @Test
    public void passwordAtLeastOneUpperCaseSadTest() {
        boolean result = userRegistration.validatePasswordAtLeastOneUpperCase("Purvi12334");
        Assert.assertTrue(result);
    }
    @Test
    public void passwordAtLeastOneSpecialCharacterSadTest() {
        boolean result = userRegistration.validatePasswordExactOneSpecialCharacter("Purvi@12334");
        Assert.assertTrue(result);
    }
    @Test
    public void passwordAtLeastOneNumericNumberSadTest() {
        boolean result = userRegistration.validatePasswordAtLeastOneNumericNumber("Purvi123");
        Assert.assertTrue(result);
    }
    @Test
    public void allEmailSampleSadTest() {
        boolean result = userRegistration.validPasswordForAllEmailSample("abc.100@abc.com.au");
        Assert.assertTrue(result);
    }




}


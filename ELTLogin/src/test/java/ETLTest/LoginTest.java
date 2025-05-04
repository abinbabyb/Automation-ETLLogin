package ETLTest;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.BaseTest;

import com.pages.LoginPage;
import com.pages.SecureAreaPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickLogin();

        SecureAreaPage securePage = new SecureAreaPage(driver);
        Assert.assertEquals(securePage.getSuccessMessage(), "Logged In Successfully", "Login success message mismatch");
    }

    @Test
    public void testInvalidUsername() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("invalidUser");
        login.enterPassword("Password123");
        login.clickLogin();

        Assert.assertEquals(login.getErrorMessage(), "Your username is invalid!", "Error message mismatch for invalid username");
    }

    @Test
    public void testInvalidPassword() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("student");
        login.enterPassword("WrongPass");
        login.clickLogin();

        Assert.assertEquals(login.getErrorMessage(), "Your password is invalid!", "Error message mismatch for invalid password");
    }
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test(priority = 1, description = "Valid login should redirect to inventory page")
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),
            "Login failed - URL doesn't contain inventory");
        System.out.println("✅ Valid login test PASSED");
    }

    @Test(priority = 2, description = "Invalid login should show error message")
    public void testInvalidLogin() {
        driver.get("https://www.saucedemo.com");
        LoginPage login = new LoginPage(driver);
        login.enterUsername("wrong_user");
        login.enterPassword("wrong_pass");
        login.clickLogin();
        Assert.assertTrue(login.isErrorDisplayed(),
            "Error message not shown for invalid login");
        System.out.println("✅ Invalid login test PASSED");
    }

    @Test(priority = 3, description = "Empty credentials should show error")
    public void testEmptyLogin() {
        driver.get("https://www.saucedemo.com");
        LoginPage login = new LoginPage(driver);
        login.clickLogin();
        Assert.assertTrue(login.isErrorDisplayed(),
            "Error message not shown for empty credentials");
        System.out.println("✅ Empty login test PASSED");
    }
}

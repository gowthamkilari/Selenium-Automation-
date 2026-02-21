package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.InventoryPage;
import utils.BaseTest;

public class InventoryTest extends BaseTest {

    private void doLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
    }

    @Test(priority = 1, description = "Verify inventory page title is 'Products'")
    public void testInventoryPageTitle() {
        doLogin();
        InventoryPage inventory = new InventoryPage(driver);
        Assert.assertEquals(inventory.getPageTitle(), "Products",
            "Inventory page title mismatch");
        System.out.println("✅ Inventory page title test PASSED");
    }

    @Test(priority = 2, description = "Add first item to cart and verify count")
    public void testAddToCart() {
        driver.get("https://www.saucedemo.com");
        doLogin();
        InventoryPage inventory = new InventoryPage(driver);
        inventory.addFirstItemToCart();
        Assert.assertEquals(inventory.getCartCount(), "1",
            "Cart count should be 1 after adding item");
        System.out.println("✅ Add to cart test PASSED");
    }
}

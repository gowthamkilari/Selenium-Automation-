package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    By pageTitle    = By.className("title");
    By addToCartBtn = By.xpath("(//button[text()='Add to cart'])[1]");
    By cartIcon     = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public void addFirstItemToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public String getCartCount() {
        return driver.findElement(cartIcon).getText();
    }
}

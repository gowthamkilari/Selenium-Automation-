# Selenium WebDriver Automation Test Suite

A Java-based test automation framework using Selenium WebDriver, TestNG, and Page Object Model (POM).

## Tech Stack
- Java 17
- Selenium WebDriver 4.18.1
- TestNG 7.9.0
- WebDriverManager 5.7.0
- Maven

## Project Structure
```
SeleniumAutomation/
├── src/test/java/
│   ├── pages/          # Page Object Model classes
│   │   ├── LoginPage.java
│   │   └── InventoryPage.java
│   ├── tests/          # Test cases
│   │   ├── LoginTest.java
│   │   └── InventoryTest.java
│   └── utils/          # Base setup
│       └── BaseTest.java
├── testng.xml          # TestNG suite configuration
└── pom.xml             # Maven dependencies
```

## Test Cases
| Test | Description |
|------|-------------|
| testValidLogin | Valid credentials redirect to inventory |
| testInvalidLogin | Invalid credentials show error message |
| testEmptyLogin | Empty fields show error message |
| testInventoryPageTitle | Inventory page title is "Products" |
| testAddToCart | Add item to cart updates cart count to 1 |

## How to Run

### Prerequisites
- Java JDK 17+
- Maven installed
- Google Chrome browser

### Run via Maven
```bash
mvn test
```

### Run via Eclipse/VS Code
- Right-click `testng.xml` → Run As → TestNG Suite

## Website Under Test
**https://www.saucedemo.com**
- Username: `standard_user`
- Password: `secret_sauce`

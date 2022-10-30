package pl.coderslab.seleniumcourseonlteaw29;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pl.coderslab.seleniumcourseonlteaw29.Utils.assertVisibleAndEnabled;

public class FunkcjeZad1Test {
    @Test
    public void findElementsById() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // 1
        WebElement signInLink = driver.findElement(By.cssSelector(".user_login.navigation-link"));
        signInLink.click();
        // 2
        WebElement emailInput = driver.findElement(By.id("email_create"));
        emailInput.clear();
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);
        WebElement submitButton = driver.findElement(By.id("SubmitCreate"));
        submitButton.click();
        // 3
        WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
        assertVisibleAndEnabled(firstNameInput);
        WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
        assertVisibleAndEnabled(lastNameInput);
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        assertVisibleAndEnabled(passwordInput);
    }
}

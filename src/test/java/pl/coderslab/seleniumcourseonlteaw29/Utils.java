package pl.coderslab.seleniumcourseonlteaw29;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class Utils {
    public static void assertVisibleAndEnabled(WebElement element) {
        if(!element.isEnabled() || !element.isDisplayed()) {
            Assertions.fail("Element is NOT enabled or NOT displayed");
        }
    }
}

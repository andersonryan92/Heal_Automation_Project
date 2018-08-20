import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement element = null;


    public static WebElement signinButton(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.id("signin-button")));
        return element;
    }
}

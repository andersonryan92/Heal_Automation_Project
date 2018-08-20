import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {


    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement element = null;


    public static WebElement emailField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"user\"]")));
        return element;
    }

    public static WebElement passwordField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"password\"]")));
        return element;
    }

    public static WebElement noAccountButton(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.EbJovIPvyYo7HVr0NUSyb > div")));
        return element;
    }

    public static WebElement loginButton(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("._1QEBGPurhNZnPj861hxm_4")));
        return element;
    }
}

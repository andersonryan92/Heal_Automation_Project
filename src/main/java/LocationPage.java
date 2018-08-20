import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationPage {


    WebDriver driver;

    public LocationPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement element = null;


    // select location

    public static WebElement addHome(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("._12IXdXsHOCH4RnqJSt7UkD > div:nth-child(1)")));
        return element;
    }


    public static WebElement addressField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".geosuggest__input")));
        return element;
    }

    public static WebElement firstSuggestedAddress(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".geosuggest__item geosuggest__item--active")));
        return element;
    }


    public static WebElement saveButton(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("._1QEBGPurhNZnPj861hxm_4")));
        return element;
    }


    public static WebElement setLocation(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("._1QEBGPurhNZnPj861hxm_4")));
        return element;
    }





















}

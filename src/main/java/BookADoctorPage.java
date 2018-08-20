import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookADoctorPage {


    WebDriver driver;

    public BookADoctorPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement element = null;


    // select location

    public static WebElement selectLocation(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("._3db39Ig3ymQjaU_BkhhLY0 >* td.UvAAUf-PnsnFI4b75Xgh9")));
        return element;
    }

    // select patient


    public static WebElement selectPatient(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".taeuQT1Eez27ZDgCSjBTg > table:nth-child(2) >* td.UvAAUf-PnsnFI4b75Xgh9")));
        return element;
    }

    // select reason

    public static WebElement selectReason(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".taeuQT1Eez27ZDgCSjBTg > table:nth-child(3) >* .UvAAUf-PnsnFI4b75Xgh9")));
        return element;
    }


    // select schedule

    public static WebElement selectSchdule(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".taeuQT1Eez27ZDgCSjBTg > table:nth-child(4) >* .UvAAUf-PnsnFI4b75Xgh9")));
        return element;
    }
}

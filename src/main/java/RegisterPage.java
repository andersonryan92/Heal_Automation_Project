import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class RegisterPage {


    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement element = null;



    // first name

    public static WebElement firstnameField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='firstName']")));
        return element;
    }



    // last name

    public static WebElement lastnameField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='lastName']")));
        return element;
    }


    // email

    public static WebElement emailField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='email']")));
        return element;
    }


    // phone

    public static WebElement phoneField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-control")));
        return element;
    }



    // password


    public static WebElement passwordField(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='password']")));
        return element;
    }

    // confirm password

    public static WebElement passwordField2(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='password2']")));
        return element;
    }


    // create account button


    public static WebElement createAccountButton(WebDriver driver) {
        element = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("._2w0wCSU0X56TJ09kmyMP9r")));
        return element;
    }

}

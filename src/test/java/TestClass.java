import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;

public class TestClass {


    public WebDriver driver;
    public String baseURL;



    @BeforeEach
    void setup() throws Exception {

        // setup driver
        WebDriverManager.chromedriver().setup();

        // creating new ChromeDriver instance
        driver = new ChromeDriver();

        // setting the base URL
        baseURL = "https://heal.com/";

        // maximze browser window
        driver.manage().window().maximize();

        // navigate to baseurl
        driver.get(baseURL);
    }

    // create global timestamp variable for creating unique email addresses
    Timestamp tm = new Timestamp(System.currentTimeMillis());
    long currentTime = tm.getTime();



    @Test
    @DisplayName("navigate to heal.com and create an account")
    void testCase1() throws Exception {

        // click sign in button on homepage
        Homepage.signinButton(driver).click();

        // click no account button on login page
        LoginPage.noAccountButton(driver).click();

        // enter in first name in name field
        RegisterPage.firstnameField(driver).sendKeys("Ryan");

        // enter in last name in last name field
        RegisterPage.lastnameField(driver).sendKeys("Anderson");

        // enter in email address
        RegisterPage.emailField(driver).sendKeys("email" + currentTime + "@example.com");

        // enter in phone number
        RegisterPage.phoneField(driver).sendKeys("1234567890");

        // enter in password
        RegisterPage.passwordField(driver).sendKeys("Password123");

        // enter in password for confirmation field
        RegisterPage.passwordField2(driver).sendKeys("Password123");


        // click create account button
        RegisterPage.createAccountButton(driver).click();

        // allow next page to load
        Thread.sleep(3000);

        // get current URL
        String currentURL = driver.getCurrentUrl();

        // assert URL is "https://my.heal.com/book"
        Assertions.assertEquals("https://my.heal.com/book", currentURL);

    }


    @Test
    @DisplayName("Book a doctor with an account")
    void testCase2() throws Exception {


        // another example test case


    }

    @Test
    @DisplayName("use invalid input data when creating account and verify error messages are displayed")
    void testCase3() throws Exception {


        // another example test case


    }


    @Test
    @DisplayName("use invalid input data when creating account and verify error messages are displayed")
    void testCase4() throws Exception {


        // another example test case


    }

    @AfterEach
    void tearDown() throws Exception{
        driver.close();
        driver.quit();
    }
}
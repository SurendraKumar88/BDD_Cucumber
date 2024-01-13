package stepdefinations;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

import static genericlib.BaseClass.driver;

public class LoginPageStepDef{


    @Before
    public void before_config() throws InterruptedException {
        System.out.println("Lunch the browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void after_config(){
        System.out.println("Close the browser");
        driver.close();
    }



    @Given("I am on Login page")
    public void i_am_on_login_page() {
        System.out.println("i_am_on_login_page");
    }

    @Given("I entered valid username and password")
    public void iEnteredValidUsernameAndPassword() {
        System.out.println("iEnteredValidUsernameAndPassword");
    }

    @When("Click on login button")
    public void clickOnLoginButton() {
        System.out.println("clickOnLoginButton");
    }

    @Then("Validate page Logo {string}")
    public void validatePageLogo(String exp_logo)
    {
        System.out.println("clickOnLoginButton");

        LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
        String actual_logo = lp.get_logo();
        Assert.assertEquals(actual_logo, exp_logo);

    }

    @Then("Validate page title {string}")
    public void validatePageTitle(String exp_page_title) {

        System.out.println("clickOnLoginButton");
        String act_page_title = driver.getTitle();
        Assert.assertEquals(act_page_title, exp_page_title);
    }

}

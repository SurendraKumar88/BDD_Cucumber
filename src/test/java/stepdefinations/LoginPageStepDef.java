package stepdefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectrepository.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static stepdefinations.BaseClass.driver;


public class LoginPageStepDef {


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
    public void validatePageLogo(String exp_logo) {
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

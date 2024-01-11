package stepdefinations;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @Then("Validate page title")
    public void validatePageTitle() {
        System.out.println("clickOnLoginButton");
    }

    @Then("Validate page Logo")
    public void validatePageLogo() {
        System.out.println("clickOnLoginButton");
    }
}

package stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectrepository.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static genericlib.BaseClass.driver;

public class HomePageStepDef{
    @Then("Validate page url")
    public void validatePageUrl() {
        System.out.println("validatePageUrl");
    }

    @Then("Validate page sub logo")
    public void validatePageSubLogo() {
        System.out.println("validatePageSubLogo");
    }

    @When("I entered invalid gmail {string}")
    public void i_entered_invalid_gmail(String email_id) {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.enter_emial_in_textbox_and_click_on_next(email_id);
    }
    @Then("Validate invalid error message {string}")
    public void validate_invalid_error_message(String exp_error_msg) {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        String act_error_msg = home.get_invalid_email_id_error_msg();
        Assert.assertEquals(act_error_msg, exp_error_msg);

    }
}

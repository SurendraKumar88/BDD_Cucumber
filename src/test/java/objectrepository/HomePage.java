package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static genericlib.BaseClass.driver;

public class HomePage {

    @FindBy(id = "identifierId")
    WebElement email_textbox;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement next_button;

    @FindBy(xpath = "//div[@class='o6cuMc Jj6Lae']")
    WebElement invalid_login_error_text;


    public void enter_emial_in_textbox_and_click_on_next(String email_id){
        email_textbox.sendKeys(email_id);
        next_button.click();
    }

    public String get_invalid_email_id_error_msg(){
        //return driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']")).getText();
        return invalid_login_error_text.getText();
    }



}

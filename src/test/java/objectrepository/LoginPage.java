package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {



    @FindBy(css = "#logo")
    WebElement logo;


    public String get_logo(){
        return logo.getAttribute("title");
    }

}

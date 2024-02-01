package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {


    public static WebDriver driver;

    @Before
    public void before_config() {
        System.out.println("Lunch the browser");

        driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @After
    public void after_config() {
        System.out.println("Close the browser");
        driver.close();
    }


}

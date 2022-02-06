package Help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageMethods {

    public WebDriver driver;

    public PageMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String value){
        driver.navigate().to(value);

    }

    public void waitToUrl(String value){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlToBe(value));
    }



}

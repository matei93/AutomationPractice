package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {

    public WebDriver driver;

    //Constructor pt webdriver

    public ElementMethods(WebDriver driver){
        this.driver = driver;
    }

    //Metoda generala click
    public void clickElement(WebElement element){
        waitElement(element);
        element.click();
    }

    //Wait
    public void waitElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Fiill element
    public void fillElement(WebElement element, String value){
        waitElement(element);
        element.sendKeys(value);
    }

    //Hover element
    public void moveElement(WebElement element){

        waitElement(element);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void validateElement(WebElement element, String value){

        waitElement(element);
        String actualmsg=element.getText();
        Assert.assertEquals("Textul cautat nu este corect",value,actualmsg);

    }

    public void selectElementByText(WebElement element, String value){
        Select yearSelect = new Select(element);
        yearSelect.selectByVisibleText(value);
    }

    public void selectElementByValue(WebElement element, String value) {
        Select yearSelect = new Select(element);
        yearSelect.selectByValue(value);
    }


}

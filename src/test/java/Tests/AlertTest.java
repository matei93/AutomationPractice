package Tests;

import Base.ShareData;
import Help.AlertsMethods;
import Help.ElementMethods;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AlertTest extends ShareData {

    //Refactorizare - de la naspa la frumos

    //Chemi metoda

    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertsMethods alertsMethods;

    @Test

    public void testAutomat(){

        //Initializezi

        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        alertsMethods = new AlertsMethods(driver);

        WebElement signInE = driver.findElement(By.id("btn2"));
        elementMethods.clickElement(signInE);

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchToElement).perform();

        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        elementMethods.clickElement(alertsElement);

        //Instalarae extentie in instantele de browser!!!

       pageMethods.navigateToUrl("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertOptions=driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        alertOptions.get(0).click();
        WebElement alertOK = driver.findElement(By.cssSelector("#OKTab>button"));
        alertOK.click();

        //Wait explicit

        WebDriverWait waitExplicit = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitExplicit.until(ExpectedConditions.alertIsPresent());

        //Thread sleep

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        alertsMethods.acceptAlert();

        alertOptions.get(1).click();
        WebElement alertOKCancel = driver.findElement(By.cssSelector("#CancelTab>button"));
        alertOKCancel.click();
        alertsMethods.cancelAlert();

        alertOptions.get(2).click();
        WebElement alertTextBox = driver.findElement(By.cssSelector("#Textbox>button"));
        alertTextBox.click();
        alertsMethods.acceptFillAlert("Test");

    }
}

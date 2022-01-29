package Tests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest extends ShareData {

    //Refactorizare - de la naspa la frumos

    @Test

    public void TestAutomat(){
        WebElement signInE = driver.findElement(By.id("btn2"));
        signInE.click();

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchToElement).perform();

        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        //Instalarae extentie in instantele de browser!!!

        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertOptions=driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        alertOptions.get(0).click();
        WebElement alertOK = driver.findElement(By.cssSelector("#OKTab>button"));
        alertOK.click();

        Alert OK = driver.switchTo().alert();
        OK.accept();

        alertOptions.get(1).click();
        WebElement alertOKCancel = driver.findElement(By.cssSelector("#CancelTab>button"));
        alertOKCancel.click();
        Alert OkCancel = driver.switchTo().alert();
        OkCancel.dismiss();

        alertOptions.get(2).click();
        WebElement alertTextBox = driver.findElement(By.cssSelector("#Textbox>button"));
        alertTextBox.click();
        Alert TextBox = driver.switchTo().alert();
        TextBox.sendKeys("Cand primim pauza?");
        TextBox.accept();

    }
}

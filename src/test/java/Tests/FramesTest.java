package Tests;

import Base.ShareData;
import Help.ElementMethods;
import Help.FrameMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesTest extends ShareData {

    public ElementMethods elementMethods;
    public FrameMethods frameMethods;

    @Test
    public void framesTest(){

        elementMethods = new ElementMethods(driver);
        frameMethods = new FrameMethods(driver);

        WebElement skipSignInElement = driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipSignInElement);

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethods.moveElement(switchToElement);
        //Actions Action = new Actions(driver);
        //Action.moveToElement(switchToElement).perform();

        WebElement framesElement = driver.findElement(By.xpath("//a[text()='Frames']"));
        elementMethods.clickElement(framesElement);

        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        frameMethods.switchToFrameById("singleframe");
        WebElement inputText = driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText.sendKeys("Foame");

        frameMethods.switchToDefault();

        WebElement multipleIframe = driver.findElement(By.cssSelector("a[href='#Multiple']"));
        elementMethods.clickElement(multipleIframe);

        frameMethods.switToFrameByElemenet(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethods.switToFrameByElemenet(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement inputText2 = driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText2.sendKeys("Imi e si mai foame acum.");

    }
}

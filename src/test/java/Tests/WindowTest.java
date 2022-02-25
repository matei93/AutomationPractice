package Tests;

import Base.Hooks;
import Base.ShareData;
import Help.ElementMethods;
import Help.WindowMethods;
import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;

public class WindowTest extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;
    public WindowPage windowPage;

    @Test
    public void windowTest(){

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());
        windowPage = new WindowPage(getDriver());

        indexPage.clickSkipSignIn();

        registerPage.goToWindowPage();

        windowPage.newTabProcess();
        windowPage.newWindowProcess();
        windowPage.multipleTabsProcess();

    }

}

    /*public ElementMethods elementMethods;
    public WindowMethods windowMethods;


    @Test
    public void windowTest() {

        elementMethods=new ElementMethods(driver);
        windowMethods=new WindowMethods(driver);

        //De aici iei pt register!!!

        WebElement skipSignInElement = driver.findElement(By.id("btn2"));
        elementMethods.clickElement(skipSignInElement);

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethods.moveElement(switchToElement);
        //Actions Action = new Actions(driver);
        //Action.moveToElement(switchToElement).perform();

        WebElement windowsElement = driver.findElement(By.xpath("//a[text()='Windows']"));
        elementMethods.clickElement(windowsElement);

        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowOptions = driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        windowOptions.get(0).click();
        WebElement newTabOk = driver.findElement(By.cssSelector("#Tabbed>a>button"));
        elementMethods.clickElement(newTabOk);

        windowMethods.switchToTab(1);

        windowMethods.closeTab();

        windowMethods.switchToTab(0);

        windowOptions.get(1).click();
        WebElement newWindowAndTab = driver.findElement(By.cssSelector("#Seperate>button"));
        elementMethods.clickElement(newWindowAndTab);

        windowMethods.switchToTab(1);

        windowMethods.closeTab();

        windowMethods.switchToTab(0);

        windowOptions.get(2).click();
        WebElement newWindowAndTab2 = driver.findElement(By.cssSelector("#Multiple>button"));
        elementMethods.clickElement(newWindowAndTab2);

        windowMethods.switchToTab(2);

        windowMethods.closeTab();

        windowMethods.switchToTab(1);

        windowMethods.closeTab();

        windowMethods.switchToTab(0);
    }
}

//public class WindowTest extends SharedData {
//
//    public IndexPage indexPage;
//    public RegisterPage registerPage;
//    public WindowPage windowPage;
//
//    @Test
//    public void windowTest(){
//
//        indexPage = new IndexPage(driver);
//        registerPage = new RegisterPage(driver);
//        windowPage = new WindowPage(driver);
//
//        indexPage.clickSkipSignIn();
//
//        registerPage.goToWindowPage();
//
//        windowPage.newTabProcess();
//        windowPage.newWindowProcess();
//        windowPage.multipleTabsProcess();*/


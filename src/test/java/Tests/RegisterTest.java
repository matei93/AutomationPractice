package Tests;

import Base.Hooks;
import Base.ShareData;
import Help.ElementMethods;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest extends Hooks {

    public IndexPage indexPage;
    public RegisterPage registerPage;

    @Test
    public void register(){

        indexPage = new IndexPage(getDriver());
        registerPage = new RegisterPage(getDriver());

        indexPage.clickSkipSignIn();

        registerPage.registerValidProcess(inputData);
    }
}



    /*public void register() {

        elementMethods = new ElementMethods(driver);


        WebElement signInE = driver.findElement(By.id("btn1"));
        elementMethods.clickElement(signInE);
        WebElement emailE = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "matei.florin@outlook.com";
        emailE.sendKeys(emailValue);

        WebElement passwordE = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordValue = "Frankie93";
        passwordE.sendKeys(passwordValue);
        WebElement enterE = driver.findElement(By.id("enterbtn"));
        elementMethods.clickElement(enterE);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        WebElement languagesElement = driver.findElement(By.cssSelector("div[id='msdd']"));
        elementMethods.clickElement(languagesElement);
        List<WebElement> LanguageOptions = driver.findElements(By.cssSelector(".ui-autocomplete.ui-front>li>a"));
        for (int index = 0; index < LanguageOptions.size(); index++) {
            if (LanguageOptions.get(index).getText().equals("English")) {
                LanguageOptions.get(index).click();
            }

        }

        WebElement phoneElement = driver.findElement(By.cssSelector("input[type='tel']"));
        elementMethods.clickElement(phoneElement);
        WebElement yearElement = driver.findElement(By.id("yearbox"));
        elementMethods.selectElementByValue(yearElement, "1993");

        elementMethods.clickElement(yearElement);

    }
}*/



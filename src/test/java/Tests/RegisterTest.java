package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest {

    public WebDriver driver;

    @Test

    public void register() {
        //Setam dirver-ul de Chrome

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        //Deschidem o instanta de chrome

        driver=new ChromeDriver();

        //Accesam un URL

        driver.get("http://demo.automationtesting.in/Index.html");

        //Maximize window
        driver.manage().window().maximize();

        //Skipsignin clik

        WebElement skipSignInElement = driver.findElement(By.id("btn2"));
        skipSignInElement.click();


        //Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        WebElement languagesElement = driver.findElement(By.cssSelector("div[id='msdd']"));
        languagesElement.click();
        List<WebElement> LanguageOptions = driver.findElements(By.cssSelector(".ui-autocomplete.ui-front>li>a"));
        for (int index = 0; index < LanguageOptions.size(); index++) {
            if (LanguageOptions.get(index).getText().equals("English")) {
                LanguageOptions.get(index).click();
            }

        }

        //Phone clik

        WebElement phoneElement = driver.findElement(By.cssSelector("input[type='tel']"));
        phoneElement.click();

        //Year select
        WebElement yearElement = driver.findElement(By.id("yearbox"));
        Select yearSelect = new Select(yearElement);git statu
        yearSelect.selectByValue("1993");
        yearElement.click();

    }
}


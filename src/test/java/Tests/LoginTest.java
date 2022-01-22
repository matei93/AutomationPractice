package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginTest {

    // Declaram variabila WebDriver

    public WebDriver driver;


    @Test

    public void Login(){
        //Setam dirver-ul de Chrome

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        //Deschidem o instanta de chrome

        driver=new ChromeDriver();

        //Accesam un URL

        driver.get("http://demo.automationtesting.in/Index.html");

        //Facem driver-ul in modul maximize

        driver.manage().window().maximize();

        WebElement signInE = driver.findElement(By.id("btn1"));
        signInE.click();

        WebElement emailE = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "matei.florin@outlook.com";
        emailE.sendKeys(emailValue);

        WebElement passwordE = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordValue = "Frankie93";
        passwordE.sendKeys(passwordValue);

        WebElement enterE = driver.findElement(By.id("enterbtn"));
        enterE.click();

        //WebElement messageerrorE = driver.findElement(By.id("errormsg"));
        //messageerrorE.isDisplayed();

        WebElement messageerrorE = driver.findElement(By.id("errormsg"));
        String expectedMsg="Invalid User Name or PassWord";
        String actualmsg=messageerrorE.getText();
        Assert.assertEquals("Textul cautat nu este corect",expectedMsg,actualmsg);

        //De sugerat de a pune un mesaj cand faci un assert.

        driver.close();

        //Quit=inchide instanta cu toate taburile deschise
        //Close=inchide tabul curent
        //Select - este un dropdown


    }
}

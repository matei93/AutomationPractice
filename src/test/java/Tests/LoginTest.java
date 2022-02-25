package Tests;

import Base.ShareData;
import Help.ElementMethods;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginTest extends ShareData {

    public IndexPage indexPage;
    public LoginPage loginPage;

    // Declaram variabila WebDriver

    @Test

    public void login(){

        indexPage = new IndexPage(driver);
        loginPage = new LoginPage(driver);

        indexPage.clickSignIn();
        loginPage.loginInvalidProcess("matei.florin@outlook.com","Frankie93","Invalid User Name or PassWord");


    }

        /*elementMethods=new ElementMethods(driver);

        WebElement signInE = driver.findElement(By.id("btn1"));
        elementMethods.clickElement(signInE);

        WebElement emailE = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "matei.florin@outlook.com";
        elementMethods.fillElement(emailE, emailValue);

        WebElement passwordE = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String passwordValue = "Frankie93";
        elementMethods.fillElement(passwordE,passwordValue);

        WebElement enterE = driver.findElement(By.id("enterbtn"));
        elementMethods.clickElement(enterE);

        WebElement messageerrorE = driver.findElement(By.id("errormsg"));
        elementMethods.validateElement(messageerrorE, "Invalid User Name or PassWord");*/

        //driver.close();

        //Setam dirver-ul de Chrome
        //Deschidem o instanta de chrome
        //Accesam un URL
        //Facem driver-ul in modul maximize
        //Quit=inchide instanta cu toate taburile deschise
        //Close=inchide tabul curent
        //Select=este un dropdown
        //De sugerat de a pune un mesaj cand faci un assert.*/



}

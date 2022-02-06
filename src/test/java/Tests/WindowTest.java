package Tests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class gWindowTest extends ShareData {

    @Test

    public void windowsTest(){
        WebElement signInE = driver.findElement(By.id("btn2"));
        signInE.click();

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='Windows']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchToElement).perform();

        WebElement windowElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        windowElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowOptions=driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        windowOptions.get(0).click();
        WebElement newTab = driver.findElement(By.cssSelector("#Tabbed>a>button"));
        newTab.click();

        //Mutare pe un nou tab

        System.out.println("Titlul paginii "+ driver.getTitle());

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Titlul paginii "+ driver.getTitle());

        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii "+ driver.getTitle());

        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii "+ driver.getTitle());

        windowOptions.get(1).click();
        WebElement newWindow = driver.findElement(By.cssSelector("#Separate>button"));
        newWindow.click();

        System.out.println("Titlul paginii "+ driver.getTitle());
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Titlul paginii "+ driver.getTitle());

        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii "+ driver.getTitle());

        //mai ai de facut inca un test, trebuie sa vezi cat de corect ai facut !!!
        //mai trebuie sa faci un branch

        windowOptions.get(2).click();
        WebElement newWindowAndTab = driver.findElement(By.cssSelector("#Multiple>button"));
        newWindowAndTab.click();

        System.out.println("Titlul paginii: "+driver.getTitle());
        List<String> multipleTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(multipleTabs.get(2));
        System.out.println("Titlul ferestrei 2: "+driver.getTitle());

        driver.close();
        driver.switchTo().window(multipleTabs.get(1));
        System.out.println("Titlul paginii: "+driver.getTitle());

        driver.close();
        driver.switchTo().window(multipleTabs.get(0));
        System.out.println("Titlul paginii: "+driver.getTitle());





    }
}

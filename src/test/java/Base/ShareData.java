package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShareData {

    public WebDriver driver;

    @Before

    public void  Setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();

        //Wait inplicit

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After

    public void Teardown(){

        //driver.quit();

    }
}

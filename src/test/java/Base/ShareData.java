package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertiesUtility.PropertiesObject;

import java.time.Duration;

public class ShareData {

    private WebDriver driver;

    public void Setup(){
        PropertiesObject driverResource = new PropertiesObject("driverResource/DriverResource");
        System.setProperty(driverResource.getValueByKey("browser"), driverResource.getValueByKey("browserPath"));
        driver = new ChromeDriver();
        driver.get(driverResource.getValueByKey("url"));
        driver.manage().window().maximize();

        // Wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void Teardown(){

        // driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}

    /*public WebDriver driver;

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
}*/

package Help;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    public WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    //Sari de la un tab la altul

    public void switchToTab(int index){
        //Copiezi din windows System.out.println

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));

        //Copiezi din windows System.out.println
        System.out.println();
    }
    //Inchizi tabu
    public void closeTab(){
        driver.close();
    }



}

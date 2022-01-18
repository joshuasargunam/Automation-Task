import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Helper {

    //use of static
    public static WebDriver driver;

    public void openDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    public void driverWait (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}

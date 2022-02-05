package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void createDriver(boolean headless) {
        ChromeOptions options;
        //headless option
        if(headless){
            options = new ChromeOptions();
            options.addArguments("headless");
        }else{
            options = new ChromeOptions();
        }

        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(options);

    }
}

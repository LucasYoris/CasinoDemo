package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void createDriver(boolean headless,boolean incognito) {
        ChromeOptions options;
        //headless option
        options = new ChromeOptions();
        if(headless){
            options.addArguments("headless");
        }
        if(incognito){
            options.addArguments("--incognito");
        }


        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver(options);

    }
}

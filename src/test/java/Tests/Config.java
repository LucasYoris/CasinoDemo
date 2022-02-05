package Tests;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Config {

    private static WebDriver driver;
    private DriverManager driverManager;
    //global proyect params configuration
    private static String url = "https://demo.casino";
    private static Boolean headless = true;
    private static int waitSeconds = 20;

    @Before
    public void setUp(){
        //select browser
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        //select headless true or false
        driver = driverManager.getDriver(false);
        //implicit timeout
        driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
        //proyect main page
        driver.get(url);
        //maximize main window
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        //close driver
        driverManager.quitDriver();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}

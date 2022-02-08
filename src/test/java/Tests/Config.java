package Tests;

import Steps.RegistrationSteps;
import com.aventstack.extentreports.model.Log;
import com.imagetyperzapi.ImageTyperzAPI;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Config {

    private static WebDriver driver;
    private DriverManager driverManager;

    //Proyect params configuration
    private static String url = "https://demo.casino";
    public static final Boolean headless = false;
    private static final Boolean incognito = true;
    private static int waitSeconds = 7;

    @Before
    public void setUp(){
        //select browser
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        //select headless true or false
        driver = driverManager.getDriver(headless,incognito);
        //implicit timeout
        driver.manage().timeouts().implicitlyWait(waitSeconds, TimeUnit.SECONDS);
        //proyect main page
        driver.get(url);
        //maximize main window
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if(scenario.isFailed()){
            //take browser screenshot if the scenario failed
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            String errorImg = System.getProperty("user.dir")+"\\cucumber-reports\\errorsScreenshots\\"+screenshotName+".png";
            TakesScreenshot scrShot =((TakesScreenshot)driver);
            File src = scrShot.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(src,new File(errorImg));
            Thread.sleep(1000);
            Reporter.addScreenCaptureFromPath("errorsScreenshots\\"+screenshotName+".png");
            try{
                //report captcha_id if the API couldn decrypt the image
                if(driver.findElement(By.xpath("//div[text()='Invalid verification code' or text()='The verification code is incorrect.']")).isDisplayed() && (scenario.getName().contains("User sign up") || scenario.getName().contains("Send correct messagge"))){
                    //Image Tyzer API
                    ImageTyperzAPI i = new ImageTyperzAPI("ED4592D467604D7C9B2891DEA6431902");
                    //Takes static captcha_id from RegistrationSteps
                    i.set_captcha_bad(RegistrationSteps.captcha_id);
                    Reporter.addStepLog("The captcha could not be resolved by the API, please run the test again");
                }
            }catch(Exception e){
                //close driver
                driverManager.quitDriver();
                //kill chromedriver process that could be running
                //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
            }

        }
        //close driver
        driverManager.quitDriver();
        //kill chromedriver process that could be running
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    public static WebDriver getDriver(){
        return driver;
    }
}

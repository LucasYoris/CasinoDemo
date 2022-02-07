package runner.browser_manager;

import com.vimalselvam.cucumber.listener.Reporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public abstract class DriverManager {
    protected WebDriver driver;

    protected abstract void createDriver(boolean headless, boolean incognito);

    public void quitDriver() throws IOException {
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver(boolean headless,boolean incognito){
        if(driver == null){
            createDriver(headless,incognito);
        }
        return driver;
    }
}

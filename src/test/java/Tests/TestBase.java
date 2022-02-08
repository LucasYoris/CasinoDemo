package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    protected WebDriver driver = Config.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 10);

}

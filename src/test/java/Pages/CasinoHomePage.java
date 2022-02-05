package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CasinoHomePage extends TestBase {

    private String titleHomePage = "Apuestale";
    private By registrationButtonLocator = By.xpath("//div[@class='header__bottom']//a[@href='/user/registration']");

    public String getTitleHomePage() {
        return titleHomePage;
    }

    public WebElement getRegistrationButton() {
        WebElement registrationButton = driver.findElement(registrationButtonLocator);
        return registrationButton;
    }

}

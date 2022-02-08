package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CasinoHomePage extends TestBase {

    private String titleHomePage = "Demo casino";
    private By registrationButtonLocator = By.xpath("//div[@class='header__bottom']//a[@href='/user/registration']");
    private By moreButtonLocator = By.xpath("//li[@class='header-menu-main__item menu-dd__item menu-dd__item--active']");
    private By contactsButtonLocator = By.xpath("//ul[@class='menu-dd__dropdown']/li/a[text()='Contacts']");

    public String getTitleHomePage() {
        return titleHomePage;
    }

    public WebElement getRegistrationButton() {
        return driver.findElement(registrationButtonLocator);
    }

    public WebElement getMoreButton() {
        return driver.findElement(moreButtonLocator);
    }

    public WebElement getContactsButton() {
        return driver.findElement(contactsButtonLocator);
    }

}

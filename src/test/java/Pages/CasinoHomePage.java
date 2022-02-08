package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CasinoHomePage extends TestBase {

    private String titleHomePage = "Demo casino";
    private By registrationButtonLocator = By.xpath("//div[@class='header__bottom']//a[@href='/user/registration']");
    private By moreButtonLocator = By.xpath("//span[text()='More']");
    private By contactsButtonLocator = By.xpath("//a[text()='Contacts' and @class='header-menu-main__item-link']");

    public String getTitleHomePage() {
        return titleHomePage;
    }

    public WebElement getRegistrationButton() {
        WebElement registrationButton = driver.findElement(registrationButtonLocator);
        return registrationButton;
    }

    public WebElement getMoreButton() {
        WebElement moreButton = driver.findElement(moreButtonLocator);
        return moreButton;
    }

    public WebElement getContactsButton() {
        WebElement contactsButton = driver.findElement(contactsButtonLocator);
        return contactsButton;
    }

}

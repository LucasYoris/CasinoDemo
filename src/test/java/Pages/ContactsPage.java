package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends TestBase {

    private By titleContactsPage = By.xpath("//h2[text()='Contacts']");
    private By nameInputLocator = By.id("HelpForm_name");
    private final By emailInputLocator = By.id("HelpForm_email");
    private final By topycInputLocator = By.id("HelpForm_topic");
    private final By categoryLocator = By.xpath("//span[text()='Select category']");
    private final String categoryListLocator = "//li[text()='%s']";
    private final By messaggeInputLocator = By.id("HelpForm_text");
    private final By enterCodeInputLocator = By.id("HelpForm_verifyCode");
    private final By captchaImgLocator = By.id("yw1");
    private By sendButtonLocator = By.xpath("//button[@class='button button--s1 button--t1 ']");
    private final By congratulationMessage1Locator = By.xpath("//h1[@class='notification__title' and text()=' Thanks! ']");
    private final By congratulationMessage2Locator = By.xpath("//p[@class='notification__description' and text()=' Message has been sent, our manager will contact you shortly. ']");

    public WebElement getContactsTitlePage() {
        return driver.findElement(titleContactsPage);
    }

    protected WebElement getNameInputLocator() {
        return driver.findElement(nameInputLocator);
    }

    protected WebElement getEmailInputLocator() {
        return driver.findElement(emailInputLocator);
    }

    protected WebElement getTopycInputLocator() {
        return driver.findElement(topycInputLocator);
    }

    protected WebElement getCategoryLocator() {
        return driver.findElement(categoryLocator);
    }

    protected WebElement getSelectCategoryListLocator(String category) {
        return driver.findElement(By.xpath(String.format(categoryListLocator,category)));
    }

    protected WebElement getMessageInputLocator() {
        return driver.findElement(messaggeInputLocator);
    }

    protected WebElement getEnterCodeInputLocator() {
        return driver.findElement(enterCodeInputLocator);
    }

    protected WebElement getCaptchaImgLocator() {
        return driver.findElement(captchaImgLocator);
    }

    public WebElement getSendButton() {
        return driver.findElement(sendButtonLocator);
    }

    protected WebElement getRegisterMesssage1Locator() {
        return driver.findElement(congratulationMessage1Locator);
    }

    protected WebElement getRegisterMesssage2Locator() {
        return driver.findElement(congratulationMessage2Locator);
    }


}

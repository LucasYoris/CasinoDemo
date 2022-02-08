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
    private final By messaggeInputLocator = By.id("HelpForm_tex");
    private final By enterCodeInputLocator = By.id("HelpForm_verifyCode");
    private final By captchaImgLocator = By.id("yw1");
    private By sendButtonLocator = By.xpath("//button[@class='button button--s1 button--t1 ']");
    private final By congratulationMessage1Locator = By.xpath("//h1[@class='notification__title' and text()=' Thanks! ']");
    private final By congratulationMessage2Locator = By.xpath("//p[@class='notification__description' and text()=' Message has been sent, our manager will contact you shortly. ']");

    public WebElement getContactsTitlePage() {
        WebElement titleContacts = driver.findElement(titleContactsPage);
        return titleContacts;
    }

    protected WebElement getNameInputLocator() {
        WebElement nameInput = driver.findElement(nameInputLocator);
        return nameInput;
    }

    protected WebElement getEmailInputLocator() {
        WebElement emailInput = driver.findElement(emailInputLocator);
        return emailInput;
    }

    protected WebElement getTopycInputLocator() {
        WebElement topycInput = driver.findElement(topycInputLocator);
        return topycInput;
    }

    protected WebElement getCategoryLocator() {
        WebElement category = driver.findElement(categoryLocator);
        return category;
    }

    protected WebElement getSelectCategoryListLocator(String category) {
        WebElement categoryList = driver.findElement(By.xpath(String.format(categoryListLocator,category)));
        return categoryList;
    }

    protected WebElement getMessageInputLocator() {
        WebElement messaggeInput = driver.findElement(messaggeInputLocator);
        return messaggeInput;
    }

    protected WebElement getEnterCodeInputLocator() {
        WebElement enterCodeInput = driver.findElement(enterCodeInputLocator);
        return enterCodeInput;
    }

    protected WebElement getCaptchaImgLocator() {
        WebElement captchaImg = driver.findElement(captchaImgLocator);
        return captchaImg;
    }

    public WebElement getSendButton() {
        WebElement sendButton = driver.findElement(sendButtonLocator);
        return sendButton;
    }

    protected WebElement getRegisterMesssage1Locator() {
        WebElement congratulationMessage1 = driver.findElement(congratulationMessage1Locator);
        return congratulationMessage1;
    }

    protected WebElement getRegisterMesssage2Locator() {
        WebElement congratulationMessage2 = driver.findElement(congratulationMessage2Locator);
        return congratulationMessage2;
    }


}

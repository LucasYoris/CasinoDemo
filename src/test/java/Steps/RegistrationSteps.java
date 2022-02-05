package Steps;

import Pages.RegistrationPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationSteps extends RegistrationPage {

    //protected RegistrationPage registrationPage = new RegistrationPage();

    public void registrationTitleValidation() {
        Assert.assertEquals(getTitleRegistrationPage().getText().toLowerCase(), "registration");
    }

    public void emailInput(String email) {
        Assert.assertTrue(getEmailInputLocator().isDisplayed());
        getEmailInputLocator().sendKeys(email);
    }

    public void coinSelect(String coin) {
        Assert.assertTrue(getcoinRBLocator().isDisplayed());
        List<WebElement> coins = getEmailInputLocator().findElements(By.xpath("//div/div/label[@class='radio__item-label']"));
        for (WebElement webElement : coins) {
            if (webElement.getText().equals(coin)) {
                webElement.click();
                break;
            }
        }
    }






}

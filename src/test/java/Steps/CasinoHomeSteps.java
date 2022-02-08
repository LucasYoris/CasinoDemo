package Steps;

import Pages.CasinoHomePage;
import org.junit.Assert;

public class CasinoHomeSteps extends CasinoHomePage{

    protected CasinoHomePage casinoHomePage = new CasinoHomePage();

    public void homeTitleValidation(){
        Assert.assertEquals(casinoHomePage.getTitleHomePage(),driver.getTitle());
    }

    public void registrationButtonClick(){
        Assert.assertTrue("Registration button not available",casinoHomePage.getRegistrationButton().isDisplayed());
        casinoHomePage.getRegistrationButton().click();
    }

    public void moreButtonClick(){
        Assert.assertTrue("More button not available",casinoHomePage.getMoreButton().isDisplayed());
        casinoHomePage.getMoreButton().click();
    }

    public void contactsButtonClick(){
        Assert.assertTrue("Contacts button not available",casinoHomePage.getContactsButton().isDisplayed());
        casinoHomePage.getContactsButton().click();
    }


}

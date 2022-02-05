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


}

package Tests;

import Steps.CasinoHomeSteps;
import Steps.ContactsSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.CaptchaId;

public class ContactsTests extends CaptchaId {

    CasinoHomeSteps casinoHomeSteps = new CasinoHomeSteps();
    ContactsSteps contactsSteps = new ContactsSteps();

    @Given("^click on MORE button$")
    public void clickOnMOREButton() throws Throwable {
        casinoHomeSteps.moreButtonClick();
    }

    @Given("^click on CONTACTS button$")
    public void clickOnCONTACTSButton() throws Throwable {
        casinoHomeSteps.contactsButtonClick();
    }

    @Given("^contacts page should be visible$")
    public void contactsPageShouldBeVisible() throws Throwable {
        contactsSteps.contactsTitleValidation();
    }

    @When("^the user enters their name \"([^\"]*)\"$")
    public void theUserEntersTheirName(String name) throws Throwable {
        contactsSteps.nameInput(name);
    }

    @When("^enters their email \"([^\"]*)\"$")
    public void entersTheirEmail(String email) throws Throwable {
        contactsSteps.emailInput(email);
    }

    @When("^enters their topyc \"([^\"]*)\"$")
    public void entersTheirTopyc(String topyc) throws Throwable {
        contactsSteps.topycInput(topyc);
    }

    @When("^enters a category \"([^\"]*)\"$")
    public void entersACategory(String category) throws Throwable {
        contactsSteps.clickCategory();
        contactsSteps.selectCategory(category);
    }

    @When("^enters a messagge \"([^\"]*)\"$")
    public void entersAMessagge(String messagge) throws Throwable {
        contactsSteps.messaggeInput(messagge);
    }

    @When("^enters the contact catpcha code$")
    public void entersTheContactCatpchaCode() throws Throwable {
        captcha_id = contactsSteps.captchaInput();
    }

    @When("^click on Send button$")
    public void clickOnSendButton() throws Throwable {
        contactsSteps.clickSendButton();
    }

    @Then("^a thanks message should be displayed$")
    public void aThanksMessageShouldBeDisplayed() throws Throwable {
        contactsSteps.checkContactsMessage();
    }

}

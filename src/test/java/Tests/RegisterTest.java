package Tests;

import Pages.CasinoHomePage;
import Steps.CasinoHomeSteps;
import Steps.RegistrationSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class RegisterTest {

    protected CasinoHomeSteps casinoHomeSteps = new CasinoHomeSteps();
    protected RegistrationSteps registrationSteps = new RegistrationSteps();

    @Given("^the user is on the home page$")
    public void theUserIsOnTheHomePage() throws Throwable {
        casinoHomeSteps.homeTitleValidation();
    }

    @Given("^click on the Registration button$")
    public void clickOnTheRegistrationButton() throws Throwable {
        casinoHomeSteps.registrationButtonClick();
    }

    @Given("^registration page should be visible$")
    public void registrationPageShouldBeVisible() throws Throwable {
        registrationSteps.registrationTitleValidation();
    }

    @When("^the user enters their email \"([^\"]*)\"$")
    public void theUserEntersTheirEmail(String email) throws Throwable {
        registrationSteps.emailInput(email);
    }

    @When("^enters their main coin \"([^\"]*)\"$")
    public void entersTheirMainCoin(String coin) throws Throwable {
        registrationSteps.coinSelect(coin);
    }

    @When("^enters their password \"([^\"]*)\"$")
    public void entersTheirPassword(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^re-enters their password \"([^\"]*)\"$")
    public void reEntersTheirPassword(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their name \"([^\"]*)\"$")
    public void entersTheirName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their lastName \"([^\"]*)\"$")
    public void entersTheirLastName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their middleName \"([^\"]*)\"$")
    public void entersTheirMiddleName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^check the therms and conditions$")
    public void checkTheThermsAndConditions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their birthay \"([^\"]*)\"$")
    public void entersTheirBirthay(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their nickName \"([^\"]*)\"$")
    public void entersTheirNickName(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their address \"([^\"]*)\"$")
    public void entersTheirAddress(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their country \"([^\"]*)\"$")
    public void entersTheirCountry(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their city \"([^\"]*)\"$")
    public void entersTheirCity(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their postalCode \"([^\"]*)\"$")
    public void entersTheirPostalCode(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their gender \"([^\"]*)\"$")
    public void entersTheirGender(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their question \"([^\"]*)\"$")
    public void entersTheirQuestion(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^enters their login \"([^\"]*)\"$")
    public void entersTheirLogin(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^click on Register button$")
    public void clickOnRegisterButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^a congratulations sign up message should be displayed$")
    public void aCongratulationsSignUpMessageShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }





}

package Tests;

import Steps.CasinoHomeSteps;
import Steps.RegistrationSteps;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


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
        String sEmail = email+registrationSteps.randomNumber()+"@gmail.com";
        registrationSteps.emailInput(sEmail);
        Reporter.addStepLog("Email used: "+sEmail);
    }

    @When("^enters their main coin \"([^\"]*)\"$")
    public void entersTheirMainCoin(String coin) throws Throwable {
        registrationSteps.coinSelect(coin);
    }

    @When("^enters their password \"([^\"]*)\"$")
    public void entersTheirPassword(String password) throws Throwable {
        registrationSteps.passwordInput(password);
    }

    @When("^re-enters their password \"([^\"]*)\"$")
    public void reEntersTheirPassword(String password) throws Throwable {
        registrationSteps.reEnterPasswordInput(password);
    }

    @When("^enters their name \"([^\"]*)\"$")
    public void entersTheirName(String name) throws Throwable {
        registrationSteps.nameInput(name);
    }

    @When("^enters their lastName \"([^\"]*)\"$")
    public void entersTheirLastName(String lastName) throws Throwable {
        registrationSteps.lastNameInput(lastName);
    }

    @When("^enters their middleName \"([^\"]*)\"$")
    public void entersTheirMiddleName(String middleName) throws Throwable {
        registrationSteps.middleNameInput(middleName);
    }

    @When("^check the therms and conditions$")
    public void checkTheThermsAndConditions() throws Throwable {
        registrationSteps.termsAndConditionsCheckBox();
    }

    @When("^enters the catpcha code$")
    public void entersTheCatpchaCode() throws Throwable {
        registrationSteps.captchaInput();
    }

    @When("^enters their birthay \"([^\"]*)\"$")
    public void entersTheirBirthay(String birthday) throws Throwable {
        registrationSteps.birthdayDateInput(birthday);
    }

    @When("^enters their nickName \"([^\"]*)\"$")
    public void entersTheirNickName(String nickName) throws Throwable {
        String nick = nickName+ "_" +registrationSteps.randomNumber();
        registrationSteps.nicknameInput(nick);
        Reporter.addStepLog("NickName used: "+nick);
    }

    @When("^enters their address \"([^\"]*)\"$")
    public void entersTheirAdress(String adress) throws Throwable {
        registrationSteps.addressInput(adress);
    }

    @When("^enters their country \"([^\"]*)\"$")
    public void entersTheirCountry(String country) throws Throwable {
        registrationSteps.clickCountry();
        registrationSteps.selectCountry(country);
    }

    @When("^enters their city \"([^\"]*)\"$")
    public void entersTheirCity(String city) throws Throwable {
        registrationSteps.cityInput(city);
    }

    @When("^enters their postalCode \"([^\"]*)\"$")
    public void entersTheirPostalCode(String postalCode) throws Throwable {
        registrationSteps.postalCodeInput(postalCode);
    }

    @When("^enters their gender \"([^\"]*)\"$")
    public void entersTheirGender(String gender) throws Throwable {
        registrationSteps.clickGender();
        registrationSteps.selectGender(gender);
    }

    @When("^enters their question \"([^\"]*)\"$")
    public void entersTheirQuestion(String question) throws Throwable {
        registrationSteps.clickSecretQuestion();
        registrationSteps.selectSecretQuestion(question);
    }

    @When("^enters the answer \"([^\"]*)\"$")
    public void entersTheAnswer(String answer) throws Throwable {
        registrationSteps.answerInput(answer);
    }

    @When("^enters their login \"([^\"]*)\"$")
    public void entersTheirLogin(String login) throws Throwable {
        String log = login + RegistrationSteps.randomNumber();
        registrationSteps.loginInput(log);
        Reporter.addStepLog("Login used: "+log);
    }

    @When("^click on Register button$")
    public void clickOnRegisterButton() throws Throwable {
        registrationSteps.clickRegisterButton();
    }

    @Then("^a congratulations sign up message should be displayed$")
    public void aCongratulationsSignUpMessageShouldBeDisplayed() throws Throwable {
        registrationSteps.checkRegisterMessage();
    }





}

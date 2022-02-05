package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends TestBase {

    private By titleRegistrationPage = By.xpath("//h2[@class='page__title']");
    private By emailInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_email");
    //private By coinRBLocator = By.xpath("//div[@class='radio__list radio__list--vertical']");
    private By coinRBLocator = By.className("radio__list");
    private By passwordInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_password");
    private By reEnterPasswordInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_password_confirmation");
    private By nameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_name");
    private By lastNameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_surname");
    private By middleNameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_middle_name");
    private By termsAndConditionsCheckBoxLocator = By.xpath("//label[@for='core__protected_modules_user_yiiForm_RegistrationForm_terms_and_conditions']");
    private By enterCodeInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_captcha");
    private By birthdayDateLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_birthday");
    private By nicknameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_nickname");
    private By addressInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_address");
    private By selectCountryLocator = By.xpath("//span[text()='Select country']");
    private By selectCountryListLocator = By.xpath("//li[text()='%s']");
    private By cityInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_city");
    private By postalCodeInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_postcode");
    private By selectGenderLocator = By.xpath("//span[text()='Select gender']");
    private By selectGenderListLocator = By.xpath("//li[text()='%s']");
    private By selectSecretQuestionLocator = By.xpath("//span[text()='Secret question']");
    private String selectSecretQuestionListLocator = "//li[text()='%s']";
    private By loginInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_username");
    private By registerButtonLocator = By.xpath("//button/span[text()='Register']");


    protected WebElement getTitleRegistrationPage() {
        WebElement titleRegistration = driver.findElement(titleRegistrationPage);
        return titleRegistration;
    }

    protected WebElement getEmailInputLocator() {
        WebElement emailInput = driver.findElement(emailInputLocator);
        return emailInput;
    }

    protected WebElement getcoinRBLocator() {
        WebElement coinRB = driver.findElement(coinRBLocator);
        return coinRB;
    }









}

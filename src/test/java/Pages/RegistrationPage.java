package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends TestBase {

    private final By titleRegistrationPage = By.xpath("//h2[@class='page__title']");
    private final By emailInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_email");
    private final By coinRBLocator = By.className("radio__list");
    private final By passwordInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_password");
    private final By reEnterPasswordInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_password_confirmation");
    private final By nameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_name");
    private final By lastNameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_surname");
    private final By middleNameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_middle_name");
    private final By termsAndConditionsCheckBoxLocator = By.xpath("//label[@for='core__protected_modules_user_yiiForm_RegistrationForm_terms_and_conditions']");
    private final By enterCodeInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_captcha");
    private final By captchaImgLocator = By.id("yw1");
    private final By birthdayDateLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_birthday");
    private final By nicknameInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_nickname");
    private final By addressInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_address");
    private final By selectCountryLocator = By.xpath("//span[text()='Select country']");
    private String selectCountryListLocator = "//li[text()='%s']";
    private final By cityInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_city");
    private final By postalCodeInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_postcode");
    private final By selectGenderLocator = By.xpath("//span[text()='Select gender']");
    private String selectGenderListLocator = "//li[text()='%s']";
    private final By selectSecretQuestionLocator = By.xpath("//span[text()='Secret question']");
    private final By answerInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_secret_answer");
    private String selectSecretQuestionListLocator = "//li[text()='%s']";
    private final By loginInputLocator = By.id("core__protected_modules_user_yiiForm_RegistrationForm_username");
    private final By registerButtonLocator = By.xpath("//button/span[text()='Register']");
    private final By congratulationMessage1Locator = By.xpath("//h1[@class='notification__title' and text()=' Congratulations! ']");
    private final By congratulationMessage2Locator = By.xpath("//p[@class='notification__description' and text()=' Registration successfully finished! ']");



    protected WebElement getTitleRegistrationPage() {
        return driver.findElement(titleRegistrationPage);
    }

    protected WebElement getEmailInputLocator() {
        return driver.findElement(emailInputLocator);
    }

    protected WebElement getcoinRBLocator() {
        return driver.findElement(coinRBLocator);
    }

    protected WebElement getPasswordInputLocator() {
        return driver.findElement(passwordInputLocator);
    }

    protected WebElement getReEnterPasswordInputLocator() {
        return driver.findElement(reEnterPasswordInputLocator);
    }

    protected WebElement getNameInputLocator() {
        return driver.findElement(nameInputLocator);
    }

    protected WebElement getLastNameInputLocator() {
        return driver.findElement(lastNameInputLocator);
    }

    protected WebElement getMiddleNameInputLocator() {
        return driver.findElement(middleNameInputLocator);
    }

    protected WebElement getTermsAndConditionsCheckBoxLocator() {
        return driver.findElement(termsAndConditionsCheckBoxLocator);
    }

    protected WebElement getEnterCodeInputLocator() {
        return driver.findElement(enterCodeInputLocator);
    }

    protected WebElement getCaptchaImgLocator() {
        return driver.findElement(captchaImgLocator);
    }

    protected WebElement getBirthdayDateLocator() {
        return driver.findElement(birthdayDateLocator);
    }

    protected WebElement getNicknameInputLocator() {
        return driver.findElement(nicknameInputLocator);
    }

    protected WebElement getAddressInputLocator() {
        return driver.findElement(addressInputLocator);
    }

    protected WebElement getSelectCountryLocator() {
        return driver.findElement(selectCountryLocator);
    }

    protected WebElement getSelectCountryListLocator(String country) {
        return driver.findElement(By.xpath(String.format(selectCountryListLocator,country)));
    }

    protected WebElement getCityInputLocator() {
        return driver.findElement(cityInputLocator);
    }

    protected WebElement getPostalCodeInputLocator() {
        return driver.findElement(postalCodeInputLocator);
    }

    protected WebElement getSelectGenderLocator() {
        return driver.findElement(selectGenderLocator);
    }

    protected WebElement getSelectGenderListLocator(String gender) {
        return driver.findElement(By.xpath(String.format(selectGenderListLocator,gender)));
    }

    protected WebElement getSelectSecretQuestionLocator() {
        return driver.findElement(selectSecretQuestionLocator);
    }

    protected WebElement getSelectSecretQuestionListLocator(String question) {
        return driver.findElement(By.xpath(String.format(selectSecretQuestionListLocator,question)));
    }

    protected WebElement getAnswerInputLocator() {
        return driver.findElement(answerInputLocator);
    }

    protected WebElement getLoginInputLocator() {
        return driver.findElement(loginInputLocator);
    }

    protected WebElement getRegisterButtonLocator() {
        return driver.findElement(registerButtonLocator);
    }

    protected WebElement getRegisterMesssage1Locator() {
        return driver.findElement(congratulationMessage1Locator);
    }

    protected WebElement getRegisterMesssage2Locator() {
        return driver.findElement(congratulationMessage2Locator);
    }
}

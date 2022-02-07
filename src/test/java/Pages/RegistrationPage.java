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

    protected WebElement getPasswordInputLocator() {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        return passwordInput;
    }

    protected WebElement getReEnterPasswordInputLocator() {
        WebElement reEnterPasswordInput = driver.findElement(reEnterPasswordInputLocator);
        return reEnterPasswordInput;
    }

    protected WebElement getNameInputLocator() {
        WebElement nameInput = driver.findElement(nameInputLocator);
        return nameInput;
    }

    protected WebElement getLastNameInputLocator() {
        WebElement lastNameInput = driver.findElement(lastNameInputLocator);
        return lastNameInput;
    }

    protected WebElement getMiddleNameInputLocator() {
        WebElement middleNameInput = driver.findElement(middleNameInputLocator);
        return middleNameInput;
    }

    protected WebElement getTermsAndConditionsCheckBoxLocator() {
        WebElement termsAndConditionsCheckBox = driver.findElement(termsAndConditionsCheckBoxLocator);
        return termsAndConditionsCheckBox;
    }

    protected WebElement getEnterCodeInputLocator() {
        WebElement enterCodeInput = driver.findElement(enterCodeInputLocator);
        return enterCodeInput;
    }

    protected WebElement getCaptchaImgLocator() {
        WebElement captchaImg = driver.findElement(captchaImgLocator);
        return captchaImg;
    }

    protected WebElement getBirthdayDateLocator() {
        WebElement birthdayDate = driver.findElement(birthdayDateLocator);
        return birthdayDate;
    }

    protected WebElement getNicknameInputLocator() {
        WebElement nicknameInput = driver.findElement(nicknameInputLocator);
        return nicknameInput;
    }

    protected WebElement getAddressInputLocator() {
        WebElement addressInput = driver.findElement(addressInputLocator);
        return addressInput;
    }

    protected WebElement getSelectCountryLocator() {
        WebElement addressInput = driver.findElement(selectCountryLocator);
        return addressInput;
    }

    protected WebElement getSelectCountryListLocator(String country) {
        WebElement selectCountryList = driver.findElement(By.xpath(String.format(selectCountryListLocator,country)));
        return selectCountryList;
    }

    protected WebElement getCityInputLocator() {
        WebElement cityInput = driver.findElement(cityInputLocator);
        return cityInput;
    }

    protected WebElement getPostalCodeInputLocator() {
        WebElement postalCodeInput = driver.findElement(postalCodeInputLocator);
        return postalCodeInput;
    }

    protected WebElement getSelectGenderLocator() {
        WebElement selectGender = driver.findElement(selectGenderLocator);
        return selectGender;
    }

    protected WebElement getSelectGenderListLocator(String gender) {
        WebElement selectGenderList = driver.findElement(By.xpath(String.format(selectGenderListLocator,gender)));
        return selectGenderList;
    }

    protected WebElement getSelectSecretQuestionLocator() {
        WebElement selectSecretQuestion = driver.findElement(selectSecretQuestionLocator);
        return selectSecretQuestion;
    }

    protected WebElement getSelectSecretQuestionListLocator(String question) {
        WebElement selectSecretQuestionList = driver.findElement(By.xpath(String.format(selectSecretQuestionListLocator,question)));
        return selectSecretQuestionList;
    }

    protected WebElement getAnswerInputLocator() {
        WebElement answerInput = driver.findElement(answerInputLocator);
        return answerInput;
    }

    protected WebElement getLoginInputLocator() {
        WebElement loginInput = driver.findElement(loginInputLocator);
        return loginInput;
    }

    protected WebElement getRegisterButtonLocator() {
        WebElement registerButton = driver.findElement(registerButtonLocator);
        return registerButton;
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

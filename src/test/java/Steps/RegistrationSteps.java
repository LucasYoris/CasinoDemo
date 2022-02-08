package Steps;

import Pages.RegistrationPage;
import com.imagetyperzapi.ImageTyperzAPI;
import com.vimalselvam.cucumber.listener.Reporter;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RegistrationSteps extends RegistrationPage {

    public static String captcha_id;

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

    public void passwordInput(String password){
        Assert.assertTrue(getPasswordInputLocator().isDisplayed());
        getPasswordInputLocator().sendKeys(password);
    }

    public void reEnterPasswordInput(String password){
        Assert.assertTrue(getReEnterPasswordInputLocator().isDisplayed());
        getReEnterPasswordInputLocator().sendKeys(password);
    }

    public void nameInput(String name){
        Assert.assertTrue(getNameInputLocator().isDisplayed());
        getNameInputLocator().sendKeys(name);
    }

    public void lastNameInput(String lastName){
        Assert.assertTrue(getLastNameInputLocator().isDisplayed());
        getLastNameInputLocator().sendKeys(lastName);
    }

    public void middleNameInput(String middleName){
        Assert.assertTrue(getMiddleNameInputLocator().isDisplayed());
        getMiddleNameInputLocator().sendKeys(middleName);
    }

    public void termsAndConditionsCheckBox(){
        Assert.assertTrue(getTermsAndConditionsCheckBoxLocator().isDisplayed());
        getTermsAndConditionsCheckBoxLocator().click();
    }

    public void captchaInput() throws Exception {
        //to focus captcha img
        getEnterCodeInputLocator().sendKeys("Enter code");
        getEnterCodeInputLocator().clear();
        //take screenshot and copy to captchaScreenshots
        String captchaPath = System.getProperty("user.dir")+"\\captchaScreenshots\\captcha.png";
        File src = getCaptchaImgLocator().getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File(captchaPath));

        //trying with tesseract OCR
        /*ITesseract image = new Tesseract();
        image.setDatapath(System.getProperty("user.dir")+"\\src\\tessdata");
        image.setLanguage("Latin");
        String captchaString = image.doOCR(new File(captchaPath));*/

        //Image Tyzer API
        ImageTyperzAPI i = new ImageTyperzAPI("ED4592D467604D7C9B2891DEA6431902");
        //get balance of the account
        String balance = i.account_balance();
        //config params
        HashMap<String, String> image_params = new HashMap<String, String>();
        image_params.put("iscase", "true");         // case sensitive captcha
        image_params.put("isphrase", "false");       // text contains at least one space (phrase)
        image_params.put("ismath", "false");         // instructs worker that a math captcha has to be solved
        image_params.put("alphanumeric", "2");      // 1 - digits only, 2 - letters only
        image_params.put("minlength", "6");         // captcha text length (minimum)
        image_params.put("maxlength", "7");         // captcha text length (maximum)
        Assert.assertTrue(getEnterCodeInputLocator().isDisplayed());
        if(getEnterCodeInputLocator().isDisplayed()){
            //request img and return the string
            captcha_id = i.submit_image(captchaPath, image_params);
            HashMap<String, String> captcha = i.retrieve_response(captcha_id);
            getEnterCodeInputLocator().sendKeys(captcha.get("Response"));
            Reporter.addStepLog("Captcha used: "+captcha.get("Response")+"\n"+"Captcha ID: "+captcha_id);
            Thread.sleep(1000);
        }
    }

    public void birthdayDateInput(String date){
        Assert.assertTrue(getBirthdayDateLocator().isDisplayed());
        ((JavascriptExecutor)driver).executeScript ("document.getElementById('core__protected_modules_user_yiiForm_RegistrationForm_birthday').removeAttribute('readonly',0);");
        getBirthdayDateLocator().clear();
        getBirthdayDateLocator().sendKeys(date);


    }

    public void nicknameInput(String nickname){
        Assert.assertTrue(getNicknameInputLocator().isDisplayed());
        getNicknameInputLocator().sendKeys(nickname);
    }

    public void addressInput(String address){
        Assert.assertTrue(getAddressInputLocator().isDisplayed());
        getAddressInputLocator().sendKeys(address);
    }

    public void clickCountry(){
        Assert.assertTrue(getSelectCountryLocator().isDisplayed());
        getSelectCountryLocator().click();
    }

    public void selectCountry(String country){
        Assert.assertTrue(getSelectCountryListLocator(country).isDisplayed());
        getSelectCountryListLocator(country).click();
    }

    public void cityInput(String city){
        Assert.assertTrue(getCityInputLocator().isDisplayed());
        getCityInputLocator().sendKeys(city);
    }

    public void postalCodeInput(String postalCode){
        Assert.assertTrue(getPostalCodeInputLocator().isDisplayed());
        getPostalCodeInputLocator().sendKeys(postalCode);
    }

    public void clickGender(){
        Assert.assertTrue(getSelectGenderLocator().isDisplayed());
        getSelectGenderLocator().click();
    }

    public void selectGender(String gender){
        Assert.assertTrue(getSelectGenderListLocator(gender).isDisplayed());
        getSelectGenderListLocator(gender).click();
    }

    public void clickSecretQuestion(){
        Assert.assertTrue(getSelectSecretQuestionLocator().isDisplayed());
        getSelectSecretQuestionLocator().click();
    }

    public void selectSecretQuestion(String question){
        Assert.assertTrue(getSelectSecretQuestionListLocator(question).isDisplayed());
        getSelectSecretQuestionListLocator(question).click();
    }

    public void answerInput(String answer){
        Assert.assertTrue(getAnswerInputLocator().isDisplayed());
        getAnswerInputLocator().sendKeys(answer);
    }

    public void loginInput(String login){
        Assert.assertTrue(getLoginInputLocator().isDisplayed());
        getLoginInputLocator().sendKeys(login);
    }

    public void clickRegisterButton(){
        Assert.assertTrue(getRegisterButtonLocator().isDisplayed());
        getRegisterButtonLocator().click();
    }

    public void checkRegisterMessage(){
        Assert.assertTrue(getRegisterMesssage1Locator().isDisplayed());
        Assert.assertTrue(getRegisterMesssage2Locator().isDisplayed());
    }

    public static int randomNumber() {
        int min = 10;
        int max = 99999999;

        //Generate random int value from 10 to 99999999
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }

    public static String randomString() {
        //Generate random String of 5 letters
        byte[] array = new byte[5];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }


}

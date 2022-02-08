package Steps;

import Pages.ContactsPage;
import Pages.RegistrationPage;
import com.imagetyperzapi.ImageTyperzAPI;
import com.vimalselvam.cucumber.listener.Reporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ContactsSteps extends ContactsPage {

    public static String captcha_id;

    public void contactsTitleValidation() {
        Assert.assertTrue("Title contacts page is not displayed",getContactsTitlePage().isDisplayed());
    }

    public void nameInput(String name){
        Assert.assertTrue(getNameInputLocator().isDisplayed());
        getNameInputLocator().sendKeys(name);
    }

    public void emailInput(String email) {
        Assert.assertTrue(getEmailInputLocator().isDisplayed());
        getEmailInputLocator().sendKeys(email);
    }

    public void topycInput(String topyc) {
        Assert.assertTrue(getTopycInputLocator().isDisplayed());
        getTopycInputLocator().sendKeys(topyc);
    }


    public void clickCategory(){
        Assert.assertTrue(getCategoryLocator().isDisplayed());
        getCategoryLocator().click();
    }

    public void selectCategory(String category){
        Assert.assertTrue(getSelectCategoryListLocator(category).isDisplayed());
        getSelectCategoryListLocator(category).click();
    }

    public void messaggeInput(String messagge) {
        Assert.assertTrue(getMessageInputLocator().isDisplayed());
        getMessageInputLocator().sendKeys(messagge);
    }


    public String captchaInput() throws Exception {
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
        return captcha_id;
    }

    public void clickSendButton(){
        Assert.assertTrue(getSendButton().isDisplayed());
        getSendButton().click();
    }

    public void checkContactsMessage(){
        Assert.assertTrue(getRegisterMesssage1Locator().isDisplayed());
        Assert.assertTrue(getRegisterMesssage2Locator().isDisplayed());
    }

}

package com.ninja.pages;

import com.ninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class);

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//nav[@id='top']/div/div[2]/ul/li[2]/a") //My Account
    WebElement MyAccount;

    public void clickMyAccount() {
        clickOnElement(MyAccount);
    }

    @CacheLookup
    @FindBy(xpath = "//nav[@id='top']/div[1]/div[2]/ul/li[2]/ul[1]/li[1]/a") //account option login
    WebElement accountOptionLogin;

    public void clickAccountOption() {
        log.info("click on account option login");
        selectByIndexFromDropDown(accountOptionLogin, 2);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a") // acc opt reg
    WebElement accountOptionRegistration;

    public void clickAccountOptionRegistration() {
        log.info("click on account option Registration");
        clickOnElement(accountOptionRegistration);
    }

    @CacheLookup
    @FindBy(id = "input-firstname") // form field
    WebElement firstName;
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @FindBy(id = "input-email")
    WebElement email;
    @FindBy(id = "input-telephone")
    WebElement telephone;
    @FindBy(id = "input-password")
    WebElement pswd;
    @FindBy(id = "input-confirm")
    WebElement rpswd;
    @FindBy(id = "//label[@class='radio-inline']/input")
    WebElement radioButton;

    @FindBy(id = "//input[@type='checkbox']")
    WebElement privacyPolicy;
    @FindBy(id = "//input[@class='btn btn-primary']")
    WebElement clickButton1;
    @FindBy(id = "//div[@id='content']/div/div/a")
    WebElement clickButton2;


    public void RegistrationDetails() {
        log.info("Add first name");
        sendTextToElement(firstName, "Alka");

        log.info("add last name");
        sendTextToElement(lastName, "Jadeja");

        log.info("add email");
        sendTextToElement(email, "abc@gmail.com");

        log.info("add telephone");
        sendTextToElement(telephone, "1234567890");

        log.info("add pswd");
        sendTextToElement(pswd, "123456");

        log.info("add repswd");
        sendTextToElement(rpswd, "123456");


    }
    public void radioButton(){
    log.info("click on radio button");
        clickOnElement(radioButton);
    }

    public void policy(){
        log.info("click on privacy policy");
            clickOnElement(privacyPolicy);
    }

    public void button1(){
        log.info("click on button 1");
            clickOnElement(clickButton1);
    }
    public void button2() {
        log.info("click on button 2");
        clickOnElement(clickButton2);

    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2[1]") //
    WebElement accountLink;

    public void clickOnAccountLink() {
        log.info("click on account link");
        clickOnElement(accountLink);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div/a") //
    WebElement button3;

    public void clickonButton3() {
        log.info("click on button3");
        clickOnElement(button3);
    }
}

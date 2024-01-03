package com.ninja.pages;

import com.ninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopPage.class);

    public LaptopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group input-group input-group-sm']/select") //High to Low
    WebElement HighToLow;

    public void fromHightoLow() {
        //log.info("select from high to low"); //
        selectByIndexFromDropDown(HighToLow, 4);
    }

    @CacheLookup
   // @FindBy(xpath = " //*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
     @FindBy(xpath = "//div[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a") //select mac book
    WebElement MacBook;

    public void clickOnMacbook() throws InterruptedException {
        // log.info("click MacBook");
        JavascriptExecutor jse = (JavascriptExecutor)driver ;
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,2000)");
        clickOnElement(MacBook);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']") // add to cart
    WebElement AddToCart;

    public void clickOnAddToCart() {
        log.info("click on add to cart");
        clickOnElement(AddToCart);
    }


    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[4]/a") // shopping cart
    WebElement shoppingCart;

    public void clickOnShoppingCart() {
        log.info("click on shoping cart");
        clickOnElement(shoppingCart);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input") // change qty
    WebElement changeQty;

    public void clickOnChangeQty() {
        log.info("click on change Qty");
        changeQty.clear();
        sendTextToElement(changeQty, "2");
    }

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-refresh']") // update
    WebElement update;

    public void clickUpdate() {
        log.info("click on update");
        clickOnElement(update);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']/ul/li[5]/a/span") // checkout
    WebElement checkout;

    public void clickCheckOut() {
        log.info("click on checkout");
        clickOnElement(checkout);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label") // guest
    WebElement guest;

    public void clickGuest() {
        log.info("click on guest");
        clickOnElement(guest);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']") //continue button
    WebElement continueButton;

    public void clickContinueButton() {
        log.info("click on continue button");
        clickOnElement(continueButton);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']") //first name
    WebElement firstname;
    @FindBy(id = "input-payment-lastname") //last name
    WebElement lastname;
    @FindBy(id = "input-payment-email") //email
    WebElement emailId;
    @FindBy(id = "input-payment-telephone") //telephone
    WebElement telephone;
    @FindBy(id = "input-payment-company") //company
    WebElement company;
    @FindBy(id = "input-payment-address-1") //address
    WebElement Address;
    @FindBy(id = "input-payment-city") //city
    WebElement city;
    @FindBy(id = "input-payment-postcode") //postcode
    WebElement postcode;
    @FindBy(id = "input-payment-country") //country name
    WebElement countryName;
    @FindBy(id = "input-payment-zone") //zone name
    WebElement zoneName;

    public void enterMandatoryField() {
        log.info("Enter First Name ");
        sendTextToElement(firstname, "Alka");
        log.info("Enter Last Name ");
        sendTextToElement(lastname, "Jadeja");
        log.info("Enter email id ");
        sendTextToElement(emailId, "abc@gmail.com");

        log.info("Enter telephone ");
        sendTextToElement(telephone, "1234567890");

        log.info("Enter company ");
        sendTextToElement(company, "test");

        log.info("Enter address ");
        sendTextToElement(Address, "pqr");

        log.info("Enter city ");
        sendTextToElement(city, "London");

        log.info("Enter postcode ");
        sendTextToElement(postcode, "123456");

        log.info("Enter country name ");
        selectByIndexFromDropDown(countryName, 15);

        log.info("Enter zone name ");
        selectByIndexFromDropDown(zoneName, 8);

    }

    @CacheLookup
    @FindBy(id = "button-guest") //continue button1
    WebElement continueButton1;

    public void clickContinueButton1() {
        log.info("click on continue button1");
        clickOnElement(continueButton1);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='collapse-shipping-method']/div/p[4]/textarea") //comments
    WebElement comments;

    public void addComments() {
        log.info("Add comments");
        clickOnElement(comments);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]") //terms
    WebElement termsAndConditions;

    public void TermsAndConditions() {
        log.info("Add terms and conditions");
        clickOnElement(termsAndConditions);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]") //continue last
    WebElement continuelast;

    public void continueLast() {
        log.info("click on continue");
        clickOnElement(continuelast);
    }


}
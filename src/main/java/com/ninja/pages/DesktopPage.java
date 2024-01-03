package com.ninja.pages;

import com.ninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class);

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']") //Select Z to A
    WebElement AtoZ;

    public void selectFromAtoZ() {
        log.info("select from Z to A :"); // create method for show all
        selectByIndexFromDropDown(AtoZ, 1);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a") //Select product HP
    WebElement HPLP3065;

    public void selectHPLP3065() {
        log.info("select HPLP3065 :"); // click on HPLP3065
        clickOnElement(HPLP3065);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/div[2]/div[1]/div/input") //Select Date
    WebElement Date;

    public void selectDate() {
        log.info("select Date :"); // create method for show all
        sendTextToElement(Date, "22-10-2023");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']") //Select Quantity
    WebElement Quantity;

    public void selectQuantity() {
        log.info("select Quantity");
        sendTextToElement(Quantity, "1");
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']") //Add to cart
    WebElement AddCart;

    public void AddToCart() {
        log.info("Add to Cart"); // create method for show all
        clickOnElement(AddCart);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[4]/a") //Add to cart
    WebElement ShoppingCart;

    public void ShoppingCartDisplay() {
        log.info("Shopping Cart"); // create method for show all
        clickOnElement(ShoppingCart);
    }

}




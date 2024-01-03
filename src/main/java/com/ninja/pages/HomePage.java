package com.ninja.pages;


import com.ninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/a") //Desktop xpath
    WebElement Desktops;

    public void clickOnDesktopLink() {
        log.info("Clicking on Desktop link :"); // create method for desktop
        clickOnElement(Desktops);
    }
    @CacheLookup
    @FindBy(xpath = "//a[text()='Show AllDesktops']") //Show All
    WebElement ShowAllDesktops;

    public void clickOnShowAllDesktops() {
        log.info("Clicking on Desktop link :"); // create method for show all
        clickOnElement(ShowAllDesktops);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2") //get desktop text
    WebElement desktop;

    public String getDesktopText() {
        return getTextFromElement(desktop);

    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/a") //Laptop xpath
    WebElement Laptop;

    public void clickOnLaptopLink() {
        log.info("Clicking on Laptop link :"); // create method for desktop
        clickOnElement(Laptop);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a") //Show All laptop
    WebElement ShowAllLaptop;

    public void clickOnShowAllLaptop() {
        log.info("Clicking on show all Laptop link :"); // create method for show all
        clickOnElement(ShowAllLaptop);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[3]") //component xpath
    WebElement components;

    public void clickOnComponents() {
        log.info("Clicking on components link :"); // create method for components
        clickOnElement(components);
    }
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']/div[2]/ul/li[3]/div/a") //Show All components
    WebElement ShowAllComponents;

    public void clickOnShowAllComponents() {
        log.info("Clicking on show all components :"); // create method for show all
        clickOnElement(ShowAllComponents);
    }





}

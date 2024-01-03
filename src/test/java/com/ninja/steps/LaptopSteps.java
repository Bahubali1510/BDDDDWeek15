package com.ninja.steps;

import com.ninja.pages.LaptopPage;
import cucumber.api.java.en.And;

public class LaptopSteps {
    @And("^Select Sort By Price \\(High > Low\\)$")
    public void selectSortByPriceHighLow() throws InterruptedException {
        Thread.sleep(1000);
        new LaptopPage().fromHightoLow();
        Thread.sleep(1000);
        new LaptopPage().clickOnMacbook();
    }

    @And("^I click on macbook product$")
    public void iClickOnMacbookProduct() throws InterruptedException {
        Thread.sleep(1000);
        new LaptopPage().clickOnMacbook();
    }
}

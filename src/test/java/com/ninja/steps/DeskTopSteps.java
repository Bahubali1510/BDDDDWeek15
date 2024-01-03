package com.ninja.steps;

import com.ninja.pages.DesktopPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class DeskTopSteps {
    @And("^I Select Z to A from DropDownList$")
    public void iSelectZToAFromDropDownList() {
        new DesktopPage().selectFromAtoZ();
    }

    @And("^Select Product HP LP(\\d+)$")
    public void selectProductHPLP(int arg0) {
        
    }

    @And("^Select Delivery Date \"([^\"]*)\"$")
    public void selectDeliveryDate(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Enter Qty \"(\\d+)” using Select class\\.$")
    public void enterQtyUsingSelectClass(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Click on “Add to Cart” button$")
    public void clickOnAddToCartButton() {


    }


}

package com.ninja.steps;

import com.ninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on desktop tab$")
    public void iClickOnDesktopTab() {
        new HomePage().clickOnDesktopLink();
        
    }

    @And("^I click on show all desktop tab$")
    public void iClickOnShowAllDesktopTab() {
        new HomePage().clickOnShowAllDesktops();
    }


    @When("^I click on Laptops & Notebooks tab$")
    public void iClickOnLaptopsNotebooksTab() {
        new HomePage().clickOnLaptopLink();
        
    }

    @And("^I click on show all Laptops & Notebooks tab$")
    public void iClickOnShowAllLaptopsNotebooksTab() {
        new HomePage().clickOnShowAllLaptop();

    }


    @When("^I click on Components$")
    public void iClickOnComponents() {
        new HomePage().clickOnComponents();

    }

    @Then("^I click on show All Components$")
    public void iClickOnShowAllComponents() {
        new  HomePage().clickOnShowAllComponents();
    }
}

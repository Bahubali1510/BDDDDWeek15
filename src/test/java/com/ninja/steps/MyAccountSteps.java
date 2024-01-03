package com.ninja.steps;

import com.ninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyAccountSteps {
    @Given("^I am on My Account Link\\.$")
    public void iAmOnMyAccountLink() {
        new MyAccountPage().clickMyAccount();

    }

    @And("^Click on Registration Link$")
    public void clickOnRegistrationLink() {
        new MyAccountPage().clickAccountOptionRegistration();


    }

    @And("^enter registration details$")
    public void enterRegistrationDetails() {
        new MyAccountPage().RegistrationDetails();

    }

    @And("^Select Subscribe Yes radio button$")
    public void selectSubscribeYesRadioButton() {
        new MyAccountPage().radioButton();

    }

    @And("^Click on Privacy Policy check box$")
    public void clickOnPrivacyPolicyCheckBox() {
        new MyAccountPage().policy();

    }


    @And("^Click on Continue(\\d+) button$")
    public void clickOnContinueButton(int arg0) {
        new MyAccountPage().button1();

    }

    @And("^Click on My Account Link\\.$")
    public void clickOnMyAccountLink() {
        new MyAccountPage().button2();


    }

    @And("^Click on logout$")
    public void clickOnLogout() {
        new MyAccountPage().clickOnAccountLink();

    }

    @And("^Click on final Continue button$")
    public void clickOnFinalContinueButton() {
        new MyAccountPage().clickonButton3();
    }
}

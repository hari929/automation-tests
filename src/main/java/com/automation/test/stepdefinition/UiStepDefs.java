package com.automation.test.stepdefinition;

import com.automation.test.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UiStepDefs {
    @Steps
    private LoginSteps loginSteps;

    @Given("I am on the application")
    public void i_am_on_the_application() {
        loginSteps.verifyTitle();
    }

    @When("I navigate to Login Page by clicking on Sign In button")
    public void i_navigate_to_Login_Page_by_clicking_on_Sign_In_button() {
        loginSteps.login();
    }
}

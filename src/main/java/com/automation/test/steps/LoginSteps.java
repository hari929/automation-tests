package com.automation.test.steps;

import com.automation.test.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	private LoginPage loginPage;

	@Step
	public void verifyTitle() {
		loginPage.verifyTitle();
	}
	@Step
	public void login() {
		loginPage.login("keeperb","Password1");
	}
}

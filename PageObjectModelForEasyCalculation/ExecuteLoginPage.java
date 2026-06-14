package com.EasyCalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCalculation.Page.LoginEasyCal;
import com.helper.BrowserFactory;

public class ExecuteLoginPage {
	@Test
	public void CheckValidateUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome",
				"https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCal loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		loginPageEasyCal.login_EasyCal("7643863115", "Password1234");
	}
}

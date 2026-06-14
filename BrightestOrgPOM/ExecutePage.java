package com.Execute.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Helper.BrowserFactory_Bright;
import com.Login.Page.LoginPage;


public class ExecutePage {


	public class Execute_PracticeAutomation {

	    @Test
	    public void CheckValidateUser() {
	    	WebDriver driver = BrowserFactory_Bright.BrowserOptions("chrome", "https://profile.brightest.org/accounts/login/");
	    	LoginPage loginPagepractice = PageFactory.initElements(driver, LoginPage.class);
	        loginPagepractice.login_Practice("student", "Password123");
	    }
	}
	
	
}

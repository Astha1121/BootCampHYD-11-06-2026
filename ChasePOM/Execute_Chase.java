package com.Execute.TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Helper.BrowserFactory_Chase;
import com.Login.Page.Login_Chase;

public class Execute_Chase {


		public class Execute_Page {

		    @Test
		    public void CheckValidateUser() {
		    	WebDriver driver = BrowserFactory_Chase.BrowserOptions("chrome", "https://www.chase.com/");
		    	Login_Chase loginPagepractice = PageFactory.initElements(driver, Login_Chase.class);
		        loginPagepractice.login_Practice("student", "Password123");
		    }
		}
		
		
	}


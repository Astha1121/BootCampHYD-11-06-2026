package com.PracticeAutomation.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Login_PracticeAutomation {

		WebDriver driver;
		String URL = "http://practicetestautomation.com/practice-test-login/";

		public Login_PracticeAutomation(WebDriver driver) {
			this.driver = driver;
		}

		@FindBy(id = "username")
		WebElement username;

		@FindBy(id = "password")
		WebElement password;
		
		@FindBy(xpath = "//*[@id=\"submit\"]")
		WebElement loginbtn;

	public void login_Practice(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	}


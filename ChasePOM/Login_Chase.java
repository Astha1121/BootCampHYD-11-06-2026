package com.Login.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Chase {

		WebDriver driver;
		String URL = "http://chase.com/";

		public Login_Chase(WebDriver driver) {
			this.driver = driver;
		}
		//@FindBy(id = "userId-text-input-field")
		@FindBy(xpath = "//input[@id='userId-text-input-field']")
		WebElement username;

		//@FindBy(id = "password-text-input-field")
		@FindBy(xpath = "//input[@id='password-text-input-field']")
		WebElement password;

		@FindBy(xpath = "//button[@id='signin-button']")
		WebElement loginbtn;

		public void login_Practice(String uname, String pass) {
			username.sendKeys(uname);
			password.sendKeys(pass);
			loginbtn.click();
		}
	}


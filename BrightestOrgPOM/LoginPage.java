package com.Login.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	String URL = "https://profile.brightest.org/accounts/login/";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "id_login")
	WebElement username;

	@FindBy(id = "id_password")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement loginbtn;

	public void login_Practice(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}

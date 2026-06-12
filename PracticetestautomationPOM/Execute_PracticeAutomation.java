package com.PracticeAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory_PracticeAutomation;
import com.PracticeAutomation.Page.Login_PracticeAutomation;

public class Execute_PracticeAutomation {

    @Test
    public void CheckValidateUser() {
    	WebDriver driver = BrowserFactory_PracticeAutomation.BrowserOptions("chrome", "http://practicetestautomation.com/practice-test-login/");
        Login_PracticeAutomation loginPagepractice = PageFactory.initElements(driver, Login_PracticeAutomation.class);
        loginPagepractice.login_Practice("student", "Password123");
    }
}
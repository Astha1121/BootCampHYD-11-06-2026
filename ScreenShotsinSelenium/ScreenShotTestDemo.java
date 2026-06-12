package com.ssinselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotTestDemo {
	WebDriver driver;
	String URL = "http://only-testing-blog.blogspot.com/2014/05/form.html";

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
	}

	@Test
	public void ScreenshotTest() throws Exception {
		driver.manage().deleteAllCookies();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/Homepage.png"));
	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}
}

package ScreenShotDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Reusability;

public class TestScreenShot {
	@Test
	public void Browser() throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hollandandbarrett.com/");
	driver.manage().window().maximize();
	
	Reusability.capturedScreenShot(driver , "A. Launch Application -  Take Screenshot");
	
	driver.findElement(By.id("username")).sendKeys("asthas1192081@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Password1234");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("")).click();
	Reusability.capturedScreenShot(driver , "B. Signin Button -  Take Screenshot");
	driver.quit();

}}

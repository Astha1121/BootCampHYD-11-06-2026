package com.DatadrivenusingCSV;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class DataDrivenTestDemo {
	WebDriver driver;
	String URL = "http://only-testing-blog.blogspot.com/2014/05/form.html";
	String CSVPath = "C:\\CoforgeBootCampTesting\\ExcelCSV\\BOOK1.csv";

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
	}
	
	@Test
	public void DataDrivenTest() throws Exception {
		CSVReader reader = new CSVReader(new FileReader(CSVPath));
		String[] CSVcell;
		while((CSVcell = reader.readNext())  != null) {
			String Fname = CSVcell[0];
			String Lname = CSVcell[1];
			String Email = CSVcell[2];
			String Mnum = CSVcell[3];
			String Cname = CSVcell[4];
			driver.findElement(By.name("FirstName")).sendKeys(Fname);
			driver.findElement(By.name("LastName")).sendKeys(Lname);
			driver.findElement(By.name("EmailID")).sendKeys(Email);
			driver.findElement(By.name("MobNo")).sendKeys(Mnum);
			driver.findElement(By.name("Company")).sendKeys(Cname);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
		}
	}
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

	
}

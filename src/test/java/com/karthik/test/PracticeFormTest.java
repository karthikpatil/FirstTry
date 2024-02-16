package com.karthik.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PracticeFormTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@name='password']")));
		element.click();
		element.sendKeys("test123");
		WebElement element2=driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@name='username']")));
		element2.click();
		element2.sendKeys("test");
	}

}

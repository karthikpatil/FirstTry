package com.karthik.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type='email']")).click();
		driver.findElement(By.xpath("//*[@type='email']")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait webdriverwait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("akarthikpatil@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		webdriverwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Try again']"))).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Try again')]")).click();  #next > div > div > a
		//*[@id="identifierNext"]/div/button/div[3]
		System.out.println("HELLLLLOOOOOOO");
		driver.close();
		

	}

}

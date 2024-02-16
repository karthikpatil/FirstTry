package com.karthik.test.ChromeDevToolsExample;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.emulation.Emulation;
import org.openqa.selenium.devtools.v118.security.Security;

import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		VoidDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//DevTools devtool=((ChromeDriver) driver).getDevTools();
		//devtool.createSession();
		//devtool.send(Emulation.setGeolocationOverride(Optional.of((Number)51.12345), Optional.of((Number)(double)-0.01234), Optional.of((Number)99)));
		//devtool.send(Security.setIgnoreCertificateErrors(true));
		
		driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=htmlframetag");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.get
		//driver.switchTo().alert().
		driver.switchTo().frame("iframewrapper");
		driver.switchTo().frame(1);
		driver.findElement(By.partialLinkText("Home")).click();
		driver.findElement(By.partialLinkText("Python")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		

	}

}

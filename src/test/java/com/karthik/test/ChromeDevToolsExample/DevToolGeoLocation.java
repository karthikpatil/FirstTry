package com.karthik.test.ChromeDevToolsExample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.security.Security;

import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class DevToolGeoLocation {

	public static void main(String[] args) {
		VoidDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devtool=((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		devtool.send(Security.enable());
		devtool.send(Security.setIgnoreCertificateErrors(true));
		
		driver.get("https://expired.badssl.com");
		
		

	}

}

package com.karthik.test.ChromeDevToolsExample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class DevToolBrowserAPITesting {

	public static void main(String[] args) {
		VoidDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devtool=((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		//devtool.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		
		driver.get("https://mycurrentlocation.net/");
		
		

	}

}

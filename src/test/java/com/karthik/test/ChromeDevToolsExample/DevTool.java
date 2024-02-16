package com.karthik.test.ChromeDevToolsExample;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.cachestorage.model.Header;
import org.openqa.selenium.devtools.v118.emulation.Emulation;
import org.openqa.selenium.devtools.v118.network.Network;
import org.openqa.selenium.devtools.v118.network.model.Headers;
import org.openqa.selenium.devtools.v118.security.Security;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class DevTool {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		Actions actions=new Actions(driver);
		
		//driver.getWindowHandle()
		
		//actions.
		driver.manage().window().maximize();
		DevTools devtool = ((ChromeDriver) driver).getDevTools();
		devtool.createSession();
		devtool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devtool.addListener(Network.requestWillBeSent(), request -> {
			Headers header = request.getRequest().getHeaders();

			if (!header.isEmpty()) {
				header.forEach((key, value) -> {
					System.out.println(" Request - Key -> " + key + " , request Value - " + value);
				});

			}
		});

		devtool.addListener(Network.responseReceived(), response -> {
			Headers header = response.getResponse().getHeaders();

			if (!header.isEmpty()) {
				header.forEach((key, value) -> {
					System.out.println("Response Key - " + key + ", Response Value - " + value);
				});

			}
		});
		driver.get("https://reqres.in/api/users?page=2");
	}

}

package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		
		
	//	System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
   //	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

	}

}

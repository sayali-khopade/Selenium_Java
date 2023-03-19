package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.utkarshaaacademy.com";
		String google = "https://www.google.com";
		driver.get(url);
		driver.get(google);
	}

}

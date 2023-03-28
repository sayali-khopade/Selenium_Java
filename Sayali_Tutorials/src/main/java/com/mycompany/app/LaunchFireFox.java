package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String utkarshaa = "https://www.utkarshaaacademy.com";
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.get(utkarshaa);
	}

}

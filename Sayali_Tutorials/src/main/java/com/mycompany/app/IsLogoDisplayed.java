package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsLogoDisplayed {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.utkarshaaacademy.com");
		
	    WebElement Logo = driver.findElement(By.xpath("//*[@id=\"header-section\"]/div/div[2]/div/div/div/div[1]/div/a/img"));
	    Logo.isDisplayed();
	    System.out.println(Logo.isDisplayed());
	}

}

package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alsoluteXpathDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://utkarshaaacademy.com/automation-practice/");
		
		WebElement FirstName = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[1]/div/form/div/div[1]/div[1]/input"));
		FirstName.sendKeys("Utkarshaa");
		WebElement LastName = driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[1]/div/form/div/div[1]/div[2]/input"));
		LastName.sendKeys("Academy");
		
	}

}

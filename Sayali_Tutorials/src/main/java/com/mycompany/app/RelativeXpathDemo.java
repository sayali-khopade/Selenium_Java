package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://utkarshaaacademy.com/automation-practice/");
		
	//WebElement FirstName = driver.findElement(By.xpath("//input[@id='name-firstname']"));
		
		// starts with
		WebElement FirstName = driver.findElement(By.xpath("//input[starts-with(@id,'name-fir')]"));
		
		FirstName.sendKeys("Utkarshaa");
		WebElement LastName = driver.findElement(By.xpath("//input[starts-with(@id,'name-l')]"));
		LastName.sendKeys("Academy");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9423111564");

		WebElement Email = driver.findElement(By.xpath("//input[contains(@name,'email[value]')]"));
		Email.sendKeys("info@utkarshaaacademy.com");
		
		WebElement Date = driver.findElement(By.xpath("//input[contains(@id,'da')]"));
		Date.sendKeys("09-02-2023");
		
		WebElement BookAppointment = driver.findElement(By.xpath("//button[contains(text(),'Book')]"));
		BookAppointment.click();
		
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("//button[@id='u_0_5_0I' or @name='login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'gotten')]")).click();
		
		//li[@aria-label='Oppo']//child::input
		//span[text()='Oppo']//preceding-sibling::div//input
			
	}

}

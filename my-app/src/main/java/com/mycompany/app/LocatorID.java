package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorID {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://utkarshaaacademy.com/automation-practice/");
		
		WebElement FirstName = driver.findElement(By.id("name-firstname"));
		FirstName.sendKeys("Shubham");
		
		WebElement LastName = driver.findElement(By.id("name-lastname"));
		LastName.sendKeys("Mapara");
		
		WebElement Phone = driver.findElement(By.id("phone"));
		Phone.sendKeys("9423111564");
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("ravinangre@gmail.com");
		
		WebElement Date = driver.findElement(By.id("date"));
		Date.sendKeys("06-02-2023");
		
		WebElement Time = driver.findElement(By.id("time-morning"));
		Time.click();
		
		WebElement Special_Notes = driver.findElement(By.id("special-notes"));
		Special_Notes.sendKeys("Hi All Welcome to Utkarshaa Academy");
		
		WebElement Book_Appointment_Btn = driver.findElement(By.className("wp-block-button__link"));
		Book_Appointment_Btn.click();
	}

}

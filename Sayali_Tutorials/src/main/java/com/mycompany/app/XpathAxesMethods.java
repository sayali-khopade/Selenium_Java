package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement CloseButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		CloseButton.click();

		WebElement SearchBtn = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		SearchBtn.sendKeys("mobiles");
		
		WebElement SearchArrow = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		SearchArrow.click();
		
		Thread.sleep(5000);
		// Xpath Axes Child
		WebElement FirstResult = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//child::div[@class='_1AtVbE col-12-12'][1]"));
	//	FirstResult.click();
		
	//	WebElement CheckBoxApple = driver.findElement(By.xpath("//div[text()='APPLE']//preceding-sibling::input"));
		WebElement CheckBoxApple = driver.findElement(By.xpath("//div[@title='APPLE']//child::input"));

		//div[@title='APPLE']//child::input[@type='checkbox' and @class='_30VH1S']
//		CheckBoxApple.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", CheckBoxApple);
	
		// Following 
	//	(//div[@class='_2d0we9'])[1]//following::input
		
		WebElement CheckboxSamsung = driver.findElement(By.xpath("((//div[@class='_2d0we9'])[1]//following::input)[5]"));
		js.executeScript("arguments[0].click()", CheckboxSamsung);
	//	(//div[@class='_4rR01T'])[1]//preceding::div     - matching node - 242
	//			(//div[@class='_4rR01T'])[1]//ancestor::div     - matching node - 12
	//	(//div[@class='_4rR01T'])[1]//parent::div[@class='col col-7-12']
		
		//span[contains(text(),'November 2023')]//following-sibling::div//child::span
		
		//tagname[@attribute='value']//axes-methods::tagname[@attribute='value']
		//a[text()='Sign Up']//parent::li//following-sibling::li[3]
		//span[text()='Xiaomi']//parent::a//div//input
		//span[text()='Xiaomi']//preceding-sibling::div//input
	}

}

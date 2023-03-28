package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Mobiles.click();
		WebElement Apple = driver.findElement(By.xpath("//span[text()='Apple']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Apple);
		WebElement AppleCheckBox = driver.findElement(By.xpath("//span[text()='Apple']//preceding-sibling::div//input"));
		System.out.println(AppleCheckBox.isSelected());
	}

}

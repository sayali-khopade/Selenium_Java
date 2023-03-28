package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement AlertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertBtn.click();
		
		driver.switchTo().alert().accept();
		WebElement TimerAlertBtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimerAlertBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement ConfirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ConfirmBtn);
		System.out.println(driver.switchTo().alert().getText());
		//ConfirmBtn.click();
		driver.switchTo().alert().dismiss();
		
		WebElement PromptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		js.executeScript("arguments[0].click()", PromptBtn);
		driver.switchTo().alert().sendKeys("Utkarshaa Academy Pune");
		driver.switchTo().alert().accept();
		
	}

}

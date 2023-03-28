package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		
		act.sendKeys(FullName, "Ravi Nangare").perform();
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		act.sendKeys("ravinangre@gmail.com").perform();
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		act.sendKeys("At Post Lokhandi Sawargaon Tal Ambajogai Dist Beed Pin 431517").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		act.sendKeys(Keys.ENTER).perform();
	}

}

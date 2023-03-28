package com.mycompany.app;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String MainWindow =	driver.getWindowHandle();
		
		WebElement NewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		NewTab.click();
			
		WebElement NewWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		NewWindow.click();
		
		WebElement NewWindowMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
	//	NewWindowMessage.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", NewWindowMessage);
		
		Set<String> ChildWindows = driver.getWindowHandles();
		
		for(String childWindow : ChildWindows)
		{
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				WebElement sampleHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				System.out.println(sampleHeading.getText());
				}
				
			}
			driver.switchTo().window(MainWindow);
	//	driver.close();
		driver.quit();

	}

}

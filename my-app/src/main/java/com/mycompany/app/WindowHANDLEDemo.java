package com.mycompany.app;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHANDLEDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String MainWindow =	driver.getWindowHandle();
		
//		WebElement MNC = driver.findElement(By.xpath("//span[text()='MNC']"));
//		MNC.click();
//		
		WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));
		Services.click();
		
		WebElement Remote = driver.findElement(By.xpath("//span[text()='Remote']"));
		Remote.click();
		
		
		
		Set<String> ChildWindows = driver.getWindowHandles();
		
		Iterator<String> itr = ChildWindows.iterator();
		
		while(itr.hasNext()) {
			
			String ChildWindow = itr.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				System.out.println(driver.getTitle());
			
				WebElement KnowMore = driver.findElement(By.xpath("//div[text()='RESUME DISPLAY']//following-sibling::div[text()='KNOW MORE']"));
				
				if(KnowMore.isDisplayed()) {
				KnowMore.click();
			}
				else{
					NoSuchElementException.getDriverName(null);
					System.out.println("No Such Element Displayed");
				
			}
			}
			driver.switchTo().window(MainWindow);
		}
	}

}

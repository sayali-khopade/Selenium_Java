package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FramesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
	// Handle Frame with id or name attribute	
	//	driver.switchTo().frame("frame1");
	//   Handle frame with web Element	
		driver.switchTo().frame(Frame1);
	//	driver.switchTo().frame(3);
		WebElement FrameText = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(FrameText.getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame2");
		WebElement FrameText1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(FrameText1.getText());
		
	}

}

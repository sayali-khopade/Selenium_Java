package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// Chrome Options
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
	//	options.addArguments("--headless");
		options.addArguments("window-size=280,653");
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Explicit wait (Fluent Wait)
				Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(60))
						.pollingEvery(Duration.ofSeconds(5))
						.ignoring(TimeoutException.class);
		// implicit wait (Dynamic Wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateNewAcc.click();
	// static wait	
	//	Thread.sleep(10000);
		
		// Explicit Wait
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Utkarshaa");
		
		
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement EnableAfter = driver.findElement(By.xpath("//button[@id='enableAfter']"));
		WebElement ColourChange = driver.findElement(By.xpath("//button[@id='colorChange']"));
		
		
		System.out.println("Enable After Button is Enabled " +EnableAfter.isEnabled());
		System.out.println("Colour Change Button Color value " +ColourChange.getCssValue("color"));
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		
		
		WebElement VisibleAfter = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
		System.out.println("Visible Adter Button is visible After 5 Seconds " +VisibleAfter.isDisplayed());
		
		System.out.println("Enable After Button is Enabled " +EnableAfter.isEnabled());
		System.out.println("Colour Change Button Color value " +ColourChange.getCssValue("color"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to Utkarshaa Academy');");
		
		ColourChange.click();
	}

}

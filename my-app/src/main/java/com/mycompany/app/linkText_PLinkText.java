package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText_PLinkText {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	//	WebElement ForgotPass = driver.findElement(By.linkText("Forgotten password?"));
	//	ForgotPass.click();

	//	WebElement CreateaPage = driver.findElement(By.linkText("Create a Page"));
	//	CreateaPage.click();
		
		WebElement Contact_uploading = driver.findElement(By.partialLinkText("Contact"));
		Contact_uploading.click();
		
	}

}

package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement ClickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		act.moveToElement(Buttons).perform();
		
		act.doubleClick(DoubleClickBtn).perform();
		act.contextClick(RightClickBtn).perform();
		act.click(ClickMeBtn).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement Interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		
		act.moveToElement(Interactions).perform();
		act.clickAndHold(dragable).perform();
		Thread.sleep(5000);
		act.dragAndDrop(dragable, dropable).perform();
		
		driver.get("https://demoqa.com/menu");
		WebElement Accordion = driver.findElement(By.xpath("//span[text()='Accordian']"));
		WebElement Menu1 = driver.findElement(By.xpath("//a[text()='Main Item 1']"));
		WebElement Menu2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement Menu3 = driver.findElement(By.xpath("//a[text()='Main Item 3']"));
		WebElement SubSubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST �']"));
		
		act.moveToElement(Accordion).perform();
		act.moveToElement(Menu1).perform();
		act.moveToElement(Menu3).perform();
		act.moveToElement(Menu2).perform();
		act.moveToElement(SubSubList).perform();
	}

}

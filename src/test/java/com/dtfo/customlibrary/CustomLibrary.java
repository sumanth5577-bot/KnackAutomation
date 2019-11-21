package com.dtfo.customlibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomLibrary 
{
 public static void openBackOffice(WebDriver driver)
 {
	 driver.get("https://backoffice.cteili-oneworldt1-s1-public.model-t.cc.commerce.ondemand.com/backoffice/login.zul;jsessionid=51C3CEFB8CFBC5E282AC9B767F84FDC0.backoffice-f5c5b8f96-fvxxv");
 }
 
 public static void signOut(WebDriver driver)
 {
	 driver.findElement(By.xpath("//a[@href='/logout']")).click();
 }
 
 public static void loginFunc(WebDriver driver, String username, String pwd)
 {
	driver.findElement(By.xpath("/html/body/main/header/nav/div/div[1]/div/div/div/div/ul/li[2]/a")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='j_username']")));
	driver.findElement(By.xpath("//input[@id='j_username']")).clear();
	driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys(username);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='j_password']")));
	driver.findElement(By.xpath("//input[@id='j_password']")).clear();
	driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys(pwd);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='loginForm']/button")));
	driver.findElement(By.xpath("//*[@id='loginForm']/button")).click();
 }
 
 public static void cardDetails(WebDriver driver, String cardNumber, String expiryDate, String cvv) throws InterruptedException
 {
	 String card,exp,cvvc;
	 card=cardNumber;
	 exp=expiryDate;
	 cvvc=cvv;
	 WebDriverWait wait=new WebDriverWait(driver,30);	 
	 
	 System.out.println("Enter Card Number");
	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cardNum']")));
	 Thread.sleep(6000);
	 driver.findElement(By.xpath("//*[@id='cardNum']")).clear();
	 driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys(card);
	 Thread.sleep(4000);
	 
	 System.out.println("Enter Expiry Date");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='expiryDate']")));
	 driver.findElement(By.xpath("//*[@id='expiryDate']")).clear();
	 driver.findElement(By.xpath("//*[@id='expiryDate']")).sendKeys(exp);
	 
	 System.out.println("Enter CVV");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cvv']")));
	 driver.findElement(By.xpath("//*[@id='cvv']")).clear();
	 driver.findElement(By.xpath("//*[@id='cvv']")).sendKeys(cvvc);
	 
	 System.out.println("Click on Pay Button");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("payBtn")));
	 driver.findElement(By.id("payBtn")).click();
 }
 
 public static void paymentPage(WebDriver driver) throws InterruptedException, AWTException
 {
	WebDriverWait wait=new WebDriverWait(driver,30);	 
	System.out.println("Enter Card Number"); 
 	/*JavascriptExecutor js = (JavascriptExecutor)driver;	 
 	WebElement ele=driver.findElement(By.xpath("//*[@id='cardNum']"));
	ele.clear();
	js.executeScript("arguments[0].value='5112345112345114';",ele);
	ele.clear();
	js.executeScript("arguments[0].value='5112345112345114';",ele);*/
	driver.findElement(By.xpath("//*[@id='cardNum']")).clear();
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("3");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("4");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("3");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("4");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='cardNum']")).sendKeys("4");
	Thread.sleep(1000);
	
	
	
	
 	 
	 System.out.println("Enter Expiry Date");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='expiryDate']")));
	 driver.findElement(By.xpath("//*[@id='expiryDate']")).clear();
	 driver.findElement(By.xpath("//*[@id='expiryDate']")).sendKeys("0323");
	 
	 System.out.println("Enter CVV");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cvv']")));
	 driver.findElement(By.xpath("//*[@id='cvv']")).clear();
	 driver.findElement(By.xpath("//*[@id='cvv']")).sendKeys("123");
	 
	  
	 System.out.println("Click on Pay Button");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("payBtn")));
	 driver.findElement(By.id("payBtn")).click();
	 
 }
}

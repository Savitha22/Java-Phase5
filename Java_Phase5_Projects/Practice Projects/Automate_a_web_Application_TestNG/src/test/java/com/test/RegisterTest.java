package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://www.amazon.in/");
	  }
	 
	  @BeforeMethod
	  public void beforeMethod() {
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  }
	 
	 @Test(priority = 1)
	  public void register() {
	      driver.findElement(By.id("nav-link-accountList")).click();
	      driver.findElement(By.id("createAccountSubmit")).click();
	      driver.findElement(By.id("ap_customer_name")).sendKeys("Savitha");
	      driver.findElement(By.id("ap_email")).sendKeys("savithasinik@gmail.com");
	      driver.findElement(By.id("ap_password")).sendKeys("Savitha2@");
	      driver.findElement(By.id("ap_password_check")).sendKeys("Savitha2@");
	      driver.findElement(By.id("continue")).click();
		  }
	  
	  
	  @Test(priority = 2)
	  public void login(){
		      driver.findElement(By.id("nav-link-accountList")).click();
		      driver.findElement(By.id("ap_email")).sendKeys("savithasinik@gmail.com");
			  driver.findElement(By.id("continue")).click();
		      driver.findElement(By.id("ap_password")).sendKeys("Savitha2@");
			  
			  
	  }
	  	
	  	@Test(priority = 3)
	  	public void search(){
	  		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus mobiles");
	  		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  		driver.findElement(By.id("nav-search-submit-button")).submit();
	  	}
	  	
	  	@Test(priority = 4)
	  	public void addToCart(){
	  	
		    driver.findElement(By.linkText("OnePlus Nord 2T 5G (Gray Shadow, 8GB RAM, 128GB Storage)")).click();
		    driver.findElement(By.id("add-to-cart-button")).click();
	  	}
	  
	

}

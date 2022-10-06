package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase1 {
  @Test
  public void f() {
	  	System.setProperty("webdriver.chrome.driver",
              "D:\\chromedriver.exe");
	  	//Instantiate WebDriver with ChromeDriver Object
	  	WebDriver  driver = new ChromeDriver();
	  
	  	//driver.get("https://login.yahoo.com/account/create");
	  	driver.get("http://localhost:8080/SeleniumTesting/index.jsp");
	  	//Fetch all input Elements from current web page 
	  	List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
	  	for(WebElement e : allInputElements)
          System.out.println("Input box id="+e.getAttribute("id"));// <input type="" id="">
	  	driver.quit();
  }
}

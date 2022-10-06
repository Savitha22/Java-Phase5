package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
    
    WebDriver driver;
    @Test(groups="Chrome")
    public void LaunchChrome() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        /* try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } */
    }
    @Test(groups="Chrome", dependsOnMethods="LaunchChrome")
    public void TryFacebook1() {
    
        driver.findElement(By.id("email")).sendKeys("savithasinik@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Savitha2@");
        driver.findElement(By.name("login")).click();
    }
  
    
    
    
    
    @Test(groups="Edge")
    public void LaunchEdge() {
    	 System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
         driver = new EdgeDriver();
     
        
         
        driver.get("https://www.facebook.com");
    	
       /* try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        } */
        
    }
    
    @Test(groups="Edge", dependsOnMethods="LaunchEdge")
    public void TryFacebook2() {
       
        driver.findElement(By.id("email")).sendKeys("savithasinik@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Savitha2@");
        driver.findElement(By.name("login")).click();
       
    }
}
   
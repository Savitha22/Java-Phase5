package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9040218%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw-fmZBhDtARIsAH6H8qiGjivBZrbieuEL8oAUd4NzAVVlIxysbI7tfawlRMNU07-7fQVYbOsaAriUEALw_wcB");
	
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
	      
	    driver.findElement(By.name("firstname")).sendKeys("Sakthi");
	      
	    driver.findElement(By.name("lastname")).sendKeys("K");
	      
	    driver.findElement(By.name("reg_email__")).sendKeys("sakthipugazhl@gmail.com");
	      
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sakthipugazhl@gmail.com");
	      
	    driver.findElement(By.id("password_step_input")).sendKeys("Savitha2@");
	      
	    driver.findElement(By.id("day")).sendKeys("02");
	      
	    driver.findElement(By.id("month")).sendKeys("Jun");

	    driver.findElement(By.id("year")).sendKeys("2001");
	      
	    driver.findElement(By.className("_8esa")).click();

	    driver.findElement(By.name("websubmit")).click();
	 
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}

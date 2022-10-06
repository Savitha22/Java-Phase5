import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		//set path of chrome web driver
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		//Instantiate webDriver with ChromeDriver Object
		WebDriver driver=new ChromeDriver();
		
	   //get() use to open a particular url
        driver.get("http://www.ebay.com/signin/"); //https://login.yahoo.com
        System.out.println("The title of the page is :" + driver.getTitle()); 
        WebElement element=  driver.findElement(By.id("userid"));
        System.out.println("Element Information"+element);
          
	}

}

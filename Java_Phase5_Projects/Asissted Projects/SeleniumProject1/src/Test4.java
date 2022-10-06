import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
                "D:\\chromedriver.exe");
        //Instantiate WebDriver with ChromeDriver Object
      WebDriver  driver = new ChromeDriver();
      //get() use to open a particular url
      driver.get("https://login.yahoo.com/account/create");
      WebElement searchIcon = driver.findElement(By.tagName("input"));
      System.out.println(searchIcon.getAttribute("id"));
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin Kumar\\chromedriver.exe");  
    	// declaration and instantiation of objects
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.javatpoint.com/selenium-webdriver-commands");
		
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
    	
    	By.id("bottomnext");
    	driver.findElement(By.className("next")).click();
		//driver.findElement(By.xpath("//a[1]")).click();
    	//driver.findElement(By.xpath("//a[1]")).click();
	}

}

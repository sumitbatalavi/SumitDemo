import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin Kumar\\chromedriver.exe"); 
		
		// declaration and instantiation of objects
    	WebDriver driver = new ChromeDriver();
    	
    	//Maximize current window
    	driver.manage().window().maximize();
    	
    	// Navigate to a website
    	driver.get("https://www.netmeds.com/");
    	

    	//Delay execution for 5 seconds to view the maximize operation
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
    	
    	//click action for move to sign in / sign up
		driver.findElement(By.className("logged")).click();
		
		
		driver.findElement(By.id("loginfirst_mobileno")).sendKeys("8220814959");
		driver.findElement(By.className("btn-signpass")).click();
		
		//Delay execution for 25 seconds to view the maximize operation
    	Thread.sleep(25000);
    	
    	driver.findElement(By.className("btn-login")).click();
		
    	
    	//Delay execution for 5 seconds to view the maximize operation
    	//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
    	
    	driver.quit();
	}

}

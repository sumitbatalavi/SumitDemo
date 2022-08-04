import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class First 
{  
  
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
    {  
        
    	// declaration and instantiation of objects/variables  
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin Kumar\\chromedriver.exe");  
    	WebDriver driver = new ChromeDriver();  
    	//Maximize current window
    	driver.manage().window().maximize();
    	
    	// Launch website  
    	driver.navigate().to("http://www.google.com/");  
    	// Click on the search text box and send value  
    	driver.findElement(By.name("q")).sendKeys("geeks and geeks");
    	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Delay execution for 25 seconds to view the maximize operation
    	Thread.sleep(5000);
    	// Click on the search button  
    	driver.findElement(By.className("gNO89b")).click();
    	driver.findElement(By.partialLinkText("geeksforgeeks")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("gcse-form")).click();
    	WebElement search ;
    	search = driver.findElement(By.id("gcse-search-input"));
    	search.sendKeys("selenium java");
    	search.sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	driver.findElement(By.partialLinkText("How to scroll down to bottom of page in")).click();
    	Thread.sleep(5000);
    	driver.quit();
      
    }  
  
}  
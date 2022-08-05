import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window {

@Test
public static void alt() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
	String parent=driver.getWindowHandle();
	
	driver.findElement(By.id("home")).click();
	 Set<String> handles= driver.getWindowHandles();
	
	for (String newWindow: handles) {
		driver.switchTo().window(newWindow);
		
	}
	Thread.sleep(3000);
	driver.close();
	//driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']")).click();
	//driver.findElement(By.id("email")).sendKeys("hello window");
	
	
	
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
	 int  windows=driver.getWindowHandles().size();
	 System.out.println("num of windows opened:"+windows);
	 
	 driver.findElement(By.id("color")).click();
	 System.out.println("no of windows opened 2nd time ="+driver.getWindowHandles().size());
	
	 Set<String>sis=driver.getWindowHandles();
	
	for (String sis1 : sis) {
		
		if(!sis1.equals(parent)) {
			driver.switchTo().window(sis1);
			driver.close();
		}
	}
	
	
	
Thread.sleep(2000);
driver.quit();
}
	
	
}

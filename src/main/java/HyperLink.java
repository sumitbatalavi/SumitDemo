import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HyperLink {

@Test	
	public static void hyper() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
	driver.findElement(By.xpath("//a[@href='../home.html']")).click();
	driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[@href='Button.html']"))).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button [@id='home']")).click();
	driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
	System.out.println("hello"+driver.findElement(By.xpath("//a[@href='error.html']")).isEnabled());
	Thread.sleep(2000);
	List<WebElement>AllLinks= driver.findElements(By.tagName("a"));
	System.out.println(AllLinks.size());
	driver.quit();
	}
}

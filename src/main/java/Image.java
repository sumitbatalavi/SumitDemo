import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Image {

	@Test
	public static void pic() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/Image.html']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='pages/Image.html']")).click();
		Thread.sleep(3000);
		System.out.println("am I Broken Image"+driver.findElement(By.xpath("//label[@for='position']")).isEnabled());
		Thread.sleep(3000);
	
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	
	
	
	
}

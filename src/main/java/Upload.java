import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload {

	
	@Test
	public static void down() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/upload.html']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/hp/Downloads/Xpath.pdf");
		Thread.sleep(3000);
        driver.quit();	
		
		
		
}}

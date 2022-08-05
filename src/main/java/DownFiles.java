import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownFiles {

	
	@Test
	public static void down() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/download.html']")).click();
		driver.findElement(By.xpath("//a[@href='C:\\testleaf.pdf']")).click();
		System.out.println("hello pdf");
		driver.quit();
		
}}

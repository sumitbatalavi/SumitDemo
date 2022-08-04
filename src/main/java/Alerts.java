import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {

	@Test
	public static void frame() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/Alert.html']")).click();
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Alert all= driver.switchTo().alert();
		all.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		all.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	    all.sendKeys("hello");
	    all.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		all.accept();
		Thread.sleep(5000);
		driver.quit();
		
	
}}

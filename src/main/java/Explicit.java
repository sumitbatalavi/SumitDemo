import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit {

@Test
public static void extra() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a[@href='pages/disapper.html']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	Boolean we = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn")));
	System.out.println(we);
	driver.quit();
	
}}

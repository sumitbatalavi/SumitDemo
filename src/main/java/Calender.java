import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

@Test
public static void mintu() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a[@href='pages/Calendar.html']")).click();
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[1]/a")).click();
	Thread.sleep(5000);
	driver.quit();
}}

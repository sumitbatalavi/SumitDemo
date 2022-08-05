import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {

	
	@Test	
	public static void mani() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a[@href='pages/radio.html']")).click();
	driver.findElement(By.id("yes")).click();
	String Text=driver.findElement(By.xpath("//input[@value='1'][@name='news']")).getAttribute("value");
	System.out.println(Text);
	Thread.sleep(2000);
	driver.quit();
}}

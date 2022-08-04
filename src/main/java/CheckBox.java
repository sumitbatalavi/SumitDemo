import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {

	@Test	
	public static void chotu() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a[@href='pages/checkbox.html']")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[1]/input[1]")).click();
	System.out.println(driver.findElement(By.xpath("//section[@class='innerblock']/div[2]/input")).isEnabled());
	driver.findElement(By.xpath("//section[@class='innerblock']/div[3]/input[2]")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/input[1]")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/input[2]")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/input[3]")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/input[4]")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/input[5]")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/input[6]")).click();
	Thread.sleep(5000);
	driver.quit();
}}

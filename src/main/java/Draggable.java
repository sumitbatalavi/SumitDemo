import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {

	@Test
	public static void pic() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/drag.html']")).click();	
		
Actions action = new Actions(driver);
action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("wrapper"))).perform();
Thread.sleep(3000);
	driver.quit();
}}

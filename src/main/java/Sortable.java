import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sortable {

	
	@Test
	public static void sort() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/sortable.html']")).click();	
		
		Actions action = new Actions(driver);
		List<WebElement>all=driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		WebElement sum=all.get(5); 
		WebElement sim= all.get(2);
		action.clickAndHold(sum).moveToElement(sim).release(sim).perform();
		Thread.sleep(3000);
		driver.quit();
}}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectable {

	
	@Test
	public static void select() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/selectable.html']")).click();	
		
		Actions action = new Actions(driver);
		action.clickAndHold();
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[1]")));
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[2]")));
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[3]")));
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[4]")));
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[5]")));
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[6]")));
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']/li[7]")));
		action.perform();
		
		Thread.sleep(3000);
		driver.quit();
}}

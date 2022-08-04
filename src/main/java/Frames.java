import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	
	@Test
	public static void frame() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/frame.html']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		System.out.println("num of frames="+driver.findElements(By.tagName("iframe")).size());
		Thread.sleep(5000);
		driver.quit();
}}

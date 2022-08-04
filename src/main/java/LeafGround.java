import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeafGround {

	
	@Test
	public static void edit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bkkkbhs@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("i am sixteen years old");
		String defaultText=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println(defaultText);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
	}
}

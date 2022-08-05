import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {

	
	@Test
	public static void fry() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/table.html']")).click();
		List<WebElement>hi=driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr[2]/td"));
		System.out.println(hi.size());
		List<WebElement>hello=driver.findElements(By.xpath("//table[@cellspacing='0']/tbody/tr"));
		System.out.println(hello.size());
		String Text=driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[3]/td[2]/font")).getText();
		System.out.println(Text);
		String gaya3=driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[4]/td[2]/font")).getText();
		System.out.println(gaya3);
		String janu=driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[5]/td[2]/font")).getText();
		System.out.println(janu);
		driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr[6]/td[3]/input")).click();
		Thread.sleep(3000);
		driver.quit(); 

		
		
		
}}

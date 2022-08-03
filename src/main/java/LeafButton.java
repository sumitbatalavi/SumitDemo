import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class LeafButton {

public static void Button() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//a [@href='pages/Button.html']")).click();
	driver.findElement(By.xpath("//button [@id='home']")).click();
	driver.findElement(By.xpath("//a [@href='pages/Button.html']")).click();
	Point location= driver.findElement(By.xpath("//button [@id='position']")).getLocation();
	System.out.println("this is for x" + location.getX());
	System.out.println("this is for y" + location.getY());
	System.out.println("color of the button"+driver.findElement(By.id("color")).getAttribute("style"));
	Thread.sleep(3000);
    org.openqa.selenium.Dimension size=driver.findElement(By.id("size")).getSize();

	System.out.println("height: "+size.height);

	
	System.out.println("width:"+size.width);

	
	driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();



	


	
	
	//driver.findElement(By.xpath("//button [@id='color']")).getCssValue("rgba");
}
	
	
}

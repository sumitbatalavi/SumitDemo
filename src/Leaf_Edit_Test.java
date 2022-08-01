import java.awt.Color;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaf_Edit_Test 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin Kumar\\chromedriver.exe"); 
		
		// declaration and instantiation of objects
    	WebDriver driver = new ChromeDriver();
    	
    	//Maximize current window
    	driver.manage().window().maximize();
    	
    	// Navigate to a website
    	driver.get("http://www.leafground.com/");
    	
    	//Delay execution for 5 seconds to view the maximize operation
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

    	driver.findElement(By.xpath("//h5[text()='Edit']//parent::a")).click();
 
    	driver.findElement(By.id("email")).sendKeys("premavathy1996@gmail.com");

    	//driver.findElement(By.className("large-6 small-12 columns")).sendKeys("Premavathy");
    	//((WebElement) driver).click();
    	//driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.ARROW_RIGHT);
    	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Aswin");
    	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
    	Thread.sleep(3000);
    	WebElement defTxt  = driver.findElement(By.name("username"));
    	String Def = defTxt.getAttribute("value");
    	System.out.println("Default Text                   : " + Def );
    	
    	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
    	boolean s = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']//following-sibling::input")).isEnabled();
    	System.out.println("Element is disabled or not: " + s );
    	
    	driver.navigate().back();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//h5[text()='Button']//parent::a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();

    	if(driver.getTitle().equals("TestLeaf - Selenium Playground")) {
    		System.out.println("Page title contains \"TestLeaf - Selenium Playground\" ");
    	}
    	else {
    		System.out.println("Page title doesn't contains \"TestLeaf - Selenium Playground\" ");
    	}
    	driver.navigate().back();
    	WebElement position = driver.findElement(By.id("position"));
    	Point point =  position.getLocation();
    	
    	System.out.println("X coordinates: " + point.getX() );
    	System.out.println("Y coordinates: " + point.getY() );
    	
    	WebElement color = driver.findElement(By.id("color"));
    	String button_color = color.getCssValue("color");
    	System.out.println("color of the button: " + button_color );
    	
    	WebElement size = driver.findElement(By.id("size"));
    	Dimension button_size = size.getSize();
    	System.out.println("size of the button: " + button_size );
    	driver.quit();

	}

}

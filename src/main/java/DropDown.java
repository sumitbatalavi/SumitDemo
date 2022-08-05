import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	
	@Test
	public void ListBoxes() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		Select drop = new Select(driver.findElement(By.id("dropdown1")));
        drop.selectByVisibleText("Loadrunner");
        Select drop1 = new Select(driver.findElement(By.name("dropdown2")));
        drop1.selectByIndex(2);
        Select drop2 = new Select(driver.findElement(By.id("dropdown3")));
        drop2.selectByValue("1");
        Select drop3 = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
        List <WebElement> op = drop3.getOptions();
        int size = op.size();
        for(int i=0; i<size;i++) {
        	String options = op.get(i).getText();
        	System.out.println(options);
        }
        driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Loadrunner");
        driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[6]/select")).sendKeys("UFT/QTP");
        
		Thread.sleep(5000);
		driver.quit();
		
	}

}

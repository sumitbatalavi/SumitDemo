import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoComplete {

	@Test
	public static void sort() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\apache-maven-3.8.6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/autoComplete.html']")).click();
		 driver.findElement(By.xpath("//input[@id ='tags' and @class='ui-autocomplete-input']")).sendKeys("a");
		List<WebElement> auto = driver.findElements(By.xpath("//*[@class='ui-menu-item']/div"));
		System.out.println("The size is = " + auto.size());

		for (WebElement a : auto) {
			Thread.sleep(3000);
			System.out.println("Values = " + a.getText());
			if (a.getText().equalsIgnoreCase("soap")) { 
				a.click();
				break;
			}
		}

		Thread.sleep(4000);
		driver.quit();

	}
}

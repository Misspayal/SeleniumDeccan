package Assertion;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Working_with_ReportClass {
	@Test
	public void main() {
		String expected_Url="https://demowebshop.tricentis.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Url=driver.getCurrentUrl();
		//assertEquals(expected_Url, actual_Url);
       assertNotEquals(expected_Url, actual_Url,"Url is not Matching");
       Reporter.log("I'm in dws homepage",true);
	WebElement search_field=driver.findElement(By.id("small-searchterms"));
	search_field.sendKeys("mobile",Keys.ENTER);
	WebElement as = driver.findElement(By.id("As"));
	as.click();
	assertTrue(as.isSelected(),"Element is not selected");
 
	driver.findElement(By.id("Isc")).click();
	driver.close();
	}
	

}

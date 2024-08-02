package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hard_Assert {
	@Test
	public void main() {
		String expected_Url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Url=driver.getCurrentUrl();
		//assertEquals(expected_Url, actual_Url);
	WebElement search_field=driver.findElement(By.id("small-searchterms"));
	search_field.sendKeys("mobile",Keys.ENTER);
	WebElement as = driver.findElement(By.id("As"));
	as.click();
	//assertTrue(as.isSelected());
	assertFalse(as.isSelected());
	driver.findElement(By.id("Isc")).click();
	System.out.println("TASK COMPLETED");
	}

}

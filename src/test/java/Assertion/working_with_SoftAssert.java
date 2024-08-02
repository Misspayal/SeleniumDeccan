package Assertion;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class working_with_SoftAssert {
	@Test
	public void softassert() {
		String expected_Url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Url=driver.getCurrentUrl();
		//assertEquals(expected_Url, actual_Url);
		SoftAssert soft=new SoftAssert();
		soft.assertNotEquals(expected_Url, actual_Url,"Url is not Matching");
	WebElement search_field=driver.findElement(By.id("small-searchterms"));
	search_field.sendKeys("mobile",Keys.ENTER);
	WebElement as = driver.findElement(By.id("As"));
	//as.click();
	soft.assertTrue(as.isSelected(),"Element is not selected");
	soft.assertAll();
	driver.findElement(By.id("Isc")).click();
	}
	

}

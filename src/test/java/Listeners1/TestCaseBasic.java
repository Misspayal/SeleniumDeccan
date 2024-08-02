package Listeners1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Base.DWSBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(Com.Crm.Listeners1.Basic.class)
public class TestCaseBasic extends DWSBaseClass {

		@Test
		public void main1() {
			String expected_Url="https://demowebshop.tricentis.com/";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			String actual_Url=driver.getCurrentUrl();
			AssertJUnit.assertEquals(expected_Url, actual_Url);
			Reporter.log("main1",true);
		}
	@Test
	public void main2() {
		String expected_Url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Url=driver.getCurrentUrl();
		AssertJUnit.assertEquals(expected_Url, actual_Url);
        Reporter.log("main2",true);
	}
	
}

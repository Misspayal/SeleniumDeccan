package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Com.Crm.Listeners1.ReportWithMultipleTestCases.class)

public class ExecuteWithListeners {
	@Test
	public void dominos() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://pizzaonline.dominos.co.in/");
		Reporter.log("my stomach is hungry",true);
		Thread.sleep(3000);
		
	}
	@Test(timeOut = 1000)
	public void rcb() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Reporter.log("rcb hungry for cup",true);
		Thread.sleep(3000);
	}
   @Test(dependsOnMethods = "rcb")
   public void csk() throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Reporter.log("when thala will retrie",true);
		Thread.sleep(2000);
   }
}

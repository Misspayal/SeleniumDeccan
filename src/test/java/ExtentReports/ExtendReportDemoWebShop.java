package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Pom.DigitalDownlod;
import Pom.Digital_Gift_card;
@Listeners(Com.Crm.Listeners1.ReportWithDemoWebShope.class)
      public class ExtendReportDemoWebShop  {
     @Test
     public void DigitalDownload() throws InterruptedException {
    	        WebDriver driver= new ChromeDriver();
    			driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    			driver.get("https://demowebshop.tricentis.com/");
    			DigitalDownlod ref=new DigitalDownlod(driver);
    			Thread.sleep(3000);
    			ref.dd();
    			ref.orderby();
    			ref.pagesize();
    			ref.view();
    			Reporter.log("Welecome to DigitalDownlode",true);
    			Thread.sleep(3000);
		
  }
     @Test
     public void GiftCard() throws InterruptedException {
    	 WebDriver driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 		driver.get("https://demowebshop.tricentis.com/");
 		Digital_Gift_card ref = new Digital_Gift_card(driver);
 		Thread.sleep(3000);
 		ref.GC();
 		ref.orderby();
 		ref.pagesize();
 		ref.view();
 		ref.product();
 		ref.RecipientName("Priya");
 		ref.SenderName("Rriya");
 		ref.Message("This gift from Riya");
 		ref.ATC();
 		Reporter.log("Gifts are Available for u",true);
		Thread.sleep(3000);
     }
     
  }

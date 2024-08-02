package ExtentReports;



import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseLoginReport;
import Pom.DigitalDownlod;
import Pom.Digital_Gift_card;

@Listeners(Com.Crm.Listeners1.LoginListeners.class)
public class FooterDws extends BaseLoginReport{
	
	String rss="https://demowebshop.tricentis.com/news/rss/1";
	@Test
	public void facebook() throws InterruptedException
	{
		preCondition();
		Actions act=new Actions(driver);
       	WebElement fbpage = driver.findElement(By.linkText("Facebook"));
		act.scrollToElement(fbpage);
		fbpage.click();

		String fburl="https://www.facebook.com/nopCommerce";
		Set<String> handles = driver.getWindowHandles();
		for (String s : handles) {
		driver.switchTo().window(s);	
		String currentUrl=driver.getCurrentUrl();		
		if (fburl.equals(currentUrl))
		{
		WebElement create_account = driver.findElement(By.xpath("//span[text()='Create new account']"));	
		create_account.click();	    
	    Set<String> childHandle= driver.getWindowHandles();			
	    for (String string : childHandle) {
		driver.switchTo().window(string);
		}	    
	    Thread.sleep(2000);    
	    driver.findElement(By.name("firstname")).sendKeys("pritu");
	    driver.findElement(By.name("lastname")).sendKeys("Shirke");
		driver.findElement(By.name("reg_email__")).sendKeys("priyushirke123@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Priti@123");
	    Thread.sleep(2000);
		WebElement bday_DropDown = driver.findElement(By.name("birthday_day"));
	    Select ref=new Select(bday_DropDown);
					ref.selectByVisibleText("24");
					WebElement birthMonth = driver.findElement(By.id("month"));
				     Select ref2=new Select(birthMonth);
				     ref2.selectByIndex(0);
				     WebElement birthYear = driver.findElement(By.id("year"));
				     Select ref3=new Select(birthYear);
				     ref3.selectByValue("2000");
				     Thread.sleep(2000);
				     driver.findElement(By.xpath("//label[text()='Female']")).click();
				}
			}
		Reporter.log("Successfully executed facebook testcase",true);
		postCondition();
	}
	@Test
	public void twitter() throws InterruptedException
	{
   	preCondition();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
       	WebElement fbpage = driver.findElement(By.linkText("Facebook"));
       	act.scrollToElement(fbpage);
       	driver.findElement(By.linkText("Twitter")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String web : handles) {
        	driver.switchTo().window(web);
        	Thread.sleep(2000);        	
        }
        Reporter.log("Taking time to load twiiter",true);
      //  driver.findElement(By.xpath("//span[text()='Log in']")).click();
		postCondition();
	}
	@Test
	public void digitalDownload() throws InterruptedException
	{
		DigitalDownlod ref =new DigitalDownlod(driver);
		ref.dd();
		ref.orderby();
		ref.pagesize();
		ref.view();
	
		
//		driver.findElement(By.className("ico-cart")).click();
//		
//		WebElement product = driver.findElement(By.xpath("//tr[@class='cart-item-row']"));

		postCondition();
	}
	@Test
	public void rssLink() throws InterruptedException
	{	
		preCondition();
		Actions act=new Actions(driver);
       	WebElement facebookpage = driver.findElement(By.linkText("Facebook"));
       	act.scrollToElement(facebookpage);
       	List<WebElement> footer = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
       	for (WebElement web : footer) {
			web.click();
			if(driver.getCurrentUrl().equals(rss))
			{
				driver.navigate().back();
			}
		}
       	Reporter.log("Failed rssLink testcase",true);
       	postCondition();
	}
	@Test
	public void gifts() throws InterruptedException
	{
		preCondition();
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
		
//		ref.getRecipient_name("Demo");
//		ref.getSender_name("Nirmitee");
//		ref.getMessage("Thankyou");
//		ref.getQtd("5");
//		Thread.sleep(3000);
//		ref.getAddButton();
//		Thread.sleep(4000);
//		ref.getGoTocart();
//		Thread.sleep(3000);
//		ref.getProduct();
		postCondition();
		Reporter.log("gifts has delivered",true);
	}
		
	}

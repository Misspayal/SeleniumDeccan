package PageObjectModel;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Digital_Gift_card;

public class Digital_Gift_card_main {

		@Test
		public void login() throws InterruptedException {
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

	}
	}



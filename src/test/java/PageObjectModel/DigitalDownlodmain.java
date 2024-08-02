package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DigitalDownlod;

public class DigitalDownlodmain {
		@Test
		public void login() throws InterruptedException {
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

	}
	}


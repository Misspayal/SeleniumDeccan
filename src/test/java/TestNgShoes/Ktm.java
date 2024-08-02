package TestNgShoes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ktm {
	@Test(groups = "regression")

 public void ktm() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/ktm-bikes/duke/");
		Thread.sleep(3000);
		driver.quit();
	}
 }


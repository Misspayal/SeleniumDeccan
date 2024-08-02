package TestNgShoes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activa {
	@Test(groups = "regression")

	public void activa() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	}



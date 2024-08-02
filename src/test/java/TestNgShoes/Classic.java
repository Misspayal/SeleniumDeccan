package TestNgShoes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Classic {
	@Test(groups = "regression")

	public void Classic() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bikedekho.com/royal-enfield/");
	Thread.sleep(3000);
	
	driver.quit();
}

}

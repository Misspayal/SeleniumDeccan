package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DwsRegistration;


public class DwsRegistration_main {
	@Test
	public void main() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DwsRegistration ref=new DwsRegistration(driver);
		ref.registration();
		ref.gender();
		ref.firstname("Priya");
		ref.lastname("Riya");
		ref.email("admin01@gmail.com");
		ref.password("admin01");
	    ref.confirmpassword("admin01");
	    ref.register();
	}

}

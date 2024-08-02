package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.DwsRegistration;
import Pom.Task1_RegistrationDWS;

public class Task1_RegDwsMain {
	@Test
	public void main() {
		String expected_Url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url, actual_Url);
		Task1_RegistrationDWS ref=new Task1_RegistrationDWS(driver);
		ref.registration();
		ref.gender();
		ref.firstname("Priya");
		ref.lastname("Riya");
		ref.email("admin01@gmail.com");
		ref.password("admin01");
	    ref.confirmpassword("admin01");
	    ref.register();
	    driver.quit();
	}

}

package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Dwslogin;



public class Loginfunction {
	@Test
	public void Login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Dwslogin ref=new Dwslogin(driver);
	ref.login_link();
	ref.username("admin01@gmail.com");
	ref.password("admin01");
	ref.remeberMe();
	ref.login_button();
	


}
}
package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom.Dwslogin;
import Pom.Task2_logindws;

public class Task2_LoginDwsMain {
	@DataProvider(name="TestData")
	public Object[][]  testdata() {
		Object[][] data=new Object[1][3];
		data[0][0]="https://demowebshop.tricentis.com/";
		data[0][1]="admin01@gmail.com";
		data[0][2]="admin01";
		return data;
	}

	@Test(dataProvider="TestData")
	public void demo(String url,String username,String password) throws InterruptedException {
		String expected_Url="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get(url);
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url, actual_Url);
		Task2_logindws ref=new Task2_logindws(driver);
		ref.login_link();
		//driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("pass")).sendKeys(password);
		//driver.findElement(By.name("login")).click();
		ref.remeberMe();
		ref.login_button();
		
		Thread.sleep(5000);
		driver.quit();
	}

}

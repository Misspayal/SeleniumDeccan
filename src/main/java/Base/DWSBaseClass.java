package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DWSBaseClass {
		public static WebDriver driver;
		public static void precondition(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				driver= new FirefoxDriver();
			}else {
				driver= new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
		}
		public static void login() throws InterruptedException {
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("hatturevaibhav199@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Hatture@123");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		}
		public static void postcondition() {
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
			System.out.println("TASK COMPLETED");
			driver.quit();
			
		}
	}



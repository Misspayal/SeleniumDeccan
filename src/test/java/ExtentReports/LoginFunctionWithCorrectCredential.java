package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunctionWithCorrectCredential {
	@Test
	public void CorrectCrendential() throws InterruptedException {
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/loginfunctions.html");
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Priyu");
		spark.config().setTheme(Theme.DARK);
		ExtentReports report=new ExtentReports();
		report.setSystemInfo("OS", "Window-10");
		report.setSystemInfo("Browser", "Chrome-100");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("CorrectCredential");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Saipallavi1233@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pallavi@13");
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement community_poll=driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if (community_poll.isDisplayed()) {
			test.log(Status.INFO, "Community poll is displayed");
			
			
		}
		else {
			test.log(Status.INFO, "Community poll is not displayed");
			
		}
		report.flush();
		
		
		
		
	}

}

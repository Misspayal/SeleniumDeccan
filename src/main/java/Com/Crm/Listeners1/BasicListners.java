package Com.Crm.Listeners1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Base.BaseClassDws;

public class BasicListners extends BaseClassDws implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("onTestStart", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("onTestSuccess", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		//LocalDateTime Date= LocalDateTime.now();
		//String time=Date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from =ts.getScreenshotAs(OutputType.FILE);
		File to =new File("./ScreenShot/DWSPage.png");
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped", true);
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("onStart", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("onFinish", true);
	}
	
 
}

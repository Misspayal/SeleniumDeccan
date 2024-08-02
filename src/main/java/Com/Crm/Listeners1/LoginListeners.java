package Com.Crm.Listeners1;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginListeners implements ITestListener {
	
	
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String t_Name = result.getMethod().getMethodName();
		Reporter.log(t_Name+" is executed");
		test=report.createTest(t_Name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_Name = result.getMethod().getMethodName();
		test.log(Status.PASS,t_Name+" is PASS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String t_Name = result.getMethod().getMethodName();
		test.log(Status.FAIL,t_Name+" is FAIL");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_Name = result.getMethod().getMethodName();
		test.log(Status.SKIP,t_Name+" is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
	    spark = new ExtentSparkReporter("./extentReports/Task.html");
		spark.config().setDocumentTitle("Multiple Testcase");
		spark.config().setReportName("Nirmitee");
		spark.config().setTheme(Theme.DARK);
		
		
	    report = new ExtentReports();
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
	    //test = report.createTest("sampleReport");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}

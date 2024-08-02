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

public class ReportWithDemoWebShope implements ITestListener{
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		Reporter.log(t_name+"is executed");
		test=report.createTest(t_name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
	    test.log(Status.PASS, t_name+"is successs");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		spark=new ExtentSparkReporter("./Reports/DemoWeb.html");
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Priyu");
		spark.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		report.setSystemInfo("OS", "Window-10");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	
	}
	

}

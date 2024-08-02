package Listeners1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import Base.BaseClassDws;
@Listeners(Com.Crm.Listeners1.Basic.class)
public class TestcasebasicListner extends BaseClassDws{
	@Test 
	public void main1() {
		String excepted_result="https://demowebshop.tricentis.com/";
		String actual_result=driver.getCurrentUrl();
		AssertJUnit.assertEquals(excepted_result, actual_result);
		
	}
   @Test 
   public void main() {
		String excepted_result="https://demowebshop.tricentis.com";
		String actual_result=driver.getCurrentUrl();
		AssertJUnit.assertEquals(excepted_result, actual_result);
		
	}
}

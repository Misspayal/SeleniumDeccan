package HomeWork;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Crm.Listeners1.BaseClassForRegister;
import Pom.Register;
import Utility.ExcelUtility;

@Listeners(Com.Crm.Listeners1.BasicListners.class)
	public class Task1 extends BaseClassForRegister{

		ExcelUtility eUtil = new ExcelUtility();
		@Test
		public void register() throws EncryptedDocumentException, IOException
		{
			int row = 0;
			assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.co/");
			
			Register reg = new Register(driver);
			reg.register();
			reg.genderM();
			reg.firstName(eUtil.getData("DWS_R", row++, 0));
			reg.lastName(eUtil.getData("DWS_R", row++, 0));
			reg.email(eUtil.getData("DWS_R", row++, 0));
			reg.pass(eUtil.getData("DWS_R", row++, 0));
			reg.confirmPassword(eUtil.getData("DWS_R", row++, 0));
			reg.registerBtn();
			
		}
	}



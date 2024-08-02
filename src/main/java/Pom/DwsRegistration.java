package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegistration  {
	public DwsRegistration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	  }
	private @FindBy(className ="ico-register")
	WebElement registration_link;
	private @FindBy(xpath="//input[@value='F']")
	WebElement gender;
	private @FindBy(id="FirstName")
	WebElement firstname;
	private@FindBy(id="LastName")
	WebElement lastname;
	private @FindBy(name="Email")
	WebElement email;
	private @FindBy(id="Password")
	WebElement password;
	private @FindBy(name="ConfirmPassword")
	WebElement confirmpassword;
	private@FindBy(id="register-button")
	WebElement registration_button;
	public void registration() {
		registration_link.click();
	}
	public void gender() {
		gender.click();
	}
	public void firstname(String First) {
		firstname.sendKeys(First);
		}
	public void lastname(String last) {
		lastname.sendKeys(last);
		
	}
	public void email(String emailname) {
		email.sendKeys(emailname);
		
	}
	public void password(String pass) {
	 password.sendKeys(pass);
	 
	}
	public void confirmpassword(String confirm) {
		confirmpassword.sendKeys(confirm);
	}
	public void register() {
		registration_button.click();
	}
	}
	
	
	
	



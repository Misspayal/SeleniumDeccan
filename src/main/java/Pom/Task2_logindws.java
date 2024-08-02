package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2_logindws {
	  
		public Task2_logindws(WebDriver driver) {
		PageFactory.initElements(driver, this);
		  
		  
	  }
	 private@FindBy(className="ico-login")//by using getter method we hide or data and make it as a private
	  WebElement login_link;
	  
	  private@FindBy(id="Email")
	  WebElement usernmae;
	  
	  private@FindBy(name="Password")
	  WebElement password;
	  private@FindBy(name="RememberMe")
	  WebElement remeberMe;
	 private @FindBy(xpath="//input[@value='Log in']")
	  WebElement login_button;
	 public void login_link() {
		 login_link.click();
	 }
	 public void username(String user) {
		 usernmae.sendKeys(user);
	 }
	 public void password(String pass) {
		 password.sendKeys(pass);
	 }
	 public void remeberMe() {
		 remeberMe.click();
	 
	 }
	 public void login_button() {
		 login_button.click();
	 }

}

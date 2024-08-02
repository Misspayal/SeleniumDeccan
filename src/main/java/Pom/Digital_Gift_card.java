package Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Digital_Gift_card {
	
		public Digital_Gift_card(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

			private @FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
			WebElement GC;
			
			private @FindBy(id = "products-orderby")
			WebElement orderby;
			
			private@FindBy(id = "products-pagesize")
			WebElement pagesize;
			
			private@FindBy(id="products-viewmode")
			WebElement view;
			
			private @FindBy(xpath = "(//input[@value='Add to cart'])[2]") 
				WebElement product;
			
			private @FindBy(id = "giftcard_3_RecipientName")
				WebElement RecipientName;
			
			private@FindBy(name = "giftcard_3.SenderName")
				WebElement Sendername;
			
			private@FindBy(id = "giftcard_3_Message")
				WebElement Message;
			
			private@FindBy(xpath = "//input[@id='add-to-cart-button-3']")
				WebElement ATC;
			
			public void GC() {
				GC.click();
			}
			public void orderby() {
				orderby.click();
				Select s = new Select(orderby);
				s.selectByVisibleText("Price: High to Low");
			}
			public void pagesize() {
				pagesize.click();
				Select s1 = new Select(pagesize);
				s1.selectByIndex(2);
				
			}
			public void view() {
				view.click();
				Select s2=new Select(view);
				s2.selectByIndex(0);
			}
			
			public void product() {
				product.click();
			}
			
			public void RecipientName(String rname) {
				RecipientName.sendKeys(rname);
			}
			public void SenderName(String sname) {
				Sendername.sendKeys(sname);
			}
			public void Message(String msg) {
				Message.sendKeys(msg);
			}
			public void ATC() {
				ATC.click();
			}
			

	}



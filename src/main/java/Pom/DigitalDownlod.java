package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownlod {



		public DigitalDownlod(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

		private @FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
		WebElement dd;
		
		private @FindBy(id = "products-orderby")
		WebElement orderby;
		
		private@FindBy(id = "products-pagesize")
		WebElement pagesize;
		
		private@FindBy(id="products-viewmode")
		WebElement view;
		
		public void dd() {
			dd.click();
		}
		public void orderby() {
			orderby.click();
			Select s = new Select(orderby);
			s.selectByVisibleText("Price: Low to High");
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
		
		
	}



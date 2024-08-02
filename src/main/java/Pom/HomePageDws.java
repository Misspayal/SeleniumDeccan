package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDws {
		
			public HomePageDws(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			private @FindBy(xpath = "//div[@class='header']/div/a/img")
			WebElement title;
					
			private @FindBy(className = "ico-register")
			WebElement register_link;
					
			private @FindBy(className = "ico-login")
			WebElement login_link;
					
			private @FindBy(className = "cart-label")
			WebElement cart_icon;
					
			private @FindBy(className = "ico-wishlist")
			WebElement wishlist;
					
			private @FindBy(id="small-searchterms")
			WebElement SearchBar;
					
			private @FindBy(xpath = "//input[@class='button-1 search-box-button']")
			WebElement SearchBtn;
					
			private @FindBy(xpath = "//a[contains(text(),'Books')]")
			WebElement books;
			
			private @FindBy(xpath = "//a[contains(text(),'Computers')]")
			WebElement computers;
			
			private @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
			WebElement electronics;
			
			private @FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
			WebElement Apparel;
					
			private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
			WebElement Digitaldownloads;
			
			private @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
			WebElement Jewelry;
			
			private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
			WebElement GiftCard;
			
			private @FindBy(name = "NewsletterEmail")
			WebElement newsLetterEmail;
					
			private @FindBy(id = "newsletter-subscribe-button")
			WebElement SubscribeButton;
					
			private @FindBy(id="pollanswers-1")
			WebElement ExcellentPoll;
					
			private @FindBy(id="pollanswers-2")
			WebElement GoodPoll;
			
			private @FindBy(id="pollanswers-3")
			WebElement PoorPoll;
					
			private @FindBy(id="pollanswers-1")
			WebElement VerybadPoll;
					
			public void title()
			{
				title.click();
			}
			public void register()
			{
				register_link.click();
			}
			public void login()
			{
				login_link.click();
			}
			public void cart()
			{
				cart_icon.click();
			}
			public void wishlist()
			{
				wishlist.click();
			}
			public void search()
			{
				SearchBar.click();
			}
			public void searchBtn()
			{
				SearchBtn.click();
			}
			public void books()
			{
				books.click();
			}
			public void computers()
			{
				computers.click();
			}
			public void electronics()
			{
				electronics.click();
			}
			public void apparel()
			{
				Apparel.click();
			}
			public void digitalDownloads()
			{
				Digitaldownloads.click();
			}
			public void jewelry()
			{
				Jewelry.click();
			}
			public void giftCard()
			{
				GiftCard.click(); 
			}
			public void newsLetterEmail()
			{
				newsLetterEmail.click();
			}
			public void subscribe()
			{
				SubscribeButton.click();
			}
			public void pollanswer1()
			{
				ExcellentPoll.click();
			}
			public void pollanswer2()
			{
				GoodPoll.click();
			}
			public void pollanswer3()
			{
				PoorPoll.click();
			}
			public void pollanswer4()
			{
				VerybadPoll.click();
			}
		}







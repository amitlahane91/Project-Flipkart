package POMflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	@FindBy (xpath="//div[text()='Top Offers']")
	private WebElement topoffers;
	
	@FindBy (xpath="//div[text()='Mobiles & Tablets']")
	private WebElement mobileandtablets;
	
	@FindBy (xpath="//div[text()='Electronics']")
	private WebElement electronics;
	
	@FindBy (xpath="//div[text()='Fashion']")
	private WebElement fashion;
	
	@FindBy (xpath="//div[text()='Travel']")
	private WebElement travel;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicktopoffers() {
		topoffers.click();
		
		
	}
	public void clickmobiles() {
		mobileandtablets.click();
	}
	public void clickelectronics() {
		electronics.click();
	}
	public void clickfashion() {
		fashion.click();
	}
	public void clicktravel() {
		travel.click();
	}
	
	

}

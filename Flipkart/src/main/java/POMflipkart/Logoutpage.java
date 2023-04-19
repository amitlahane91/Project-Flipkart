package POMflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	
	@FindBy (xpath="//div[contains(text(),'amit')]")
	private WebElement profile;
	
	@FindBy (xpath="//div[text()='Logout']")
	private WebElement logout;
	
	public Logoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void movetoprofile(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
	}
	public void clicklogout() {
		logout.click();
	}
	
	

}

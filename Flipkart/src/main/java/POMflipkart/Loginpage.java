package POMflipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy (xpath="//a[normalize-space()='Login']")
	private WebElement login;
	
	@FindBy (xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobile;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement submit;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin() {
		login.click();
	}
	public void entermobile() {
		mobile.sendKeys("9730343325");
	}
	public void enterpassword() {
		password.sendKeys("amitA@49484");
	}
	public void clicksubmit() {
		submit.click();
	}

}

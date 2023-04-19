package TestFlipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Utility;

import POMflipkart.Homepage;
import POMflipkart.Loginpage;
import POMflipkart.Logoutpage;
import setup.Base;

public class TestHomepage extends Base {
	WebDriver driver;
	Loginpage log;
	Homepage home;
	Logoutpage out;
	int Testid;
	
	@Parameters ("browser")
	@BeforeTest
	public void openbrowser(String browserName) {
		System.out.println(browserName);
	    
		if(browserName.equals("Chrome")) {
			driver = openchromebrowser();
		}
		if(browserName.equals("Firefox")) {
			driver = openFirefoxbrowser();
		}
		driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	@BeforeClass
	public void createobject() {
		log = new Loginpage(driver);
		home = new Homepage(driver);
		out = new Logoutpage(driver);
	}
	@BeforeMethod
	public void login() {
		System.out.println("Before method");
		
		//log.clicklogin();
		log.entermobile();
		log.enterpassword();
		log.clicksubmit();
		
	}
	@Test  (priority=2)
	public void testtopoffers() throws InterruptedException {
		Testid=002;
		Thread.sleep(2000);
		home.clicktopoffers();
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, true);
		//System.out.println("top offers test case pass");
		
	}
	@Test  (priority=1)
	public void testmobileandtablet() {
		Testid=001;
		home.clickmobiles();
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test  (priority=3)
	public void testelectronics() {
		Testid=003;
		home.clickelectronics();
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test  (priority=4)
	public void testfashion() {
		Testid=004;
		home.clickfashion();
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test  (priority=5)
	public void testtravel() {
		Testid=005;
		home.clicktravel();
		String title = driver.getTitle();
		System.out.println(title);
	}
	@AfterMethod
	public void logout(ITestResult result) {
		System.out.println("After Method");
		if(ITestResult.FAILURE == result.getStatus()) {
			
			
		}
		out.movetoprofile(driver);
		out.clicklogout();
	}
	@AfterClass
	public void clearobject() {
		log=null;
		home=null;
		out=null;
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
	

}

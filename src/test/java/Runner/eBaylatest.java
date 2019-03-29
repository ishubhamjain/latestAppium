package test.java.Runner;
/**
 * @author Shubham Jain
 * */

import java.net.URL;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pageobjects.HomeScreen;
import pageobjects.ProductListingScreen;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.time.Duration;

public class eBaylatest {

	AndroidDriver driver;
	Dimension size;
	static HomeScreen home = null;
	static ProductListingScreen pls = null;


	@Test
	public void setup() throws Exception {
/*
		// Capabilities should be same as declared in Appium settings
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "TestSample");
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability(CapabilityType.VERSION, "6.0");
		capabilities.setCapability(CapabilityType.PLATFORM, "Windows");

		capabilities.setCapability("app", "F:\\Research\\appium\\workspace\\latestAppiumProgram\\MakeMyTrip_com.makemytrip.apk");
		// application package name
		capabilities.setCapability("app-package", "com.mmt.travel.app");

		// Application start Activity
		capabilities.setCapability("app-activity", "com.mmt.travel.app.home.ui.SplashActivity");

		capabilities.setCapability("unicodeKeyboard", false);

		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);*/
	try {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("app", "F:\\Research\\appium\\workspace\\latestAppiumProgram\\YOU_Broadband_com.you.andriod.myapp_28_2.1.4_.apk");

		capabilities.setCapability("deviceName", "TestSample");
		
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
		
		capabilities.setCapability(CapabilityType.PLATFORM, "Windows");
		
/*		capabilities.setCapability("app-package", "com.mmt.travel");
		
		capabilities.setCapability("app-activity", "com.mmt.travel.app.home.ui.SplashActivity");*/
		
		capabilities.setCapability("autoGrantPermissions",true);
		
		capabilities.setCapability("appPackage", "com.you.andriod.myapp");
		
		capabilities.setCapability("appActivity", "com.you.ram.myapp.CustomerHomepageActivity");
		
		capabilities.setCapability("unicodeKeyboard", false);
		
		capabilities.setCapability("clearSystemFiles", true);
		
		System.out.println("before object");
	//	System.setProperty("webdriver.http.factory", "apache");
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		System.out.println("driver created");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		home = new HomeScreen(driver);
		pls = new ProductListingScreen(driver);
		System.out.println("function done");
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
		ex.printStackTrace();
	}
	}
	

	   @Test
		private void stepA() throws Exception {
	try {
		System.out.println("why");
		System.out.println(driver.getContext());
	//	System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		
//		String login="//android.widget.ImageView[contains(@resource-id,'login')]";
		String login="//android.widget.ImageView[@index='3']";
		By by= By.xpath(login);
		
		//FluWait(driver, by);
		
		driver.findElementByXPath(login).click();
	//	driver.findElementBy
	//	WebElement ele = driver.findElementByXPath("//android.widget.ImageView[@text='By logging in, you agree to YBIL Terms & Conditions.']");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER)); 
		String loginlink="//android.widget.ImageView[@index='1']";
	//	String loginlink="//android.widget.ImageView[contains(.,'By logging in')]";
        By by1= By.xpath(loginlink);
		
		//FluWait(driver, by1);
		
		WebElement ele = driver.findElementByXPath(loginlink);
	//	TapOptions
		//TouchAction touch = new TouchAction(driver);
		new TouchAction(driver).tap(tapOptions().withElement(element(ele)))
		.waitAction(waitOptions(Duration.ofMillis(250))).perform();
		System.out.println("not");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('These terms and conditions is governed by the substantive and procedural laws of India.'))");

		//new TouchAction(driver).
		//Touch
	//	new AndroidTouchAction(driver).
	//	new IOSTouchAction(driver).
		TouchActions action = new TouchActions(driver); 
		action.scroll(ele, 10, 100); 
		action.perform();
		
	/*	TouchAction action2 = new TouchAction(driver);
		action2.longPress(PointOption.point(256, 1115)).WaitOptions.waitOptions(3000).moveTo(ele).perform().release();*/
		
		new TouchAction(driver)
	    .press(PointOption.point(256, 1115))
	    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	    .perform()
	    .moveTo(PointOption.point(256, 600))
	    .release()
	    .perform();
		
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
		ex.printStackTrace();
	}
	   }
	/*
	//@Test(priority = 2)
	private void stepB() throws Exception {
	

	}

	
	@Test(priority = 3)
	private void utilityStepC() throws Exception {
		
		
		
	}
		
	@Test(priority = 4)
	private void stepD() throws Exception {
				
		
				
	}
	
	@Test(priority = 5)
	private void stepE() throws Exception {

		
	}
	
	@Test(priority = 6)
	private void stepF() throws Exception {
		
		
	}*/
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	public void scrollToBottom() {

		size = driver.manage().window().getSize();

		int startx = (int) (size.width * 0.50);

		int starty = (int) (size.height * 0.80);

		int endy = (int) (size.height * 0.40);

		System.out.println("startx = "+startx+"starty = "+starty+"startx = "+startx+"endy = "+endy);
		try {
			
			//driver.swipe(startx, starty, startx, endy, 1000);
		} catch (Exception e) {

		}
	}
	
	WebElement FluWait(AppiumDriver driver, By elementIdentifier){
		 Wait<AppiumDriver> wait =
	                new FluentWait<AppiumDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
	                                                 .pollingEvery(1, TimeUnit.SECONDS)
	                                                 .ignoring(NoSuchElementException.class);

	        return wait.until(new Function<AppiumDriver, WebElement>()
	                {
	                    public WebElement apply(AppiumDriver driver) {
	                           return driver.findElement(elementIdentifier);
	                    }
	                });
	}
}

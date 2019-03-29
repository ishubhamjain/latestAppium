package pageobjects;
/**
 * @author Shubham Jain
 *
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ProductListingScreen {
	AndroidDriver driver=null;
	private WebElement element = null;
	private By By = null;
	
    public ProductListingScreen(AndroidDriver driver)
    {
    	this.driver=driver;
    }

    public ProductListingScreen() {

	}
    
	public By By_button_sortButton() throws Exception {
		try {
			By = By.id("com.ebay.mobile:id/button_sort");

		} catch (Exception e) {

			throw (e);
		}
		return By;
	}
	
	public WebElement button_sortButton() throws Exception {
		try {
			element = driver.findElement(By_button_sortButton());

		} catch (Exception e) {

			throw (e);
		}
		return element;
	}
	
	
	public By By_Menu_optionLowToHigh() throws Exception {
		try {
			By =  By.xpath("//android.widget.CheckedTextView[contains(@resource-id,'button_filter_subelement') and @text='Lowest Price + Postage']");

		} catch (Exception e) {

			throw (e);
		}
		return By;
	}
	
	public WebElement Menu_optionLowToHigh() throws Exception {
		try {
			element = driver.findElement(By_Menu_optionLowToHigh());

		} catch (Exception e) {

			throw (e);
		}
		return element;
	}
	
	public By By_listing_prices() throws Exception {
		try {
			By = By.id("com.ebay.mobile:id/textview_item_price");

		} catch (Exception e) {

			throw (e);
		}
		return By;
	}
	
	public List<WebElement> listing_prices() throws Exception {
		try {
			List<WebElement> allLinks =  driver.findElements(By_listing_prices());
			return allLinks;
		} catch (Exception e) {

			throw (e);
		}
	}
	
	public List<WebElement> listing_names() throws Exception {
		try {
			List<WebElement> allLinks =  driver.findElements(By.id("com.ebay.mobile:id/textview_item_title"));
			return allLinks;
		} catch (Exception e) {

			throw (e);
		}
	}
	
	public By By_button_Watch() throws Exception {
		try {
			By = By.id("com.ebay.mobile:id/button_watch");

		} catch (Exception e) {

			throw (e);
		}
		return By;
	}
	
	public WebElement button_Watch() throws Exception {
		try {
			element = driver.findElement(By_button_Watch());

		} catch (Exception e) {

			throw (e);
		}
		return element;
	}
	
	public By By_Username() throws Exception {
		try {
			By = By.xpath("//android.widget.EditText[@text='Email or username']");

		} catch (Exception e) {

			throw (e);
		}
		return By;
	}
	
	public WebElement Username() throws Exception {
		try {
			element = driver.findElement(By_Username());

		} catch (Exception e) {

			throw (e);
		}
		return element;
	}
	
	public WebElement closebutton() throws Exception {
		try {
			element = driver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'button_close')]"));

		} catch (Exception e) {

			throw (e);
		}
		return element;
	}

}

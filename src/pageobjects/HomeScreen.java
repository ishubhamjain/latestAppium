package pageobjects;
/**
 * @author Shubham Jain
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreen 
{
	AndroidDriver driver=null;
	private WebElement element = null;
	private By By = null;
	
    public HomeScreen(AndroidDriver driver)
    {
    	this.driver=driver;
    }

    public HomeScreen() {

	}
    
    
	public By By_textbox_searchTextField() throws Exception {
		try {
			By = By.xpath("//android.widget.TextView[contains(@resource-id,'search_box')]");

		} catch (Exception e) {

			throw (e);
		}
		return By;
	}
    
	public WebElement textbox_searchTextField() throws Exception {
		try {
			element = driver.findElement(By_textbox_searchTextField());

		} catch (Exception e) {

			throw (e);
		}
		return element;
	}
		
}

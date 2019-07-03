import java.net.MalformedURLException;
import java.util.HashMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends Practice {

	public static void main(String[] args) throws MalformedURLException{

		IOSDriver<IOSElement>driver = capabilities();
		
		
		
		driver.findElementByAccessibilityId("newUser").click();
		driver.findElementByAccessibilityId("usernameTextField").click();
		driver.findElementByAccessibilityId("usernameTextField").sendKeys("kn.coords");
		driver.findElementByAccessibilityId("usernameTextField").sendKeys(Keys.RETURN);
		driver.findElementByAccessibilityId("passwordTextField").click();
		driver.findElementByAccessibilityId("passwordTextField").sendKeys("qazwsx");
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("loginButton").click();
		driver.findElementByAccessibilityId("Mis Clases").click();
		//driver.findElementByAccessibilityId("buttonScreen").click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
		
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    HashMap<String, Double> swipeObject = new HashMap<String, Double>();
	        swipeObject.put("startX", 539.1);
	        swipeObject.put("startY", 350.0);
	        swipeObject.put("endX", 930.1);
	        swipeObject.put("endY", 92.6);
	        swipeObject.put("duration", 1.0);
	        js.executeScript("mobile: swipe", swipeObject);
	        
	        */
	        
	}
}
	       
		
		/*
		driver.findElementByAccessibilityId("Panorama").click();
		driver.findElementByAccessibilityId("Lesson Plan").click();
		driver.findElementByAccessibilityId("Configuration").click();
		driver.findElementByAccessibilityId("Import planning").click();
		driver.findElementByAccessibilityId("Cancel").click();
		driver.findElementByAccessibilityId("Back").click();
		driver.findElementByAccessibilityId("menu").click();
		driver.findElementByAccessibilityId("myClassProgress").click();
		
		*/
		//driver.findElementByAccessibilityId("Achievement").click();
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
 
        IOSElement element = driver.findElementByAccessibilityId("Perez Sanchez Juan");
        element.click();*/
        

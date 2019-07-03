import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class KosmosAlumnoPrimaria extends CapabilitiesSets {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{

		IOSDriver<IOSElement>driver = capabilities();
		
		driver.findElementByAccessibilityId("newUser").click();
		driver.findElementByAccessibilityId("usernameTextField").click();
		driver.findElementByAccessibilityId("usernameTextField").sendKeys("kn.alu1p2a");
		driver.findElementByAccessibilityId("usernameTextField").sendKeys(Keys.RETURN);
		driver.findElementByAccessibilityId("passwordTextField").click();
		driver.findElementByAccessibilityId("passwordTextField").sendKeys("1234");
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
        
		driver.findElementByAccessibilityId("activityButton6").click();
		driver.findElementByAccessibilityId("step2").click();
		scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        driver.findElementByAccessibilityId("recurso0").click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Stop").click();
        driver.findElementByAccessibilityId("recurso1").click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Stop").click();
        driver.findElementByAccessibilityId("closeBtn").click();
        
	        
	}
}
	       
		
		

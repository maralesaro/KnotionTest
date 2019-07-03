import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class CapabilitiesSets {
	private static IOSDriver<IOSElement>driver;

	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException{
		 
		 
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "iOS");
	    desiredCapabilities.setCapability("automationName", "XCUITest");
	    desiredCapabilities.setCapability("deviceName", "iPad (6th generation)");
	    desiredCapabilities.setCapability("app", "//Users//mariosandoval//Library//Developer//Xcode//DerivedData//KnotioniOS-alkpdxomwgkgofddhvckuwdbqula//Build//Products//Debug (Production)-iphonesimulator//KnotioniOS.app");
	    
	    desiredCapabilities.setCapability("udid", "0F241F3B-6E8E-44D8-BE2A-50E2AC9937A1");
	    desiredCapabilities.setCapability("platformVersion", "12.2");
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    desiredCapabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,true);
	    //driver.isAppInstalled("Knotion");
	    driver = new IOSDriver<IOSElement>(remoteUrl, desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   

	    return driver;
		
	}
	/*
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
	}
	
	public static void swipeVertical(IOSDriver <IOSElement> driver, double porcentaje, double startPorcentaje, double finalPorcentaje, int duration) throws  {
		Dimension size = driver.manage().window().getSize();
		int width = (int) (size.width/2);
		int startPoint = (int) (size.getHeight() * startPorcentaje);
		int finalPoint = (int) (size.getHeight() * finalPorcentaje);
		driver
     	
     }
     */

}

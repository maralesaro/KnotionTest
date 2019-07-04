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
	    
	    driver = new IOSDriver<IOSElement>(remoteUrl, desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   

	    return driver;
		
	}
}

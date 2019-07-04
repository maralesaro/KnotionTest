import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class KosmosAlumnoPrimaria extends CapabilitiesSets {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{

		IOSDriver<IOSElement>driver = capabilities();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
		
		driver.findElementByAccessibilityId("newUser").click();
		driver.findElementByAccessibilityId("usernameTextField").click();
		driver.findElementByAccessibilityId("usernameTextField").sendKeys("kn.alu1p2a");
		driver.findElementByAccessibilityId("usernameTextField").sendKeys(Keys.RETURN);
		driver.findElementByAccessibilityId("passwordTextField").click();
		driver.findElementByAccessibilityId("passwordTextField").sendKeys("1234");
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("loginButton").click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("Mis Clases").click();Thread.sleep(2000);
		driver.findElementByAccessibilityId("buttonHome off").click(); //Ir a portada del reto
		driver.findElementByAccessibilityId("videoEngBtnDYK").click();
		Thread.sleep(10000);//Reproducir video de portada de reto
		driver.findElementByAccessibilityId("closeBtn").click(); //Cerrar video
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("refresh").click(); //Refresh en portada de reto
		driver.findElementByAccessibilityId("buttonScreen").click(); //Seleccionar clase
		scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        driver.findElementByAccessibilityId("refresh").click(); //refresh en la sesión
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
		driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
		driver.findElementByAccessibilityId("challenge1").click(); //Cambiar reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
		driver.findElementByAccessibilityId("challenge2").click(); //Cambiar reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
		driver.findElementByAccessibilityId("challenge3").click(); //Cambiar reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("buttonScreen").click(); //Seleccionar clase
		driver.findElementByAccessibilityId("btnClases1").click(); //Seleccionar clase
		driver.findElementByAccessibilityId("buttonScreen").click(); //Seleccionar clase
		driver.findElementByAccessibilityId("btnClases2").click(); //Seleccionar clase

		
		
		
		
		
        
        
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
	       
		
		

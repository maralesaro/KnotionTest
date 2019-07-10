import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;

public class KosmosAlumnoPrimaria extends CapabilitiesSets {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{

		IOSDriver<IOSElement>driver = capabilities();
		TouchAction touchAction = new TouchAction(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
		int centro = 505;
		int videoPortadaY = 633;
		int SeleccionarClase = 43;
		int clase1 = 107;
		int clase2 = 145;
		int clase3 = 183;
		int clase4 = 221;
		int clase5 = 259;
		int clase6 = 297;
		int clase7 = 335;
		int clase8 = 373;
		int seleccionarSesion = 755;
		int aceptarX = 600;
		int aceptarY = 475;
		int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;
		
		/*
		driver.findElementByAccessibilityId("newUser").click();
		driver.findElementByAccessibilityId("usernameTextField").click();
		driver.findElementByAccessibilityId("usernameTextField").sendKeys("kn.alu1p2a");
		driver.findElementByAccessibilityId("usernameTextField").sendKeys(Keys.RETURN);
		driver.findElementByAccessibilityId("passwordTextField").click();
		driver.findElementByAccessibilityId("passwordTextField").sendKeys("1234");
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("loginButton").click();
		Thread.sleep(2000);
		*/
		
		driver.findElementByAccessibilityId("Mis Clases").click();
		Thread.sleep(2000);
		
		driver.findElementByAccessibilityId("buttonHome off").click(); //Ir a portada del reto
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, videoPortadaY)).perform();
		Thread.sleep(15000);//Reproducir video de portada de reto 
		driver.findElementByAccessibilityId("closeBtn").click(); //Cerrar video
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("refresh").click(); //Refresh en portada de reto
		Thread.sleep(2000);
		scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        driver.findElementByAccessibilityId("buttonScreen").click(); //Seleccionar clase
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("buttonScreen").click(); //Seleccionar clase
		Thread.sleep(2000);
        driver.findElementByAccessibilityId("refresh").click(); //refresh en la sesión
        Thread.sleep(2000);
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
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, SeleccionarClase)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, clase2)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, SeleccionarClase)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, clase3)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, SeleccionarClase)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, clase4)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, SeleccionarClase)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, clase5)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, SeleccionarClase)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, clase1)).perform();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("navSesiones").click();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, 400)).perform();
		Thread.sleep(2000);
		
		driver.findElementByAccessibilityId("dashboardKinder").click(); 
		Thread.sleep(2000);
		scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        touchAction.tap(PointOption.point(510, 740)).perform(); //Ir a kosmos del dashboard
        Thread.sleep(2000);
        
        driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
        Thread.sleep(2000);
        
		driver.findElementByAccessibilityId("challenge1").click(); //Cambiar reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
		driver.findElementByAccessibilityId("challenge2").click(); //Cambiar reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
		driver.findElementByAccessibilityId("challenge5").click(); //Cambiar reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("dashboardKinder").click(); //Dashboard de reto
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("refresh").click();
		Thread.sleep(2000);
		scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
		Thread.sleep(2000);
		scrollObject.put("direction", "right");
        js.executeScript("mobile: swipe", scrollObject);
        Thread.sleep(2000);
		scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
		Thread.sleep(2000);
		scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
		Thread.sleep(2000);
		scrollObject.put("direction", "right");
        js.executeScript("mobile: swipe", scrollObject);
        Thread.sleep(2000);
		scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(510, 740)).perform();
		Thread.sleep(2000);
		scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
		driver.findElementByAccessibilityId("activityButton6").click();
        Thread.sleep(5000);
		driver.findElementByAccessibilityId("step1").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("step2").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("step3").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("step4").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("step2").click();
		scrollObject.put("direction", "up");
        Thread.sleep(2000);
        js.executeScript("mobile: swipe", scrollObject);
        driver.findElementByAccessibilityId("recurso0").click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Stop").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("recurso1").click();
        Thread.sleep(2000);
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("Stop").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("refresh").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("closeBtn").click();
        scrollObject.put("direction", "right");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "right");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "right");
        js.executeScript("mobile: swipe", scrollObject);
        scrollObject.put("direction", "right");
        js.executeScript("mobile: swipe", scrollObject);
        
		driver.findElementByAccessibilityId("activityButton0").click();
        Thread.sleep(5000);
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
		driver.findElementByAccessibilityId("step4").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("btnDone").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("btnDone").click(); //Dar done a una actividad
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("step0").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("btnFavorites").click(); //Dar fav
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("btnFavorites").click(); //Dar fav
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("closeBtn").click(); //Cerrar activityDetail
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, SeleccionarClase)).perform();
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(centro, clase2)).perform();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("buttonHome off").click(); //Ir a portada del reto
		Thread.sleep(2000);	
		driver.findElementByAccessibilityId("1").click();      
		Thread.sleep(2000);
        scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
		scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
        driver.findElementByAccessibilityId("activityButton8").click();
        Thread.sleep(5000);
        driver.findElementByAccessibilityId("step3").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("rubrica").click();
        Thread.sleep(2000);
        touchAction.tap(PointOption.point(990, 20)).perform();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("step3").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("refresh").click();
        Thread.sleep(2000);
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("Entregables").click();
        Thread.sleep(2000);
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        Thread.sleep(4000);
        
        try {
        	driver.findElementByAccessibilityId("upload").click();
        	Thread.sleep(2000);
        	driver.findElementByAccessibilityId("Carrete").click(); 
        	Thread.sleep(2000);
        	touchAction.tap(PointOption.point(250, 225)).perform();
            Thread.sleep(4000);
            touchAction.tap(PointOption.point(220, 220)).perform();
            Thread.sleep(6000);
            driver.findElementByAccessibilityId("Aceptar").click();
            Thread.sleep(15000);
            driver.findElementByAccessibilityId("refresh").click();

        }catch(Exception ex) {
        	driver.findElementByAccessibilityId("btnBorrartacherecurso").click();
        	touchAction.tap(PointOption.point(aceptarX, aceptarY)).perform();
        	Thread.sleep(4000);
        	scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            driver.findElementByAccessibilityId("Entregables").click();
            Thread.sleep(4000);
            driver.findElementByAccessibilityId("upload").click();
        	Thread.sleep(2000);
        	driver.findElementByAccessibilityId("Carrete").click(); 
        	Thread.sleep(2000);
        	touchAction.tap(PointOption.point(250, 225)).perform();
            Thread.sleep(4000);
            touchAction.tap(PointOption.point(220, 220)).perform();
            Thread.sleep(6000);
            driver.findElementByAccessibilityId("Aceptar").click();
            Thread.sleep(15000);
            driver.findElementByAccessibilityId("refresh").click();
        }
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("Entregables").click();
    	Thread.sleep(2000);
        scrollObject.put("direction", "up");
        js.executeScript("mobile: swipe", scrollObject);
        driver.findElementByAccessibilityId("recurso_generico").click();
        Thread.sleep(5000);
        touchAction.tap(PointOption.point(990, 20)).perform();
        Thread.sleep(10000);
        driver.findElementByAccessibilityId("closeBtn").click();
        Thread.sleep(2000);
        
		driver.findElementByAccessibilityId("recursosAdicionales").click();		Thread.sleep(2000);
		driver.findElementByAccessibilityId("Class KB").click();				Thread.sleep(2000);
		driver.findElementByAccessibilityId("Mi Knotion Bank").click();			Thread.sleep(2000);
		driver.findElementByAccessibilityId("Favoritos").click();				Thread.sleep(2000);
		driver.findElementByAccessibilityId("Recursos Adicionales").click();	Thread.sleep(2000);
		driver.findElementByAccessibilityId("recursoCajon0").click();			Thread.sleep(5000);
		scrollObject.put("direction", "down");
        js.executeScript("mobile: swipe", scrollObject);	
        Thread.sleep(3000);
        driver.findElementByAccessibilityId("Stop").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("recursosAdicionales").click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("sesionActual on").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("btnSearchBlue").click();
        Thread.sleep(2000);
       	try {
       		driver.findElementByAccessibilityId("Search").sendKeys("Learn");
       		Thread.sleep(2000);
           	touchAction.tap(PointOption.point(970, 550)).perform();
           	Thread.sleep(2000);
           	touchAction.tap(PointOption.point(700, 190)).perform();
           	Thread.sleep(2000);
           	driver.findElementByAccessibilityId("See More").click();
           	Thread.sleep(2000);
           	driver.findElementByAccessibilityId("actividad0").click();
           	Thread.sleep(2000);
            driver.findElementByAccessibilityId("actividad0").click();
            Thread.sleep(2000);
            scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            driver.findElementByAccessibilityId("Go to activity").click(); //btnCerrarModal
            Thread.sleep(2000);
            driver.findElementByAccessibilityId("step1").click();
    		Thread.sleep(2000);
    		driver.findElementByAccessibilityId("step2").click();
    		Thread.sleep(2000);
    		scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            Thread.sleep(2000);
    		driver.findElementByAccessibilityId("recurso0").click();
            Thread.sleep(2000);
            scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            driver.findElementByAccessibilityId("Stop").click();
            Thread.sleep(2000);
            driver.findElementByAccessibilityId("recurso1").click();
            Thread.sleep(2000);
            scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            driver.findElementByAccessibilityId("Stop").click();
            Thread.sleep(2000);
            driver.findElementByAccessibilityId("recurso2").click();
            Thread.sleep(2000);
            scrollObject.put("direction", "up");
            js.executeScript("mobile: swipe", scrollObject);
            Thread.sleep(2000);
            driver.findElementByAccessibilityId("Stop").click();
            Thread.sleep(2000);
    		driver.findElementByAccessibilityId("step3").click();
            Thread.sleep(2000);
		} catch (Exception e) {
			driver.findElementByAccessibilityId("Buscar").sendKeys("Aprender");
			Thread.sleep(2000);
	       	touchAction.tap(PointOption.point(970, 550)).perform();
	       	Thread.sleep(2000);
	       	touchAction.tap(PointOption.point(700, 190)).perform();
	       	Thread.sleep(2000);
	       	driver.findElementByAccessibilityId("Ver más").click();
	       	Thread.sleep(2000);
	       	driver.findElementByAccessibilityId("actividad0").click();
	       	Thread.sleep(2000);
	        driver.findElementByAccessibilityId("actividad0").click();
	        Thread.sleep(2000);
	        scrollObject.put("direction", "up");
	        js.executeScript("mobile: swipe", scrollObject);
	        scrollObject.put("direction", "up");
	        js.executeScript("mobile: swipe", scrollObject);
	        driver.findElementByAccessibilityId("Ir a la actividad").click(); //btnCerrarModal
	        Thread.sleep(2000);
	        driver.findElementByAccessibilityId("step1").click();
			Thread.sleep(2000);
			driver.findElementByAccessibilityId("step2").click();
			Thread.sleep(2000);
			scrollObject.put("direction", "up");
	        js.executeScript("mobile: swipe", scrollObject);
	        Thread.sleep(2000);
			driver.findElementByAccessibilityId("recurso0").click();
	        Thread.sleep(4000);
	        scrollObject.put("direction", "down");
	        js.executeScript("mobile: swipe", scrollObject);
	        Thread.sleep(2000);
	        driver.findElementByAccessibilityId("Stop").click();
	        Thread.sleep(2000);
		}
     
		driver.findElementByAccessibilityId("closeBtn").click(); 
		Thread.sleep(2000);
		touchAction.tap(PointOption.point(700, 190)).perform();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("btnCerrarModal").click();
      /*
		driver.findElementByAccessibilityId("3").click();Thread.sleep(5000);
        driver.findElementByAccessibilityId("icTecnicas").click();
        Thread.sleep(5000);
        Map<String, Object> args1 = new HashMap<>();
        args1.put("name", "emocion1");
        args1.put("name", "inicioClase");
        driver.executeScript("mobile: scroll", args1);
        */
        
		/*
         * List<IOSElement> list=driver.findElementsByAccessibilityId("cambioRetoCollectionView");
		
		
		for(int i=0;i<list.size();i++) {
			IOSElement item=list.get(i);
			if(i==3) {
				item.click();
				//item.findElementByAccessibilityId("btnsave").click();
			}
		}
        */
		
		
	        
	}
}
	       
		
		

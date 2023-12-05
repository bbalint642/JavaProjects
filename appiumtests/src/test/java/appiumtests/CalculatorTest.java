package appiumtests;

import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;

public class CalculatorTest {

	//static WebDriver driver;
	//static AppiumDriver<MobileElement> driver;
    //WebElement driver;
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	try {
    		openCalculator();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
    	

    }
    
    public static void openCalculator() throws Exception {
        
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "SM-A515F/DSN");
        cap.setCapability("udid", "R58N12ZNPAR");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        
        cap.setCapability("appPackage", "com.telenor.mytelenor");
        cap.setCapability("appActivity", "com.telenor.mytelenor.genesys.MainActivity");
        
        /*
		cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        */
        
        //URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        //RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        
        System.out.println("App elindult...");
        
        //driver = new RemoteWebDriver(url, cap);
        
        //AppiumDriver alma;
        // Initialize the Appium Driver
        //AppiumDriver<WebElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        //driver = new WebElement
        //dirver = new AppiumDriver<MobileElement>(cap);
        //driver = new AppiumDriver(url, cap);
        
    }
}

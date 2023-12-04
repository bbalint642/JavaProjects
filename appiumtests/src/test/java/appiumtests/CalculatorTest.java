package appiumtests;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;

public class CalculatorTest {

	static WebDriver driver;
	//static AppiumDriver<WebElement> driver;
     
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
    
    public static void openCalculator() throws Exception {
        
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "SM-A515F/DSN");
        cap.setCapability("udid", "R58N12ZNPAR");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, cap);

    }
}

package awsdemo;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DeviceCap {

	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;
	
	@BeforeClass
	public void setUp() throws Exception {
	System.out.println("Opening app...");
	//SetProperty();		
	
	
	DesiredCapabilities caps= new DesiredCapabilities();
	
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	//System.out.println(prop.getProperty("AUTOMATION_NAME"));
//	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
//	//System.out.println(prop.getProperty("Apk"));
//	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//	//System.out.println(prop.getProperty("Apk"));
//	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
	//caps.setCapability(MobileCapabilityType.APP,"C://Users//LENOVO//eclipse-workspace//awsdemo//spentra.apk");
	//System.out.println(prop.getProperty("Apk"));
	caps.setCapability("appPackage", "com.spentra");
	caps.setCapability("appActivity", "com.spentra.activities.start.SplashScreenActivity");
	caps.setCapability("noReset", true);
	caps.setCapability("autoGrantPermissions", true);

	driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
//	public static String SetProperty(String key) throws Exception {
////		FileInputStream fis = new FileInputStream(
////				System.getProperty("user.dir") + "/src/test/resources/config.properties");
//////		FileInputStream fis = new FileInputStream("\\src\\test\\resources\\config.properties");
////		prop = new Properties();
////		prop.load(fis);
//
//		  Properties properties = new Properties();
//	        try {
//	            InputStream inputStream = new FileInputStream("/config.properties");
//	            properties.load(inputStream);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	        return properties.getProperty(key);
//	    }
	
	@AfterClass
    public void afterTest(){

    //quit the driver
    driver.quit();
    }
	
}

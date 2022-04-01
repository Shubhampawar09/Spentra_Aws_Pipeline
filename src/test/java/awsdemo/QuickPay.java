package awsdemo;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class QuickPay extends DeviceCap {

	    
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(MobileBy.id("com.spentra:id/tv_skip")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.spentra:id/loginBtn")).click();
		Thread.sleep(1000);		
		driver.findElement(MobileBy.id("com.spentra:id/usernameEdit")).sendKeys("3010203010");
		
		driver.findElement(MobileBy.id("com.spentra:id/passwordEdit")).sendKeys("Ganart12");
		
		driver.findElement(MobileBy.id("com.spentra:id/loginBtn")).click();
		
		driver.findElement(MobileBy.id("com.spentra:id/btn1")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.spentra:id/btn2")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.spentra:id/btn3")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.spentra:id/btn4")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.spentra:id/loginBtn")).click();
	}
	
}

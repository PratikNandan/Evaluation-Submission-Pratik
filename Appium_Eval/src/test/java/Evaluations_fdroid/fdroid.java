package Evaluations_fdroid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Evaluation_fdroid.fdroid_capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class fdroid extends fdroid_capabilities{
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void bt() throws MalformedURLException {
		driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test1() {
		//driver.activateApp("org.fdroid.fdroid");
		//driver.findElement(MobileBy.id("org.fdroid.fdroid:id/navigation_bar_item_large_label_view")).click();
		//Settings
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Settings\")")).click();
		
		// notification, power saver on/off
		driver.openNotifications();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Repositories\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OFF\")")).click();
		//navigation key
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
		// switch ,copy and pasting on console
		driver.activateApp("com.google.android.apps.messaging");
		
		String out = driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Why so serious\")")).getText();
		
		System.out.println(out);
		
		//Switch
		
		driver.activateApp("org.fdroid.fdroid");
		
		//scroll
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Expert mode\"))").click();


		
		
		
		

		
		

		


		
		

		
		

		
	}

}

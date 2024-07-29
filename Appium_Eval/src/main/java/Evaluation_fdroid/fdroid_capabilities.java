package Evaluation_fdroid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class fdroid_capabilities {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {        //desired capabilities 
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My_Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.fdroid.fdroid");

		//io.appium.android.apis.ApiDemos - API Demos
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.fdroid.fdroid.views.main.MainActivity");

		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;
		
		
	}
	


}

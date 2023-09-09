package apptesting.appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) {

		URL appiumServerUrl;
		try {
			appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub"); // Update with your Appium server URL
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		// Set desired capabilities for the virtual device and app
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 Pro API 27"); // Replace with your
																									// device name
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\HP\\Downloads\\APKFiles-1\\resources\\ApiDemos-debug.apk"); // Replace with the path to your
																						// APK file

		// Initialize the Appium driver
		AppiumDriver driver = new AndroidDriver(appiumServerUrl, desiredCapabilities);

		// Perform actions on the app
		// For example, you can interact with elements using driver.findElement() and
		// perform actions like clicking, sending keys, etc.

		// Close the app and quit the driver
		driver.close();
		driver.quit();
	}
}

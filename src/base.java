import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import server.AppiumServer;


public class base extends AppiumServer{
	
	public void StartServer() {
		AppiumServer appiumServer = new AppiumServer();
		appiumServer.startServer();
	}
	
	public void StopServer() {
		AppiumServer appiumServer = new AppiumServer();
		appiumServer.stopServer();
	}

	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		File f = new File("src");
		File fs = new File(f, "app-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Motorola Moto G (5) Plus (Android 8.1.0, API 27)");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
				

	}

}

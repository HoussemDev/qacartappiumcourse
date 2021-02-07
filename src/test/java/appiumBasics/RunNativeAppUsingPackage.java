package appiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import java.net.MalformedURLException;
import java.net.URL;

public class RunNativeAppUsingPackage {


    @Test
    public void openAppInDevice() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Houssem");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }

}

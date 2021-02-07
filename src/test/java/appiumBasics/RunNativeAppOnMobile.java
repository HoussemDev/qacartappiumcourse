package appiumBasics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class RunNativeAppOnMobile {

    File app = new File("App/QAcart-To-Do.apk");
    @Test
    public void openAppInDevice() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Houssem");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }



}

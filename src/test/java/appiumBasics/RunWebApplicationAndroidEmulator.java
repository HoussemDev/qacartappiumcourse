package appiumBasics;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunWebApplicationAndroidEmulator {

    @Test
    public void OpenWebApplication() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Houssem");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//        WebDriverManager.chromedriver().setup();
        caps.setCapability("chromedriverExecutable","/home/houssem/Documents/chromedriver");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("mednine");

    }
}

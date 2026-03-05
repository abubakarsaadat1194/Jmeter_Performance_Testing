package performance_testing_app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class WebTesting {
	private static WebDriver localDriver;
	
	
	public static WebDriver getDriver() {
		return localDriver;
	}
	
    public static WebDriver launchDriver(String siteUrl, String browser) {

        quitDriver();

        if (browser.equalsIgnoreCase("chrome")) {

            // Automatically downloads and configures ChromeDriver
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setAcceptInsecureCerts(true);

            localDriver = new ChromeDriver(options);

            // Fix ChromeDriver visible tab issue
            List<String> tabs = new ArrayList<>(localDriver.getWindowHandles());
            if (tabs.size() > 1) {
                localDriver.switchTo().window(tabs.get(1));
            }

        } 
        else if (browser.equalsIgnoreCase("firefox")) {

            // Automatically downloads and configures GeckoDriver
            WebDriverManager.firefoxdriver().setup();

            FirefoxOptions options = new FirefoxOptions();
            options.setAcceptInsecureCerts(true);

            localDriver = new FirefoxDriver(options);
        } 
        else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        localDriver.manage().window().maximize();
        localDriver.get(siteUrl);

        return localDriver;
    }


	
	public static void quitDriver() {
		if (localDriver != null) {
			localDriver.quit();
			localDriver = null;
		}
	}
}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }

        if(browser.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }

        return null;
    }
}
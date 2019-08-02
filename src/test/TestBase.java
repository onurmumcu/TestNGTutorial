package test;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class TestBase {
	WebDriver driver = null;

	
	public void login() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Onur\\Desktop\\TestNGTutorial\\datadriven.properties");
		prop.load(fis);

		if (prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (prop.getProperty("browser").contains("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.get(prop.getProperty("url"));

	}

}

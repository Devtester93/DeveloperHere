package ReusablePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {

	public static WebDriver driver;
	protected Properties prop;
	protected FileInputStream file;
	private static WebDriverWait jsWait;
	private static JavascriptExecutor jsExec;
	public boolean angularReady;

	public static void helper_Chrome(String url) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
	}

	public static void helper_Firefox(String url) {
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
	}

	public String property_Value(String proper_Name) throws IOException {
		prop = new Properties();
		file = new FileInputStream("Object.properties");
		prop.load(file);
		return prop.getProperty(proper_Name);
	}
	 public static void setDriver (WebDriver driver) {

	        jsWait = new WebDriverWait(driver, 10);
	        jsExec = (JavascriptExecutor) driver;
	    }
	protected boolean angularLoads(String angularReadyScript) {
        try {
            angularReady = Boolean.valueOf(jsExec.executeScript(angularReadyScript).toString());
        } catch (WebDriverException ignored) {
        }
        return angularReady;
}
}

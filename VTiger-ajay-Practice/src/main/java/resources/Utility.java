package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	// All Variables
	static String propertyfilepath = System.getProperty("user.dir") + "/src/main/java/resources/property.properties";
	static FileInputStream fis;
	static Properties p;
	public static WebDriver driver;

//----------------------------------------------------------------------------------------------------------------------------------
	// Read Property File Path
	public static String GetPropertyValue(String PropertyKey) throws IOException {
		// TODO Auto-generated method stub
		fis = new FileInputStream(propertyfilepath);
		Properties p = new Properties();
		p.load(fis);

		return p.getProperty(PropertyKey);
	}

	// ----------------------------------------------------------------------------------------------------------------------------------

	// Launch the browser mentioned in property file
	public static void OpenBrowser() throws IOException {

		String BrowserName = GetPropertyValue("browser").toLowerCase();

		switch (BrowserName) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			driver = new FirefoxDriver();
			break;
		}

		case "edge": {
			driver = new EdgeDriver();
			break;
		}
		}
	}

	// ----------------------------------------------------------------------------------------------------------------------------------

	public static void getUrl(String url) {
		driver.get(url);
	}

//-----------------------------------------------------------------------------------
	// Enter Input into Element
	public void enterInputintoElement(String input, WebElement element) {

		element.sendKeys(input);
	}

	// -----------------------------------------------------------------------------------
	// click on Element
	public void ClickonElement(WebElement element) {

		element.click();
	}

	// -----------------------------------------------------------------------------------
	// Element Displayed
	public void ElementDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Required Elemnt is not present in the page");
		}
	}

	public void clearText(WebElement element) {
		element.clear();
	}

	public Alert switchToAlert() {
		Alert al = driver.switchTo().alert();
		return al;
	}

//**************************************************************************************************************************************************************	
	// Select DROPDOWN option by value
	public void SelectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

}

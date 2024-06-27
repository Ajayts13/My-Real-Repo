package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Utility;

public class Login_Page extends Utility {

	static By userName=By.xpath("//input[@name='user_name']");
	static	By pwd=By.xpath("//input[@name='user_password']");
	static By submit=By.xpath("//input[@id='submitButton']");
    
    
    
	public static WebElement getUserName() {
		WebElement UserName = driver.findElement(userName);
		return UserName;
	}
	
	public static WebElement getPwd() {
		WebElement Password = driver.findElement(pwd);
		return Password;
	}
	
	public static WebElement getSubmit() {
		WebElement Submit = driver.findElement(submit);
		return Submit;
	}
	
	
    
    
    
    
    
    
	
}

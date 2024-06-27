package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Utility;

public class Leads_Page extends Utility {

	By leadsTitle = By.xpath("//td[@class=\"moduleName\"]/a[text()='Leads']");
	By Addlead = By.xpath("//img[@title='Create Lead...']");
	By createNewLeadeTitle = By.xpath("//span[text()='Creating New Lead']");
	By savebtn = By.xpath("//input[@value=\"  Save  \"]");
	By streetarea = By.xpath("//textarea[@name='lane']");

	// Dynamic Elements

	public WebElement LeadEdit(String user) {
		WebElement ele = driver
				.findElement(By.xpath("//a[text()='"+user+"']/../following-sibling::td/a[text()='edit']"));
		return ele;
	}
	
	public WebElement Del_Lead(String user) {
		WebElement ele = driver
				.findElement(By.xpath("//a[text()='"+user+"']/../following-sibling::td/a[text()='del']"));
		return ele;
	}

//*************************************************************************************************************************************************8	
	public WebElement getLeadsTitle() {
		WebElement leadTitle = driver.findElement(leadsTitle);
		return leadTitle;
	}

	public WebElement getAddlead() {
		WebElement addlead = driver.findElement(Addlead);
		return addlead;
	}

	public WebElement getCreateNewLeadeTitle() {
		WebElement newLeadTitle = driver.findElement(createNewLeadeTitle);
		return newLeadTitle;
	}

	public WebElement getLeadInfo(String link) {
		By leadInfo = By.name(link);
		WebElement l_infor = driver.findElement(leadInfo);
		return l_infor;
	}

	public WebElement save() {
		WebElement save = driver.findElement(savebtn);
		return save;
	}

	public WebElement streetarea() {
		WebElement street = driver.findElement(streetarea);
		return street;
	}

	public WebElement leadMail(String text) {
		By leadMail = By.linkText(text);
		WebElement Leadmail = driver.findElement(leadMail);
		return Leadmail;
	}

}

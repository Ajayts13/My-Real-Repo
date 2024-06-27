package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Utility;

public class Home_Page extends Utility {
//***************************************************************************************************************************
	public String linkText;

	// Locaters
	By logoimg = By.xpath("//img[@title='vtiger-crm-logo.gif']");
	By lead = By.xpath("//a[text()='Leads']");
	By leadsTitle = By.xpath("//td[@class=\"moduleName\"]/a[text()='Leads']");
	By Addlead = By.xpath("//img[@title='Create Lead...']");
	By createNewLeadeTitle = By.xpath("//span[text()='Creating New Lead']");
	By savebtn = By.xpath("//input[@value=\"  Save  \"]");
	By streetarea = By.xpath("//textarea[@name='lane']");
	

	public WebElement getLogo() {
		WebElement logo = driver.findElement(logoimg);
		return logo;
	}

//	public String getLinkText() {
//		WebElement logo = driver.findElement(logoimg);
//		return logo;
//	}

	public WebElement getLeads() {
		WebElement leads = driver.findElement(lead);
		return leads;
	}

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

}

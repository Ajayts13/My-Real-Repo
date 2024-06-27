package leads_Module;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectRepo.Home_Page;
import pageObjectRepo.Leads_Page;
import pageObjectRepo.Login_Page;
import resources.Utility;

public class CreateLead extends Utility {

	@BeforeMethod
	public void launch() throws IOException {
		Utility.OpenBrowser();
		driver.manage().window().maximize();
		getUrl("http://localhost:8888");
	}

	@AfterMethod
	public void TeadDown() {
		driver.close();
	}
	
	

	Home_Page hp = new Home_Page();
	Leads_Page lp = new Leads_Page();

	 @Test(priority = 1)
	public void createUser() throws InterruptedException {

		ElementDisplayed(Login_Page.getUserName());
		enterInputintoElement("admin", Login_Page.getUserName());
		enterInputintoElement("manager", Login_Page.getPwd());
		ClickonElement(Login_Page.getSubmit());
		ElementDisplayed(hp.getLogo());
		ClickonElement(hp.getLeads());
		ElementDisplayed(hp.getLeadsTitle());
		ClickonElement(hp.getAddlead());
		ElementDisplayed(hp.getCreateNewLeadeTitle());
		enterInputintoElement("Rohan", hp.getLeadInfo("firstname"));
		enterInputintoElement("TS", hp.getLeadInfo("lastname"));
		enterInputintoElement("Test", hp.getLeadInfo("designation"));
		enterInputintoElement("Testing", hp.getLeadInfo("company"));
		enterInputintoElement("10", hp.getLeadInfo("noofemployees"));
		enterInputintoElement("1000", hp.getLeadInfo("annualrevenue"));
		enterInputintoElement("9876543210", hp.getLeadInfo("phone"));

		enterInputintoElement("rohan@gmail.com", hp.getLeadInfo("email"));

		SelectValue(hp.getLeadInfo("leadstatus"), "Cold");

		enterInputintoElement("kengeri bangalore", hp.streetarea());
		enterInputintoElement("560060", hp.getLeadInfo("code"));
		enterInputintoElement("India", hp.getLeadInfo("country"));
		enterInputintoElement("Bangalore", hp.getLeadInfo("city"));
		enterInputintoElement("karnataka", hp.getLeadInfo("state"));

		ClickonElement(hp.save());
		Thread.sleep(3000);

		ClickonElement(hp.getLeads());
		ElementDisplayed(lp.LeadEdit("Rohan"));

	}

	 @Test(priority = 2)
	public void editLead() throws InterruptedException {

		ElementDisplayed(Login_Page.getUserName());
		enterInputintoElement("admin", Login_Page.getUserName());
		enterInputintoElement("manager", Login_Page.getPwd());
		ClickonElement(Login_Page.getSubmit());
		ElementDisplayed(hp.getLogo());
		ClickonElement(hp.getLeads());
		ElementDisplayed(lp.getLeadsTitle());
		ClickonElement(lp.LeadEdit("Rohan"));
		clearText(hp.getLeadInfo("firstname"));
		enterInputintoElement("Rohan137", hp.getLeadInfo("firstname"));
		ClickonElement(hp.save());
		Thread.sleep(3000);

		ClickonElement(hp.getLeads());
		ElementDisplayed(lp.LeadEdit("Rohan137"));
	}

	@Test(priority = 3)
	public void deleteLead() throws InterruptedException {

		ElementDisplayed(Login_Page.getUserName());
		enterInputintoElement("admin", Login_Page.getUserName());
		enterInputintoElement("manager", Login_Page.getPwd());
		ClickonElement(Login_Page.getSubmit());
		ElementDisplayed(hp.getLogo());
		ClickonElement(hp.getLeads());
		ElementDisplayed(lp.getLeadsTitle());
		ClickonElement(lp.Del_Lead("Rohan137"));

		Alert al = driver.switchTo().alert();
		al.accept();

	}

}

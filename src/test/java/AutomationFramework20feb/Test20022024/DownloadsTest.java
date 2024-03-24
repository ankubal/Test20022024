package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.Downloads;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomatuin.TestBase.TestBase;

public class DownloadsTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	
	Downloads downloads;
	

	@BeforeMethod
	public void launchBrowser() { 
		intialisation();
		page = new AccountLoginPage();
	}


	@Test()
	public void validatedownloads() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		downloads = myAccountPage.clickItems("Downloads");
		
		
	
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}









package AutomationFramework20feb.Test20022024;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AffilliateInformation;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomatuin.TestBase.TestBase;

public class AffilliateInformationTest extends TestBase{
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateaffilliateinfo() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		AffilliateInformation page = new AffilliateInformation();
		page.AffilliateInformation("Akanllc","akanksha@gmail.com", "1234", "akanksha");
		String bannerText = page.getBannerText();
		Assert.assertEquals(bannerText, "Success: Your account has been successfully updated.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}


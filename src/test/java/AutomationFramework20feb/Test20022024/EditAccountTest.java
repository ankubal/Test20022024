package AutomationFramework20feb.Test20022024;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.EditAccount;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomatuin.TestBase.TestBase;

public class EditAccountTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	
	EditAccount editAccount;
	

	@BeforeMethod
	public void launchBrowser() { 
		intialisation();
		page = new AccountLoginPage();
	}


	@Test
	public void validateeditaccount() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		editAccount = myAccountPage.editaccount("Edit Account");
		editAccount = editAccount.editacc("akanksha", "ak", "akankshaa1", "641452");
		String bannerText = editAccount.getBannerText();
		Assert.assertEquals(bannerText, "Success: Your account has been successfully updated.");
	}
		
	
	

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}









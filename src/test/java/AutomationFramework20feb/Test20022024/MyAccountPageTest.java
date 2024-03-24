package AutomationFramework20feb.Test20022024;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePwdPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomatuin.TestBase.TestBase;

public class MyAccountPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		myAccountPage=page.submitLogin("akanksha@gmail.com", "akanksha");
		String myAccountText=myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText, "My Munni Account");
	}

	
	

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
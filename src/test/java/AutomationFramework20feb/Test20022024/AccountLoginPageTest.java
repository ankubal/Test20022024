package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomatuin.TestBase.TestBase;

public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("mansan@gmail.com", "Password1");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}

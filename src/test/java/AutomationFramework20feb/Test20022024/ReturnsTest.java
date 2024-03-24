package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.Returns;
import com.naveenautomatuin.TestBase.TestBase;

public class ReturnsTest extends TestBase{
	//AccountLoginPage page;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		//page = new AccountLoginPage();
	}

	@Test
	public void validatereturns() {
		//page.submitLogin("akanksha@gmail.com", "akanksha");
		Returns returns = new Returns();
		returns.returnform("AKANKSHA", "ak", "akanksha@gmail.com", "64745696255", "1452","11-03-2024" ,"iphone", "5287","2", "jkashhduhdiuwhdiuudk");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}



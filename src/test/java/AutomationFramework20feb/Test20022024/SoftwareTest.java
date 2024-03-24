package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.Software;
import com.naveenautomatuin.TestBase.TestBase;


public class SoftwareTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validatesoftwares() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			Software software = new Software();
			software.software();
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}
	}


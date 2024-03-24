package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.Tablets;
import com.naveenautomatuin.TestBase.TestBase;


public class TabletsTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void tabletaddtocart() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			Tablets tablet= new Tablets();
			tablet.addToCart();
		}

		@AfterMethod(enabled=false)
		public void closeBrowser() {
			tearDown();
		}
	}


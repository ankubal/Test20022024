package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.PhonesandPdas;
import com.naveenautomatuin.TestBase.TestBase;



public class PhonesandPdasTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateaddtophones() {
			//page.submitLogin("akanksha@gmail.com", "akanksha");
			PhonesandPdas phpda= new PhonesandPdas();
			 phpda.addToCart();
		}

		@AfterMethod(enabled=false)
		public void closeBrowser() {
			tearDown();
		}
	}


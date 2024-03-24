package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AddComponets;
import com.naveenautomatuin.TestBase.TestBase;



public class AddComponentsTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateAddComponent() {
			//page.submitLogin("akanksha@gmail.com", "akanksha");
			AddComponets addcomponets = new AddComponets();
			addcomponets.addcomponets();
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}
	}



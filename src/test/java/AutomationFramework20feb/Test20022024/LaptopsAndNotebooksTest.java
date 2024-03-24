package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.DesktopAddtoCart;
import com.naveenautomation.pages.LaptopsAndNotebooks;
import com.naveenautomatuin.TestBase.TestBase;


	public class LaptopsAndNotebooksTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateaddtocart() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			LaptopsAndNotebooks addtocart= new LaptopsAndNotebooks();
			addtocart.addToCart();
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}
	}


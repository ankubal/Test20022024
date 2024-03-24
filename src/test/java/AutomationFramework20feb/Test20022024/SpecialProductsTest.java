package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ShoppingCart;
import com.naveenautomation.pages.SpecialProducts;
import com.naveenautomatuin.TestBase.TestBase;



public class SpecialProductsTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateshopingcart() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			SpecialProducts specialproducts  = new SpecialProducts();
			specialproducts.specials();
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}
	}







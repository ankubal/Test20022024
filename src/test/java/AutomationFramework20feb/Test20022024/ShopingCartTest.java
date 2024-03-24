package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ShoppingCart;
import com.naveenautomatuin.TestBase.TestBase;


public class ShopingCartTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateshopingcart() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			ShoppingCart shoppingCart  = new ShoppingCart();
			shoppingCart.shoppingcart();
		}

		@AfterMethod(enabled=false)
		public void closeBrowser() {
			tearDown();
		}
	}







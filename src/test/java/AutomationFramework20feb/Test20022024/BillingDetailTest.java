package AutomationFramework20feb.Test20022024;


	import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.BillingDetails;
import com.naveenautomation.pages.Brands;
import com.naveenautomation.pages.DesktopAddtoCart;
import com.naveenautomatuin.TestBase.TestBase;

	public class BillingDetailTest extends TestBase {
		AccountLoginPage page;
		
		Brands brands;
		//DesktopAddtoCart desktopaddtocart;

		@BeforeMethod
		public void launchBrowser() { 
			intialisation();
			page = new AccountLoginPage();
		}

		@Test()
		public void validatebillingdetails() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			brands.selectbrands();
			//desktopaddtocart.addToCart();
			BillingDetails billingdetails = new BillingDetails();
			 billingdetails.billing("akanksha", "ak", "akanllc", "33 kirk drive", "brampton", "l6x4e6", "canada", "ontario");
			
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}

	}



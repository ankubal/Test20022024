


	package AutomationFramework20feb.Test20022024;

	import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.BillingDetails;
import com.naveenautomation.pages.Brands;
import com.naveenautomatuin.TestBase.TestBase;

	public class BrandsTest extends TestBase{
		//AccountLoginPage page;
		BillingDetails billingdetails;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			//page = new AccountLoginPage();
		}

		@Test
		public void validatebrand() {
		//	page.submitLogin("akanksha@gmail.com", "akanksha");
			Brands brands = new Brands();
			brands.selectbrands();
			
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}
	}





package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ContactUs;
import com.naveenautomation.pages.DesktopAddtoCart;
import com.naveenautomatuin.TestBase.TestBase;

public class DesktopAddToCartTest extends TestBase{
	
	AccountLoginPage page;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateaddtocart() {
		page.submitLogin("akanksha@gmail.com", "akanksha");
		DesktopAddtoCart addtocart= new DesktopAddtoCart();
		addtocart.addToCart();
	}

	@AfterMethod(enabled=false)
	public void closeBrowser() {
		tearDown();
	}
}

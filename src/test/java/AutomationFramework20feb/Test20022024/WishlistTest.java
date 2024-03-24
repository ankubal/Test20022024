package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.Wishlist;
import com.naveenautomatuin.TestBase.TestBase;

public class WishlistTest extends TestBase{
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	
	Wishlist wishlist;
	

	@BeforeMethod
	public void launchBrowser() { 
		intialisation();
		page = new AccountLoginPage();
	}


	@Test()
	public void validatewishlist() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		wishlist = myAccountPage.clickMenuItem("Wish List");
		
		
	
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}





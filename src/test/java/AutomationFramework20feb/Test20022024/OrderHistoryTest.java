package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.OrderHistory;
import com.naveenautomatuin.TestBase.TestBase;

public class OrderHistoryTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	
	OrderHistory orderHistory;
	

	@BeforeMethod
	public void launchBrowser() { 
		intialisation();
		page = new AccountLoginPage();
	}


	@Test()
	public void validateorderhistory() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		orderHistory = myAccountPage.clickMenuItems("Order History");
		
		
	
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}







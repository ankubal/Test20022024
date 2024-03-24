package AutomationFramework20feb.Test20022024;

  
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.naveenautomation.pages.AccountLoginPage;
	import com.naveenautomation.pages.Downloads;
	import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ReccuringPayments;
import com.naveenautomatuin.TestBase.TestBase;

	public class RecurringPaymentsTest extends TestBase {
		AccountLoginPage page;
		MyAccountPage myAccountPage;
		
		ReccuringPayments reccuringPayments;
		

		@BeforeMethod
		public void launchBrowser() { 
			intialisation();
			page = new AccountLoginPage();
		}


		@Test()
		public void validaterecurringpayement() {
			myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
			reccuringPayments = myAccountPage.clickItem("Recurring payments");
			
			
		
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}

}

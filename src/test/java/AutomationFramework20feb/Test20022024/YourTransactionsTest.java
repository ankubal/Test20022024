package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.YourTransactions;
import com.naveenautomatuin.TestBase.TestBase;


	public class YourTransactionsTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validatetransactions() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			YourTransactions transaction= new YourTransactions();
			transaction.transactions();
		}

		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}
	}



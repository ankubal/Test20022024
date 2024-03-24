package AutomationFramework20feb.Test20022024;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.RewardPoint;
import com.naveenautomatuin.TestBase.TestBase;

public class RewardPoinTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	
	RewardPoint rewardPoint;
	

	@BeforeMethod
	public void launchBrowser() { 
		intialisation();
		page = new AccountLoginPage();
	}


	@Test()
	public void validaterewarpoints() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		rewardPoint = myAccountPage.rewards("Reward Points");
		
		
	
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}







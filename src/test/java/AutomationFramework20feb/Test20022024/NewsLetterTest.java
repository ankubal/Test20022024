package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsletterSubscription;
import com.naveenautomatuin.TestBase.TestBase;

public class NewsLetterTest extends TestBase{
	
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	
	NewsletterSubscription newsletterSubscription;
	

	@BeforeMethod
	public void launchBrowser() { 
		intialisation();
		page = new AccountLoginPage();
	}


	@Test()
	public void validatenewsletter() {
		myAccountPage = page.submitLogin("akanksha@gmail.com", "akanksha");
		newsletterSubscription = myAccountPage.clickNavMenuItem("Newsletter");
		
		
	
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}



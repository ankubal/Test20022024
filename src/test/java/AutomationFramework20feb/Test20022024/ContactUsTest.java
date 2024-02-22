package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ContactUs;
import com.naveenautomatuin.TestBase.TestBase;

public class ContactUsTest extends TestBase{
	
	AccountLoginPage page;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateContactUs() {
		page.submitLogin("akanksha@gmail.com", "akanksha");
		ContactUs contact = new ContactUs();
		contact.contactUs("akanksha", "akanksha@gmail.com", "abkojsdjuudhuewdhiwu");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}

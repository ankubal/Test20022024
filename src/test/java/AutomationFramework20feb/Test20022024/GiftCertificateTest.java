package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.GiftCertificate;
import com.naveenautomatuin.TestBase.TestBase;

public class GiftCertificateTest extends TestBase {
	AccountLoginPage page;
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateGiftCertificate() {
		page.submitLogin("akanksha@gmail.com", "akanksha");
		GiftCertificate page = new GiftCertificate();
		page.giftcertificatesubmit("akanksha", "akanksha@gmail.com", "akanksha", "akanksha@gmail.com", "njdiuejinjfdeoijhnhjfd", "2000");;
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}

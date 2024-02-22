package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.Registration;
import com.naveenautomatuin.TestBase.TestBase;

public class RegistrationTest extends TestBase{
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateRegistration() {
		Registration page = new Registration();
		page.register("akanksha", "bal", "akanksha@gmail.com", "6474508888", "akanksha", "akanksha");;
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}

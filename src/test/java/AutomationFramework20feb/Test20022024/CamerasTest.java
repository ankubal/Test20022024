package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.Cameras;
import com.naveenautomatuin.TestBase.TestBase;



public class CamerasTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateaddcamera() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			Cameras cameras = new Cameras();
			cameras.addcameras();
		}

		@AfterMethod(enabled=false)
		public void closeBrowser() {
			tearDown();
		}
	}





package AutomationFramework20feb.Test20022024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.Cameras;
import com.naveenautomation.pages.Mp3Player;
import com.naveenautomatuin.TestBase.TestBase;


public class Mp3PlayerTest extends TestBase{
		
		AccountLoginPage page;
		@BeforeMethod
		public void launchBrowser() {
			intialisation();
			page = new AccountLoginPage();
		}

		@Test
		public void validateaddtomp3() {
			page.submitLogin("akanksha@gmail.com", "akanksha");
			Mp3Player mp3player = new Mp3Player();
			mp3player.addmp3player();
		}

		@AfterMethod(enabled=false)
		public void closeBrowser() {
			tearDown();
		}
	}


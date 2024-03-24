package com.naveenautomation.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;


public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>ul:nth-of-type(1) li:nth-of-type(2) a")
	WebElement changePwdBtn;

	@FindBy(css = "div.alert")
	WebElement successBanner;

	@FindBy(css = "#account-account>div.row h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "#column-right a")
	List<WebElement> sideNavWebelementList;
	@FindBy(css = "#column-right a")
	List<WebElement> NavWebelementList;
	public ChangePwdPage clickChangePasswordBtn() {
		changePwdBtn.click();
		return new ChangePwdPage();
	}

	public String getPasswordUpdateAlertText() {
		return successBanner.getText();
	}

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public AddressBookPage clickSideNavMenuItem(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new AddressBookPage();
	}
	public NewsletterSubscription clickNavMenuItem(String item) {
		for (int i = 0; i < NavWebelementList.size(); i++) {
			if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				NavWebelementList.get(i).click();
				break;
			}
		}
		return new NewsletterSubscription();
		}
	public Wishlist clickMenuItem(String item) {
		for (int i = 0; i < NavWebelementList.size(); i++) {
			if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				NavWebelementList.get(i).click();
				break;
			}
		}
		return new Wishlist();
		}
	
	public OrderHistory clickMenuItems(String item) {
		for (int i = 0; i < NavWebelementList.size(); i++) {
			if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				NavWebelementList.get(i).click();
				break;
			}
		}
		return new OrderHistory();
}
	public Downloads clickItems(String item) {
		for (int i = 0; i < NavWebelementList.size(); i++) {
			if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				NavWebelementList.get(i).click();
				break;
			}
		}
		return new Downloads();	

}
public ReccuringPayments clickItem(String item) {
	for (int i = 0; i < NavWebelementList.size(); i++) {
		if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
			NavWebelementList.get(i).click();
			break;
		}
	}
	return new ReccuringPayments();	

}
public RewardPoint rewards(String item) {
	for (int i = 0; i < NavWebelementList.size(); i++) {
		if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
			NavWebelementList.get(i).click();
			break;
		}
	}
	return new RewardPoint();	

}
public EditAccount editaccount(String item) {
	for (int i = 0; i < NavWebelementList.size(); i++) {
		if (NavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
			NavWebelementList.get(i).click();
			break;
		}
	}
	return new EditAccount();	

}}
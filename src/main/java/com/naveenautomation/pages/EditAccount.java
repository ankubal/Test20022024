package com.naveenautomation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;



public class EditAccount extends TestBase {

	public EditAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#input-firstname")
	WebElement firstName;

	@FindBy(css = "#input-lastname")
	WebElement lastName;

	@FindBy(css = "#input-email")
	WebElement accemail;

	@FindBy(css = "#input-telephone")
	WebElement telephone;

	@FindBy(css = "input[type='submit']")
	WebElement submitbtn;

	@FindBy(css = "#account-account>div:first-of-type")
	WebElement alertBannerText;


	private void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	private void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}

	private void enterEmail(String email) {
		accemail.sendKeys(email);
	}

	private void enterphoneno(String telphn) {
		telephone.sendKeys(telphn);
	}


	private void continueBtn() {
		submitbtn.click();
	}
	
	public String getBannerText() {
		return alertBannerText.getText();
	}
	public EditAccount editacc(String fname, String lname, String email, String telphn) {
		enterFirstName(fname);
		enterLastName(lname);
		enterEmail(email);
		enterphoneno(telphn);
		continueBtn();
		
		return new EditAccount();
	}

	
	

}


package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class GiftCertificate extends TestBase {

	public GiftCertificate() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Gift Certificates']")
	WebElement giftcertbtn;
	@FindBy(css = "#input-to-name")
	WebElement recepiantnameInput;

	@FindBy(css = "#input-to-email")
	WebElement recpemail;

	@FindBy(css = "#input-from-name")
	WebElement yourname;

	@FindBy(css = "#input-from-email")
	WebElement youremail;

	@FindBy(css = "#content form>div:nth-of-type(5)>div>div:nth-of-type(1)>label>input")
	WebElement birthdaybtn;

	@FindBy(xpath = "//textarea[@id='input-message']")
	WebElement messageinput;

	@FindBy(css = "#input-amount")
	WebElement amountinput;

	@FindBy(css = "input[type='checkbox']")
	WebElement checkbox;

	@FindBy(css = "input[type='submit']")
	WebElement continuebtn;

	private void giftcert() {
		giftcertbtn.click();;
	}
	private void enterrecpname(String recpname) {
		recepiantnameInput.sendKeys(recpname);
	}

	private void enterdrecpemail(String repemail) {
		recpemail.sendKeys(repemail);
	}

	private void yourname(String name) {
		yourname.sendKeys(name);
	}

	private void email(String uemail) {
		youremail.sendKeys(uemail);

	}

	private void birthday() {
		birthdaybtn.click();
	}

	private void enteredmessage(String message) {
		messageinput.sendKeys(message);
	}

	private void amount(String amount) {
		amountinput.sendKeys(amount);
	}

	private void checkbox() {
		checkbox.click();
	}

	private void continuebutton() {
		continuebtn.click();

	}
	public void giftcertificatesubmit(String recpname, String repemail, String name,String uemail,String message,String amount) {
		giftcert();
		enterrecpname( recpname);
		enterdrecpemail(repemail);
		yourname(name);
		email(uemail);
		birthday();
		enteredmessage(message);
		amount(amount);
		checkbox();
		continuebutton();
		
	}
}

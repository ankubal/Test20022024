package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class Registration extends TestBase{

	public Registration() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "aside>div.list-group>a:nth-of-type(2)")
	WebElement registerbtn;
	
	@FindBy(css = "#input-firstname")
	WebElement firstnameInput;

	@FindBy(css = "#input-lastname")
	WebElement lastnameinput;
	
	@FindBy(css = "#input-email")
	WebElement emailinput;

	@FindBy(css = "#input-telephone")
	WebElement telephoneinput;
	
	@FindBy(css = "#input-password")
	WebElement passwordinput;

	@FindBy(css = "#input-confirm")
	WebElement confirmpasswordinput;

//	@FindBy(css = "#content div>div form>input")
//	WebElement newslettercheckbox;
	
	@FindBy(css = "input[type='checkbox']")
	WebElement checkbox;
	@FindBy(css = "input[type='submit']")
	WebElement continuebtn;
	
	private void register() {
		registerbtn.click();;
	}
	private void enterfirstname(String firstname) {
		firstnameInput.sendKeys(firstname);
	}
	
	private void enterlastname(String lastname) {
		lastnameinput.sendKeys(lastname);
	}
	
	private void enteredemail(String email) {
		emailinput.sendKeys(email);
	}
	
	private void entertelephone(String telephone) {
		telephoneinput.sendKeys(telephone);
	}
	
	private void enterpwd(String password) {
		passwordinput.sendKeys(password);
	}
	
	
	private void entercnfirmpwd(String confirmpassword) {
		confirmpasswordinput.sendKeys(confirmpassword);
	}
	
	
//	private void newslettercheckbox() {
//		newslettercheckbox.click();
//	}
	private void checkbox() {
		checkbox.click();
	}
	private void continuebtn() {
		continuebtn.click();
	}
	public void register(String firstname, String lastname, String email,String telephone,String password,String confirmpassword) {
		register();
		enterfirstname(firstname);
		enterlastname(lastname);
		enteredemail( email);
		entertelephone(telephone);
		enterpwd(password);
		entercnfirmpwd(confirmpassword);
		
		checkbox();
		continuebtn();
		
	}
	
}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class ContactUs extends TestBase{

	public ContactUs() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactusbtn;
	@FindBy(css = "#input-name")
	WebElement nameInput;

	@FindBy(css = "#input-email")
	WebElement inputemail;
	
	@FindBy(css = "#input-enquiry")
	WebElement inputenquiry;

	@FindBy(css = "input[type='submit']")
	WebElement submitbtn;
	
	private void contactus() {
		contactusbtn.click();;
	}
	
	private void enteredname(String name) {
		nameInput.sendKeys(name);
	}
	
	private void enteredemail(String email) {
		inputemail.sendKeys(email);
	}
	
	private void enteredenquiry(String enquiry) {
		inputenquiry.sendKeys(enquiry);
	}
	private void submitbtn() {
		submitbtn.click();;
	}
	public void contactUs(String name,String email, String enquiry) {
		contactus();
		enteredname(name);
		enteredemail(email);
		enteredenquiry(enquiry) ;
		submitbtn();
	}
}

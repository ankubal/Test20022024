package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class NewsletterSubscription extends TestBase{
	
	public NewsletterSubscription() {
		PageFactory.initElements(driver, this);
	}
	
	 
	@FindBy(css = "label.radio-inline:first-of-type>input")
	WebElement yesradiobtn;
	@FindBy(css = "input[type='submit']")
	WebElement continuebtn;

	 
	
	
	private void yesbtn() {
		yesradiobtn.click();
	}
	
	private void continuebtn() {
		continuebtn.click();
	}
	
	public void newsletter() {
		yesbtn();
		continuebtn();
		
}}

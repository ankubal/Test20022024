package com.naveenautomation.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class RewardPoint extends TestBase{
	public RewardPoint() {
		PageFactory.initElements(driver, this);
	}
	
	 
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement continuebtn;
	

	 
	
	
	private void continuebtn() {
		continuebtn.click();
	}
	
	
	public void rewpoint() {
		
		continuebtn();
		
}}


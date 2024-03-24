package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class SpecialProducts extends TestBase{
	public SpecialProducts() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Specials']")
	WebElement specialbtn;

	@FindBy(css = "div.alert")
	WebElement alertBannerText;

	public void specials() {
		specialbtn.click();
		
	}

	

}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomatuin.TestBase.TestBase;

public class BillingDetails extends TestBase {
	public BillingDetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "input[type='radio'][value='new']")
	WebElement newbilling;
	@FindBy(css = "#input-payment-firstname")
	WebElement firstname;
	@FindBy(css = "#input-payment-lastname")
	WebElement lastname;

	@FindBy(css = "#input-payment-company")
	WebElement companyname;

	@FindBy(css = "#input-payment-address-1")
	WebElement address1;
	@FindBy(css = "#input-payment-city")
	WebElement city;
	@FindBy(css = "#input-payment-postcode")
	WebElement postcode;
	
	@FindBy(id = "input-country")
	WebElement country;

	@FindBy(id = "input-zone")
	WebElement zone;
	@FindBy(css = "input[type='button' ][value='Continue']")
	WebElement continueBtn;
	
	private void newbillingradio() {
		newbilling.click();;
	}
	private void fname(String name) {
		firstname.sendKeys(name);
	}
	
	private void lname(String laname) {
		lastname.sendKeys(laname);;
	}
	
	private void compname(String cname) {
		companyname.sendKeys(cname);
	}
	private void address(String addr) {
		address1.sendKeys(addr);
	}
	
	private void enteredcity(String cityname) {
		city.sendKeys(cityname);
	}
	private void enteredpostalcode(String code) {
		postcode.sendKeys(code);
	}
	private void selectCountry(String countryname) {
		selectElement(country, countryname);
	}

	private void enterZone(String zonename) {
		selectElement(zone, zonename);
	}
	private void continuebtnn() {
		continueBtn.click();
	}
	public  void billing (String name,String laname,String cname,String addr,String cityname,String code,String countryname,String zonename) {
		newbillingradio();
		fname(name);
		lname(laname);
		compname(cname); 
		address( addr);
		enteredcity(cityname);
		enteredpostalcode(code);
		selectCountry(countryname);
		enterZone(zonename);
		continuebtnn();
		//return new BillingDetails();
	}
	
	private void selectElement(WebElement element, String text) {
		Select sc = new Select(element);

		try {
			sc.selectByVisibleText(text);
		} catch (Exception e) {
			sc.selectByValue(text);
		}
	}
}





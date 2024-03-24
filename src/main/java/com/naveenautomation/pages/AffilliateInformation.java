package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class AffilliateInformation extends TestBase{

	public AffilliateInformation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	WebElement affilliateinfobtn;
	
	@FindBy(css = "#input-company")
	WebElement companyInput;

	@FindBy(css = "#input-website")
	WebElement inputwebsite;
	
	@FindBy(css = "#input-tax")
	WebElement inputtax;

	@FindBy(css = "div.radio label>input[value='cheque']")
	WebElement chequebtn;
	

	@FindBy(css = "#input-cheque")
	WebElement chequename;
	
	@FindBy(css = "input[type='submit']")
	WebElement continuebtn;
	
	@FindBy(css = "div.alert.alert-success.alert-dismissible")
	WebElement alertBannerText;
	
	private void affilliateinfobtn() {
		affilliateinfobtn.click();;
	}
	
	private void company(String companyname) {
		companyInput.sendKeys(companyname);
	}
	
	private void website(String email) {
		inputwebsite.sendKeys(email);
	}
	
	private void tax(String taxamount) {
		inputtax.sendKeys(taxamount);
	}
	private void chequebtn() {
		chequebtn.click();
	}
	private void paychequename(String payename) {
			chequename.sendKeys(payename);
		}
	private void continuebtn() {
			continuebtn.click();
			
		}
	public String getBannerText() {
		return alertBannerText.getText();
	}
		
	
	public MyAccountPage AffilliateInformation(String companyname,String email, String taxamount,String payename) {
		affilliateinfobtn();
		company(companyname);
		website(email);
		tax(taxamount) ;
		chequebtn();
		paychequename(payename);
		continuebtn();
		return new MyAccountPage();
	}
}



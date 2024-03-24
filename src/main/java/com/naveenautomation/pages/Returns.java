package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class Returns extends TestBase {
	public Returns() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.col-sm-3:nth-of-type(2)>ul>li:nth-of-type(2)>a")
	WebElement returnbtn;
	@FindBy(css = "#input-firstname")
	WebElement firstnameInput;

	@FindBy(css = "#input-email")
	WebElement emailinput;
	
	@FindBy(css = "#input-lastname")
	WebElement lastnameinput;
	@FindBy(css = "#input-telephone")
	WebElement inputtelephone;

	@FindBy(css = "#input-order-id")
	WebElement inputorder;
	
	@FindBy(css = "#input-date-ordered")
	WebElement orderdate;
	
	@FindBy(css = "  #input-product")
	WebElement inputproduct;

	@FindBy(css = "#input-model")
	WebElement productcode;
	
	@FindBy(css = "#input-quantity")
	WebElement inputquantity;
	
	@FindBy(css = "input[value='2']")
	WebElement reasonforreturn;
	
	@FindBy(css = "input[value='0']")
	WebElement productispoenedcheckbox;
	
	@FindBy(css = "#input-comment")
	WebElement faultydetails;
	@FindBy(css = "input[type='submit']")
	WebElement submitbtn;
	
	private void returnlink() {
		returnbtn.click();;
	}
	private void firstname(String fname) {
		firstnameInput.sendKeys(fname);
	}
	private void lastname(String lname) {
		lastnameinput.sendKeys(lname);
	}
	private void email(String emailId) {
		emailinput.sendKeys(emailId);
	}
	
	private void telephone(String telpnumber) {
		inputtelephone.sendKeys(telpnumber);
	}
	
	private void orderid(String idnumber) {
		inputorder.sendKeys(idnumber);
	}
	private void orderdate(String date) {
		orderdate.sendKeys(date);
	}
	
	private void productname(String prdname) {
		inputproduct.sendKeys(prdname);
	}
	private void prdtcode(String code) {
		productcode.sendKeys(code);
	}
	
	private void quantity(String qty) {
		inputquantity.sendKeys(qty);
	}
	private void reasforreturn() {
		reasonforreturn.click();	
	}
	private void checkbox() {
		productispoenedcheckbox.click();;
	}
	private void faultydetails(String text) {
		faultydetails.sendKeys(text);
	}
		private void submitbtn() {
			submitbtn.click();
		}
	public void returnform(String fname,String lname, String telpnumber,String emailId, String idnumber,String date,String prdname,String code,String qty,String text) {
		returnlink();
		firstname(fname);
		lastname(lname);
		email(emailId);
		telephone(telpnumber);
		orderid(idnumber) ;
		orderdate(date);
		productname(prdname);
		prdtcode(code);
		quantity(qty);
		reasforreturn();
		checkbox();
		faultydetails(text);
		submitbtn();
	}
}



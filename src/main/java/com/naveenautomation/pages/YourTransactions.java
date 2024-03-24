package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;


	public class YourTransactions extends TestBase{
		public YourTransactions() {
			PageFactory.initElements(driver, this);
		}
		
		 
		@FindBy(xpath = "//a[text()='Your Transactions']")
		WebElement transactionlink;
		
		@FindBy(xpath = "//a[text()='Continue']")
		WebElement continuebtn;
		 
		private void transaction() {
			transactionlink.click();
		}
		
		private void continuebtn() {
			continuebtn.click();
		}
		
		
		public void transactions() {
			transaction();
			continuebtn();
			
	}}




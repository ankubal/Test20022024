package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;



	public class Software extends TestBase{
		public Software() {
			PageFactory.initElements(driver, this);
		}
		
		 
		@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(5)>a")
		WebElement softwarelink;
		
		@FindBy(xpath = "//a[text()='Continue']")
		WebElement continuebtn;
		 
		private void selectsoftware() {
			softwarelink.click();
		}
		
		private void continuebtn() {
			continuebtn.click();
		}
		
		
		public void software() {
			selectsoftware();
			continuebtn();
			
	}}






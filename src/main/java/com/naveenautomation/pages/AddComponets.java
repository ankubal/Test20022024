package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;



	public class AddComponets extends TestBase{
		public AddComponets() {
			PageFactory.initElements(driver, this);
		}
		
		 
		@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(3)>a")
		WebElement components;
		
		@FindBy(xpath = "//a[text()='Monitors (2)']")
		WebElement selectMonitors;
		 
		private void selectsoftware() {
			components.click();
		}
		
		private void monitors() {
			selectMonitors.click();
		}
		
		
		public void addcomponets() {
			selectsoftware();
			monitors();
			
	}}








package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;




	public class ShoppingCart extends TestBase{
		public ShoppingCart() {
			PageFactory.initElements(driver, this);
		}
		
		 
		@FindBy(css = "ul.list-inline>li:nth-of-type(4)>a")
		WebElement shoppingcartlink;
		
		
		@FindBy(xpath = "//a[text()='Continue']")
		WebElement continuebtn;
		
		private void shoppingCart() {
			shoppingcartlink.click();
		}
		
		
		private void contbtn() {
			continuebtn.click();
		}
		
		public void shoppingcart() {
			shoppingCart() ;
			
			contbtn();
			
	}}














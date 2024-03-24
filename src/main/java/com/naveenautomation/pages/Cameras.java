package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;


	public class Cameras extends TestBase{
		public Cameras() {
			PageFactory.initElements(driver, this);
		}
		
		 
		@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(7)>a")
		WebElement cameraslink;
		
		@FindBy(css = "div.product-thumb>div>a")
		WebElement selectitem;
		 
		@FindBy(css = "button[type='button'][id='button-cart']")
		WebElement addToCart;
		private void camera() {
			cameraslink.click();
		}
		
		private void selectitem() {
			selectitem.click();
		}
		private void addToCart() {
			addToCart.click();
		}
		
		public void addcameras() {
			camera();
			selectitem() ;
			addToCart();
			
	}}










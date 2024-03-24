package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;


	public class PhonesandPdas extends TestBase {
		public PhonesandPdas() {
			PageFactory.initElements(driver, this);
		}
		


	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	WebElement phonesandpda;
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	WebElement selectitem;
	@FindBy(css = "button[type='button'][id='button-cart']")
	WebElement addtocart;

	@FindBy(css = "div[id='cart'][class='btn-group btn-block'] ")
	WebElement clickadditem;
	 
	@FindBy(css = "#cart-total") 
	WebElement viewcartbtn;

	@FindBy(css = "#cart>ul>li>div>p>a:last-of-type")
	WebElement checkoutbtn;

	private void phonespda() {
		phonesandpda.click();
	}

	  

	private void selectphone() {
		selectitem.click();
	}

	private void addTocart() {
		addtocart.click();
	}
	private void clickadd() {
		clickadditem.click();
	}
	private void viewcart() {
		viewcartbtn.click();
	}
	private void checkout() {
		checkoutbtn.click();
	}
	public void addToCart() {
		phonespda();
		selectphone();
		addTocart() ;
		clickadd() ;
		viewcart();
		checkout();
		

	}

	}


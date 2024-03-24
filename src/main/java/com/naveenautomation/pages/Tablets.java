package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;



	public class Tablets extends TestBase {
		public Tablets() {
			PageFactory.initElements(driver, this);
		}
		


	@FindBy(xpath = "//a[text()='Tablets']")
	WebElement tabletsbtn;
	@FindBy(css = "div.product-thumb>div>div.button-group>button:first-of-type ")
	WebElement addToCart;
	@FindBy(css = "div[id='cart'][class='btn-group btn-block'] ")
	WebElement clickadditem;
	
	@FindBy(css = "#cart-total") 
	WebElement viewcartbtn;

	@FindBy(css = "#cart>ul>li>div>p>a:last-of-type")
	WebElement checkoutbtn;
	private void tablets() {
		tabletsbtn.click();
	}

	 
	private void addtablets() {
		addToCart.click();
	}
	
	private void additem() {
		clickadditem.click();
	}
	
	private void viewcart() {
		viewcartbtn.click();
	}
	private void checkout() {
		checkoutbtn.click();
	}
	public void addToCart() {
		tablets() ;
		addtablets();
		additem() ;
		viewcart();
		checkout();

	}

	}





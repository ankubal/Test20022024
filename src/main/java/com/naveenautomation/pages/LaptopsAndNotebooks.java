package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;


	public class LaptopsAndNotebooks extends TestBase {
		public LaptopsAndNotebooks() {
			PageFactory.initElements(driver, this);
		}
		


	@FindBy(xpath = "//a[text()='Laptops & Notebooks'] [@class='dropdown-toggle']")
	WebElement laptopnotebooks;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks'] ")
	WebElement alllaptopnotebook;
	@FindBy(xpath = "//a[text()='MacBook']")
	WebElement selectProduct;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement AddToCart;
	 
	@FindBy(css = "#cart-total") 
	WebElement viewcartbtn;

	@FindBy(css = "#cart>ul>li>div>p>a:last-of-type")
	WebElement checkoutbtn;

	private void laptopdropdown() {
		laptopnotebooks.click();
	}

	 
	private void alllaptopnotebook() {
		alllaptopnotebook.click();
	}

	private void selectitem() {
		selectProduct.click();
	}
	private void addtocartbtn() {
		AddToCart.click();
	}
	private void viewcart() {
		viewcartbtn.click();
	}
	private void checkout() {
		checkoutbtn.click();
	}
	public void addToCart() {
		laptopdropdown();
		alllaptopnotebook();
		selectitem() ;
		addtocartbtn() ;
		viewcart();
		checkout();
		

	}

	}



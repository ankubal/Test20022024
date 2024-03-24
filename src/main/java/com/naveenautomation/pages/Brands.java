package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class Brands extends TestBase {
	public Brands() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.col-sm-3:nth-of-type(2)+div>ul>li:nth-of-type(1)>a")
	WebElement brandslink;
	@FindBy(xpath = "//a[text()='Apple']")
	WebElement appleproducts;

	@FindBy(css = "#content>div:nth-of-type(2)>div:nth-of-type(8)>div.product-thumb>div.image>a")
	WebElement addproduct;

	@FindBy(css = "#button-cart , button.btn btn-primary btn-lg btn-block")
	WebElement addtocart;
	
	
	private void brands() {
		brandslink.click();;
	}
	
	
	private void selectproducts() {
		appleproducts.click();
	}
	
	private void addprdct() {
		addproduct.click();
	}
	private void addToCart() {
		addtocart.click();
	}
	
	public BillingDetails selectbrands() {
		brands();
		selectproducts();
		addprdct();
		addToCart();
		return new  BillingDetails();
		
	}
}



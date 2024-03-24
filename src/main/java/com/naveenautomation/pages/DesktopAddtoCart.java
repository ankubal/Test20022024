package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;

public class DesktopAddtoCart extends TestBase {
	public DesktopAddtoCart() {
		PageFactory.initElements(driver, this);
	}
	


@FindBy(xpath = "//a [text()= 'Desktops'][@class='dropdown-toggle']")
WebElement desktop;
@FindBy(xpath = "//a [text()= 'Show All Desktops']")
WebElement alldesktop;
@FindBy(xpath = "//a[text()='MacBook']")
WebElement selectProduct;

@FindBy(xpath = "//button[text()='Add to Cart']")
WebElement AddToCart;
 
@FindBy(css = "#cart-total") 
WebElement viewcartbtn;

@FindBy(css = "#cart>ul>li>div>p>a:last-of-type")
WebElement checkoutbtn;

private void desktopdropdown() {
	desktop.click();
}

  

private void alldesktopbtn() {
	alldesktop.click();
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
	desktopdropdown();
	alldesktopbtn();
	selectitem() ;
	addtocartbtn() ;
	viewcart();
	checkout();
	

}

}

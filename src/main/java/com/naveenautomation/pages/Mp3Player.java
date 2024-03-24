package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomatuin.TestBase.TestBase;



	public class Mp3Player extends TestBase{
		public Mp3Player() {
			PageFactory.initElements(driver, this);
		}
		
		 
		@FindBy(xpath = "//a[text()='MP3 Players']")
		WebElement mp3palyerlink;
		
		@FindBy(xpath = "//a[text()='test 23 (0)']")
		WebElement selectplayer;
		 
		@FindBy(xpath = "//a[text()='Continue']")
		WebElement continuebtn;
		
		private void mp3() {
			mp3palyerlink.click();
		}
		
		private void selectitem() {
			selectplayer.click();
		}
		private void contbtn() {
			continuebtn.click();
		}
		
		public void addmp3player() {
			mp3() ;
			selectitem() ;
			contbtn();
			
	}}












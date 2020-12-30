package com.stepefinition;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobal {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtusername;

	@FindBy(id = "password")
	private WebElement txtpass;
	
	@FindBy(id = "login")
	private WebElement clicklogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public void setTxtusername(WebElement txtusername) {
		this.txtusername = txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getClicklogin() {
		return clicklogin;
	}

	public void setClicklogin(WebElement clicklogin) {
		this.clicklogin = clicklogin;
	}

	public void loginpage(String user, String pass) {

		sendkey(getTxtusername(), user);
		sendkey(getTxtpass(), pass);
	}

	public void loginclick() {
		click1(getClicklogin());

	}
}

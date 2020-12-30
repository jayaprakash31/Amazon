package com.stepefinition;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditPogo extends LibGlobal{
	public CreditPogo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = " cc_num")
	private WebElement txtccnum;
	@FindBy(id = "cc_type")
	private WebElement txtcctype;
	@FindBy(id = "cc_exp_month")
	private WebElement txtccexpmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(id = "cc_cvv")
	private WebElement cccvv;
	public WebElement getTxtccnum() {
		return txtccnum;
	}
	public WebElement getTxtcctype() {
		return txtcctype;
	}
	public WebElement getTxtccexpmonth() {
		return txtccexpmonth;
	}
	public WebElement getCcexpyear() {
		return ccexpyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	
	public void creditpage(String data2,String user) {
	
	selectByVisibletext(getTxtcctype(), data2);
	sendkey(getTxtccnum(), user);
	
}
	public void card(String data,String data1,String pass) {
		selectByVisibletext(getTxtccexpmonth(), data);
		selectByVisibletext(getCcexpyear(), data1);
		sendkey(getCccvv(), pass);

	}
}

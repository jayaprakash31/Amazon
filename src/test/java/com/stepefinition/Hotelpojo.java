package com.stepefinition;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelpojo extends LibGlobal {
	public Hotelpojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "location")
	private WebElement txtloc;
	@FindBy(id = "hotels")
	private WebElement txthotel;
	@FindBy(name = "room_type")
	private WebElement txtroom;
	@FindBy(id = "room_nos")
	private WebElement txtnos;
	@FindBy(id = "datepick_in")
	private WebElement txtdatepickin;

	public WebElement getTxtloc() {
		return txtloc;
	}

	public WebElement getTxthotel() {
		return txthotel;
	}

	public WebElement getTxtroom() {
		return txtroom;
	}

	public WebElement getTxtnos() {
		return txtnos;
	}

	public WebElement getTxtdatepickin() {
		return txtdatepickin;
	}

	public WebElement getTxtdatepickout() {
		return txtdatepickout;
	}

	public WebElement getTxtadult() {
		return txtadult;
	}

	public WebElement getTxtchild() {
		return txtchild;
	}

	@FindBy(id = "datepick_out")
	private WebElement txtdatepickout;
	@FindBy(id = "adult_room")
	private WebElement txtadult;
	@FindBy(id = "child_room")
	private WebElement txtchild;
	@FindBy(id = "continue")
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public void hotelpage(String data, String data1, String data2, String data3, String data4, String data5,
			String data6, String data7) {
		selectByVisibletext(getTxtloc(), data);
		selectByVisibletext(getTxthotel(), data1);
		selectByVisibletext(getTxtnos(), data2);
		selectByVisibletext(getTxtnos(), data3);
		selectByVisibletext(getTxtdatepickin(), data4);
		selectByVisibletext(getTxtdatepickout(), data5);
		selectByVisibletext(getTxtadult(), data6);
		selectByVisibletext(getTxtchild(), data7);

	}

	public void clickbtn() {
		click1(getContinuebutton());

	}

}

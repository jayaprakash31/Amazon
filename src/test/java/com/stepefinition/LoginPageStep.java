package com.stepefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends LibGlobal {
	WebDriver driver2;

	@Given("user is on the adactin page")
	public void user_is_on_the_adactin_page() {
		driver2 = getDriver();
		driver2.manage().window().maximize();
		driver2.get("http://adactinhotelapp.com/");
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("user should enter the {string} , {string}")
	public void user_should_enter_the(String name, String pass) {
		LoginPojo l = new LoginPojo();
		l.loginpage(name, pass);

	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {

		LoginPojo l1 = new LoginPojo();
		l1.loginclick();
	}

	@When("user should select the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select_the(String loc, String hotel, String room, String NRoom, String datein,
			String dateout, String APRoom, String CPRoom) {
		Hotelpojo h = new Hotelpojo();
		h.hotelpage(loc, hotel, room, NRoom, datein, dateout, APRoom, CPRoom);

	}

	@When("user should click the search button")
	public void user_should_click_the_search_button() {
		Hotelpojo h = new Hotelpojo();
		h.clickbtn();

	}

	@When("user should select the hotel")
	public void user_should_select_the_hotel() {
		WebElement selclick = driver2.findElement(By.xpath("//input[@id='radiobutton_0']"));
		selclick.click();

	}

	@When("user select click the continue button")
	public void user_select_click_the_continue_button() {
		WebElement seabut = driver2.findElement(By.xpath("//input[@id='continue']"));
		seabut.click();
	}

	@When("user should enter the {string},{string},{string},{string}{string}")
	public void user_should_enter_the(String FName, String LName, String BAddress, String string4, String string5,
			io.cucumber.datatable.DataTable dataTable) {
		WebElement Fname = driver2.findElement(By.xpath("//input[@name='first_name']"));
		Fname.sendKeys(FName);
		WebElement Lname = driver2.findElement(By.xpath("//input[@name='last_name']"));
		Lname.sendKeys(LName);
		WebElement address = driver2.findElement(By.id("address"));
		address.sendKeys(BAddress);
		CreditPogo c = new CreditPogo();
		java.util.List<Map<String, String>> m = dataTable.asMaps();
		Map<String, String> e = m.get(0);
		String name = e.get("Credit Card Type");
		String card = e.get("Credit Card No ");
		c.creditpage(name, card);
	}

	@When("user should enter the {string},{string},{string}")
	public void user_should_enter_the(String data, String data1, String pass,
			io.cucumber.datatable.DataTable dataTable) {
		CreditPogo c = new CreditPogo();
		c.card(data, data1, pass);
		java.util.List<Map<String, String>> m = dataTable.asMaps();
		Map<String, String> e = m.get(0);
		String name = e.get("Expiry Month");
		String year = e.get("Expiry year");
		String number = e.get("CCV Number ");
		c.card(name, year, number);

	}

	@When("user should click the Book Now Button")
	public void user_should_click_the_Book_Now_Button() throws InterruptedException {

		WebElement BookBtn = driver2.findElement(By.xpath("//input[@id='book_now']"));
		BookBtn.click();
		Thread.sleep(8000);

	}

	@Then("user should get the Order no")
	public void user_should_get_the_Order_no() {
		WebElement Orderno = driver2.findElement(By.id("order_no"));
		String attribute = Orderno.getAttribute("value");
		System.out.println(attribute);

	}

}
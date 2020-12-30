package org.base;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public  class LibGlobal {
	public static WebDriver driver;
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prithivi\\TJP\\CucumberClass\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}
	public String getTitle() {
		return driver.getTitle();

	}
	public  boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
			
	}
	public boolean isEnabled(WebElement element) {
		return element.isEnabled();

	}
	public String gettext(WebElement element) {
		return element.getText();
	}
	public String getAttributes(WebElement element) {
		
		return element.getAttribute("value");
	}
	public void clickjs(WebElement element) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click",element);

	}
	public void typejs() {
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute()");

	}

	public void selectByVisibletext(WebElement element,String data) {
		new Select(element).selectByVisibleText(data);

	}
	public void SelectByIndex(WebElement element,int index) {
		new Select(element).selectByIndex(index);

	}
	public void qiutBrowser() {

         driver.quit();

	}
	public void closeBrowser() {
		driver.close();

	}
	public void click(WebElement element) {

if(isDisplayed(element)&&isEnabled(element)) {
	element.click();
}

	}
	public void type(WebElement element,String data) {
		if(isDisplayed(element)&&isDisplayed(element)&&data!=null) {
			element.sendKeys(data);
		}
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	public void loadurl(String url) {
	driver.get(url);
	maximize();
	implicitwait();

	}
	public void sendkey(WebElement element , String data) {
	element.sendKeys(data);

	}
	public void click1 (WebElement element) {
	element.click();

	}
	
	public void jp() {
		// TODO Auto-generated method stub

	}

}

package com.software.journal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	private WebDriver driver;

	// Page URL
	private static String PAGE_URL = "https://www.google.com/";

	// Constructor
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		// Navigate to Software Journal channel
		driver.get(PAGE_URL);

		// Initialize Elements/Locators
		PageFactory.initElements(this.driver, this);
	}
}

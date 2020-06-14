package com.software.journal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwareJournalPage {

	private WebDriver driver;

	// Page URL
	private static String PAGE_URL = "https://www.youtube.com/channel/UCQyNrle3Byw8cs7zoX7jJxQ?view_as=subscriber";

	// Locators
	@FindBy(xpath="/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-shelf-renderer/div[1]/div[1]/div/h2/div[1]/div/a/span")
	private WebElement everythingAutomatedPlaylistTitle;

	@FindBy(xpath="/html/body/ytd-app/div/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-shelf-renderer/div[1]/div[1]/div/h2/div[2]/ytd-button-renderer/a/paper-button")
	private WebElement playAllForEAPButton;
	
	// Constructor
	public SoftwareJournalPage(WebDriver driver) {
		this.driver=driver;
		// Navigate to Software Journal channel
		driver.get(PAGE_URL);
		
		//Initialize Elements/Locators
		PageFactory.initElements(this.driver, this);
	}
	
	// Verify Everything Automated Playlist shows
	public Boolean verifyPlaylistShows() {
		return everythingAutomatedPlaylistTitle.isDisplayed();
	}
	
	// Click the Play All button next to the Everything Automated
	public void clickPlayAll() {
		playAllForEAPButton.click();
	}

}

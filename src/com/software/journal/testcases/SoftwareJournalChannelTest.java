package com.software.journal.testcases;

import org.testng.annotations.Test;

import com.software.journal.webpages.GoogleHomePage;
import com.software.journal.webpages.SoftwareJournalPage;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class SoftwareJournalChannelTest {
	private WebDriver driver;
	// Add driver system path
	private final String driverPath = "C:\\Selenium\\driver\\83_0_4103_14\\chromedriver.exe";

	@BeforeClass
	public void setUp() {
		// Add system property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// Add ChromeOption parameters
		ChromeOptions options = new ChromeOptions();

		// This strategy causes Selenium to wait for the
		// DOMContentLoaded event (html content downloaded and parsed only)
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		// Close browser
		driver.quit();
	}

	// This method will fail on purpose
	@Test(description = "Google home page loaded")
	public void testGoogleHomePage() throws InterruptedException {
		// Initialize the page
		GoogleHomePage page = new GoogleHomePage(driver);
		// Wait for 3 seconds
		Thread.sleep(3000);
		assertTrue(false);
	}

	@Test(description = "Google search results page loaded", dependsOnMethods = "testGoogleHomePage")
	public void testGoogleResultPage() {
		// Do Nothing
	}

	/**
	 * This method verifies if the Everything Automated playlist title is displayed
	 * and then click on the Play All button
	 * 
	 * @throws InterruptedException
	 */
	@Test(description = "Software Journal channel page loaded")
	public void testSoftwareJournalPage() throws InterruptedException {
		// Initialize the page
		SoftwareJournalPage page = new SoftwareJournalPage(driver);
		// Verify if playlist shows on the page
		assertTrue(page.verifyPlaylistShows());
		// Wait for 5 seconds
		Thread.sleep(5000);
		// Click the play all button next to the Everything Automated title
		page.clickPlayAll();
		// Wait for 10 seconds
		Thread.sleep(10000);
	}

}

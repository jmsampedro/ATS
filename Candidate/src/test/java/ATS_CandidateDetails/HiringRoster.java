package ATS_CandidateDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HiringRoster {
	@Test (priority = 1)
	public void inTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Roster");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select location
		driver.findElement(By.cssSelector("#select2-kt-location-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='North America'] span")).click();
		
		//Wait for Element
		WebElement inTestapp = new WebDriverWait(driver, Duration.ofSeconds(40))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Taiwo')]")));
		Thread.sleep(2000);
		inTestapp.click();
		
		//Wait for flyout
		WebElement req = new WebDriverWait(driver, Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-requisition-select-container")));
		Thread.sleep(2000);
		req.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'18397 - Wave #Placeholder (')]")).click();
		Thread.sleep(1000);
		
		//Update wage
		WebElement wage = driver.findElement(By.cssSelector("#requisition-wage"));
		wage.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('requisition-wage').value = '40';");
		Thread.sleep(1000);
		
		//Update hire type
		driver.findElement(By.cssSelector("#select2-applicant-hiretype-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Internal'] span")).click();
		Thread.sleep(1000);
		
		//Wait for update
		WebElement update = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Successfully Updated Requisition')]")));
		Thread.sleep(3000);
		
		//Update skills
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#applicant-notes")).sendKeys("test");
		Thread.sleep(1000);
		//Save
		driver.findElement(By.cssSelector("#btn-save-changes")).click();
		Thread.sleep(3000);
	}
	
	@Test (priority = 2)
	public void book() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Roster");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click book button
		driver.findElement(By.xpath("(//button[@id='btn-book-orientation'])[2]")).click();
		//Wait for Element
		WebElement orient = new WebDriverWait(driver, Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='col-lg-12 no-padding'] label")));
		Thread.sleep(2000);
		
		//Click New Schedule
		driver.findElement(By.cssSelector("#btn-new-schedule")).click();
		WebElement program = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-lineofbusiness-modal-select-container")));
		Thread.sleep(2000);
		
		//Start Date
		driver.findElement(By.cssSelector("#start-date-input")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div:nth-child(13) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(5)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='hour hour_pm'][normalize-space()='3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='3:30']")).click();
		Thread.sleep(1000);
		
		//End Date
		driver.findElement(By.cssSelector("#end-date-input")).click();
		Thread.sleep(1000);
		WebElement date = driver.findElement(By.cssSelector("body > div:nth-child(13) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(3) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(6)"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", date);
		//driver.findElement(By.xpath("(//td[contains(text(),'31')])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'10')])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='10:30']")).click();
		Thread.sleep(1000);
		
		//Edit capacity
		WebElement cap = driver.findElement(By.cssSelector("#capacity"));
		cap.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		js.executeScript("document.getElementById('capacity').value = '40.00';");
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.cssSelector("#btn-modal-save")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("th[aria-label='End DateTime: activate to sort column ascending']")));
		Thread.sleep(2000);
		
		//Select schedule
		driver.findElement(By.xpath("(//td[normalize-space()='Dare Foods - Winnipeg - Waverley'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[17]")).click();
		Thread.sleep(8000);
	}
	
	@Test (priority = 3)
	public void status() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Roster");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Clicking statuses
		driver.findElement(By.xpath("//button[normalize-space()='Ready For Interview']")).click();
		WebElement ready = new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(text(),'In Testing')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='btn-modal-close'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[data-status-name='Not_Right_Now']")).click();
		WebElement NRN = new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-disposition-modal-select-container")));
		Thread.sleep(1000);
		NRN.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Not Hired - Low Spoken'] span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='btn-modal-close'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[data-status-name='On_Hold']")).click();
		WebElement OnHold = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-disposition-modal-select-container")));
		Thread.sleep(1000);
		OnHold.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Schedule'] span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='btn-modal-close'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[data-status-name='Candidate_Withdrew']")).click();
		WebElement withdrew = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(text(),'In Testing')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='btn-modal-close'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-danger btn-cancel']")).click();
		Thread.sleep(2000);
	}
	
	@Test (priority = 4)
	public void ellipsis() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Roster");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click Actions column
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		WebElement ellip = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/span[1]/a[1]"));
		ellip.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-skill-test'])[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Grammar']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[12]")).click();
		Thread.sleep(2000);
		
		ellip.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-skill-test'])[2]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-follow-up-select-container")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-follow-up-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Others')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".form-control.kt-input.follow-up-date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[contains(@class,'new day')][normalize-space()='8']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-input-name='Description']")).sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@data-input-name,'RequestedBy')]")).sendKeys("JM");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea[type='text']")).sendKeys("For Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
		Thread.sleep(1000);
		
		ellip.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-assign-wave'])[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(40))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'18397 - Wave #Placeholder (')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		Thread.sleep(1000);
	}
	
	@Test (priority = 5)
	public void bell() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Roster");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click bell button
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		WebElement bellclk = driver.findElement(By.xpath("(//span)[82]"));
		
		boolean isPresent = false;
		
		do {
			try {
				driver.findElement(By.xpath("(//span)[82]")).click();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("#select2-follow-up-select-container")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//span[contains(text(),'Others')])[1]")).click();
				Thread.sleep(1000);
				isPresent = true;
			} catch(Exception e) {
				driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
				Thread.sleep(1000);
				isPresent = false;
			}
		} while(isPresent == false);
		
		driver.findElement(By.cssSelector(".form-control.kt-input.follow-up-date")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='30']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-input-name='Description']")).sendKeys("Bell Test");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-input-name='RequestedBy']")).sendKeys("JM");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea[type='text']")).sendKeys("Test");
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		
		boolean saved_data = false;
		do {
			try {
				driver.findElement(By.xpath("(//span)[82]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//td[normalize-space()='Others']")).click();
				Thread.sleep(1000);
				saved_data = true;
			} catch(Exception e) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@type='button'])[10]")));
				Thread.sleep(1000);
				saved_data = false;
			}
		} while(saved_data == false);
		
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[class='kt-checkbox kt-checkbox--single kt-checkbox--solid'] span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btn-bulk-complete")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
		Thread.sleep(1000);
	}
	
	@Test (priority = 6)
	public void checkin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\john.sampedro\\eclipse\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		//Pass debugger address
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		//Pass ChromeOptions
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Roster");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click Check In button
		driver.findElement(By.cssSelector("#btn-check-in-modal")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#select2-kt-location-check-in-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Altamonte Springs, Florida'] span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#search_check_in")).sendKeys("Carter");
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
		new WebDriverWait(driver, Duration.ofSeconds(75))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Ashley')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
		Thread.sleep(1000);
		
		//Click refresh
		action.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		for(int i = 0; i < 2; i++){
			driver.findElement(By.cssSelector("label[id='csi_toggle'] span")).click();
			Thread.sleep(1000);
		}
		driver.findElement(By.cssSelector("button[data-status-table='CSI_Session']")).click();
		Thread.sleep(4000);
	}
}
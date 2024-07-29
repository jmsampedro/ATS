package ATS_CandidateDetails;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CandidateDetails {
	@Test(priority = 1)
	public void information() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Filling out information
		WebElement street = driver.findElement(By.cssSelector("input[placeholder='Street']"));
		WebElement city = driver.findElement(By.cssSelector("input[placeholder='City']"));
		WebElement PostalCode = driver.findElement(By.cssSelector("input[placeholder='Postal Code']"));
		WebElement AptNo = driver.findElement(By.cssSelector("input[placeholder='Apartment Number']"));
		WebElement state = driver.findElement(By.cssSelector("input[placeholder='State']"));
		WebElement country = driver.findElement(By.cssSelector("input[placeholder='Country Name']"));
		
		street.sendKeys("Galas Street");
		Thread.sleep(1000);
		city.sendKeys("Valenzuela City");
		Thread.sleep(1000);
		PostalCode.sendKeys("1440");
		Thread.sleep(1000);
		AptNo.sendKeys("Blk 11 Lot 25");
		Thread.sleep(1000);
		state.sendKeys("Arizona");
		Thread.sleep(1000);
		country.sendKeys("Philippines");
		Thread.sleep(1000);
		
		//Add fields
		driver.findElement(By.xpath("(//span[contains(text(),'Add')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#kt-phone-2")).sendKeys("9395046098");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#kt-email-2")).sendKeys("johnmichaelsampedro@gmail.com");
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		
		//Wait for Template
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void dayforce() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Fill out information
		driver.findElement(By.cssSelector("#select2-OnboardingPolicyXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'USA Exempt On Site')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-JobXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(.,'CSR Bilingual French')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-OrganizationXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Alberta - WFA')]")).click();
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		
		//Wait for Template
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void ActionTemplate() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Verify Action
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Action']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Options']")).click();
		
		//Wait for Template
		WebElement form = new WebDriverWait(driver, Duration.ofSeconds(45))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='ATS-Online-ApplicationForm-URL']")));
		Thread.sleep(1000);
		form.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btn-select-template")).click();
		
		//Wait for Display Template
		new WebDriverWait(driver, Duration.ofSeconds(45))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void JobEmail() throws InterruptedException, AWTException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click Email
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		for(int i = 0; i < 5; i++) {
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(1000);
		
		boolean isPresent = false;
		
		do {
			try {
				driver.findElement(By.xpath("//tr[@class='odd']//a[@class='btn btn-sm btn-clean btn-icon btn-icon-md btn-actions']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//a[@id='btn-email'])[1]")).click();
				//Wait for Template
				new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[contains(text(),'Interview Schedule (In Person Interview)')]")).click();
				isPresent = true;
				Thread.sleep(1000);
			} catch(Exception e) {
				driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
				Thread.sleep(1000);
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector(".kt-subheader__title")).click();
				//Click Email
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				for(int i = 0; i < 6; i++) {
					action.sendKeys(Keys.ARROW_DOWN).build().perform();
				}
				Thread.sleep(1000);
			}
		} while(isPresent == false);
		
		//Close template
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
	}
	
	@Test(priority = 5)
	public void SelectStatus() throws InterruptedException, AWTException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select Status
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
				
		for(int i = 0; i < 5; i++) {
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#status-link-0")).click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Status']")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#modalStatusDropDown")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal fade atsModal show'] h4[class='modal-title']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#txtInterviewDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='30']")).click();
		Thread.sleep(1000);
		
		//Wait for Element
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[contains(.,'07:30')]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[51]")).click();
	}
	
	@Test(priority = 6)
	public void assess() throws InterruptedException, AWTException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Add Job
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
						
		for(int i = 0; i < 5; i++) {
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[id='btn-add-job'] span")).click();
		new WebDriverWait(driver, Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Add Application']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btn-save']//span[contains(text(),'Save')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]")).click();
		Thread.sleep(2000);
		
		//Get Assessment Link
		driver.findElement(By.cssSelector("button[id='btn-get-assessment'] span")).click();
		new WebDriverWait(driver, Duration.ofSeconds(45))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
		Thread.sleep(1500);
		
		//Attachment
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		WebElement upload = driver.findElement(By.xpath("//span[normalize-space()='Add Attachment/s']"));
		upload.click();
		
		//Cancel upload
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
	}
	
	@Test(priority = 7)
	public void clear() throws InterruptedException, AWTException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=1d7b2d1c-9735-4fd0-8029-7431d45f8c2f");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Clearing out fields
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		WebElement street = driver.findElement(By.cssSelector("input[placeholder='Street']"));
		WebElement city = driver.findElement(By.cssSelector("input[placeholder='City']"));
		WebElement PostalCode = driver.findElement(By.cssSelector("input[placeholder='Postal Code']"));
		WebElement AptNo = driver.findElement(By.cssSelector("input[placeholder='Apartment Number']"));
		WebElement state = driver.findElement(By.cssSelector("input[placeholder='State']"));
		WebElement country = driver.findElement(By.cssSelector("input[placeholder='Country Name']"));
				
		street.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		city.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		PostalCode.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		AptNo.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		state.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		country.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		//Delete fields
		driver.findElement(By.xpath("(//a[@class='btn btn-danger btn-icon'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='btn btn-danger btn-icon'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(3000);
		
		//Clear Dayforce
		driver.findElement(By.cssSelector("#select2-OnboardingPolicyXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Select Onboarding Policy Code']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-JobXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Select Job']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-OrganizationXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Select Organization']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
	}
}
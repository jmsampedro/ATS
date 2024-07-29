package ATS_CandidateDetails;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LATAM {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
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
	}
	
	@Test(priority = 2)
	public void DFInfo() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select Onboarding Policy
		driver.findElement(By.cssSelector("#select2-OnboardingPolicyXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'LATAM-General')]")).click();
		Thread.sleep(1000);
		
		//Select Job
		driver.findElement(By.cssSelector("#select2-JobXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='CSR']")).click();
		Thread.sleep(1000);
		
		//Select Organization
		driver.findElement(By.cssSelector("#select2-OrganizationXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'GT GTC WTC Salary Agent')]")).click();
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.xpath("(//span[contains(text(),'Save')])[1]")).click();
		
		//Wait for Template
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void AddInfo() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Fill out additional information
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		WebElement category = driver.findElement(By.cssSelector("#WorkerCategoryCode"));
		WebElement dayoff = driver.findElement(By.cssSelector("#DaysOff"));
		WebElement hiredate = driver.findElement(By.cssSelector("#HireDate"));
		WebElement passport = driver.findElement(By.cssSelector("#PassportNo"));
		WebElement HomeDept = driver.findElement(By.cssSelector("#HomeDepartmentDescription"));
		WebElement schedHRS = driver.findElement(By.cssSelector("#ScheduleHours"));
		
		category.sendKeys("12345");
		Thread.sleep(1000);
		dayoff.sendKeys("Weekends");
		Thread.sleep(1000);
		hiredate.click();
		Thread.sleep(1000);
		passport.sendKeys("12345");
		Thread.sleep(1000);
		HomeDept.sendKeys("IT Department");
		Thread.sleep(1000);
		schedHRS.sendKeys("2 PM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]")).click();
		
		//Wait for Template
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Verify Action
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Action']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".kt-nav__link-text")).click();
		
		//Wait for Template
		WebElement nav = new WebDriverWait(driver, Duration.ofSeconds(40))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='Navigation Test - Guatemala']")));
		Thread.sleep(2000);
		nav.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btn-select-template")).click();
		
		//Wait for Display Template
		new WebDriverWait(driver, Duration.ofSeconds(45))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void JobEmail() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Clicking Job>Email
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		for(int i = 0; i < 2; i++) {
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
		}
		
		boolean isPresent = false;
		
		do {
			try {
				driver.findElement(By.xpath("//tr[@class='odd']//a[@class='btn btn-sm btn-clean btn-icon btn-icon-md btn-actions']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//a[@id='btn-email'])[1]")).click();
				//Wait for Template
				WebElement email = new WebDriverWait(driver, Duration.ofSeconds(5))
						.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#emailTemplateGroupItem8")));
				email.click();
				isPresent = true;
				Thread.sleep(1000);
			} catch(Exception e) {
				driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
				Thread.sleep(1000);
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".kt-subheader__title")).click();
				Thread.sleep(1000);
				for(int i = 0; i < 2; i++) {
					action.sendKeys(Keys.PAGE_DOWN).build().perform();
					Thread.sleep(1000);
				}
			}
		} while(isPresent == false);
		
		//Close template
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 6)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select Status
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		
		for(int i = 0; i < 2; i++) {
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#status-link-0")).click();
		Thread.sleep(3000);
		Select AppStatus = new Select(driver.findElement(By.cssSelector("#modalStatusDropDown")));
		AppStatus.selectByVisibleText("First Round Interview");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#txtInterviewDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("td[data-date='1706659200000']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#optInterviewTime")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Save changes']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='jconfirm-title']")));
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 7)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Get assessment URL link
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		
		for(int i = 0; i < 2; i++) {
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Get Assessment Link']")).click();
		
		//Wait for assessment
		WebElement assess = new WebDriverWait(driver, Duration.ofSeconds(40))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]")).click();
		Thread.sleep(2000);
		
		//Attachment
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Add Attachment/s']")).click();
		
		//Cancel upload
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=c3bd36eb-6086-444d-bd0e-174d2a304316");
		
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
		driver.findElement(By.xpath("//button[@id='btn-save-applicant']//span[contains(text(),'Save')]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));
		Thread.sleep(2000);
		
		//Clear DF Info
		driver.findElement(By.cssSelector("#select2-OnboardingPolicyXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Select Onboarding Policy Code')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-JobXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Select Job']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-OrganizationXrefCode_Id-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Select Organization']")).click();
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.xpath("//button[@id='btn-save-applicant']//span[contains(text(),'Save')]")).click();
		Thread.sleep(1000);
		
		//Clear additional info
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		WebElement category = driver.findElement(By.cssSelector("#WorkerCategoryCode"));
		WebElement dayoff = driver.findElement(By.cssSelector("#DaysOff"));
		WebElement hiredate = driver.findElement(By.cssSelector("#HireDate"));
		WebElement passport = driver.findElement(By.cssSelector("#PassportNo"));
		WebElement HomeDept = driver.findElement(By.cssSelector("#HomeDepartmentDescription"));
		WebElement schedHRS = driver.findElement(By.cssSelector("#ScheduleHours"));
		
		category.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		dayoff.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		hiredate.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		passport.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		HomeDept.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		schedHRS.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		//Save
		driver.findElement(By.xpath("//button[@id='btn-save-additional-info']//span[contains(text(),'Save')]")).click();
	}
}
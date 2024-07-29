package ATS_CandidateDetails;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Prescreening {
	
	@Test(priority = 1)
	public void SearchName() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select Start Date
		driver.findElement(By.cssSelector("#ats_dt_from")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='datepicker-days'] i[class='la la-angle-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		
		//Entering Name
		driver.findElement(By.cssSelector("#partialName")).sendKeys("Ashley Beverley");
		Thread.sleep(1000);
		
		//Select Location
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Altamonte Springs, Florida']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void SearchEmail() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='ashbev08@gmail.com']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[normalize-space()='Prescreening Candidate List']")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		
		//Delete First Name
		driver.findElement(By.cssSelector("#partialName")).click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		//Enter Email
		WebElement email = driver.findElement(By.cssSelector("#ats_email"));
		email.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ats_email').value = 'ashbev08@gmail.com';");
		Thread.sleep(1000);
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void RecentStatus() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='ashbev08@gmail.com']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ats_email")).click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		//Select Recent Status
		driver.findElement(By.xpath("(//input[@placeholder='Select Options'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'New Applicant')]")).click();
		Thread.sleep(1000);
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void SearchPhoneNo() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='alexismiller184@gmail.com']")));
		Thread.sleep(2000);
		
		//Copy Phone Number
		driver.findElement(By.xpath("(//i[@class='fa fa-fw fa-copy'])[1]")).click();
		Thread.sleep(1000);
		
		//Paste Phone Number
		driver.findElement(By.cssSelector("input[placeholder='E.g: Phone Number']")).click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void JobAdvertisement() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='alexismiller184@gmail.com']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role='textbox'])[3]")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.BACK_SPACE).keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='E.g: Phone Number']")).click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		//Select Job Advertisement
		driver.findElement(By.xpath("(//input[@placeholder='Select Options'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Orlando (CSR)')]")).click();
		Thread.sleep(1000);
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 6)
	public void AdvertisementSrc() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(@class,'kt-nowrap')][contains(text(),'Keyondra')])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role='textbox'])[1]")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.BACK_SPACE).keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".kt-subheader__title")).click();
		Thread.sleep(1000);
		
		//Select Advertisement Source
		driver.findElement(By.xpath("(//input[@placeholder='Select Options'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'ATS')]")).click();
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='lisamendoza91@gmail.com']")));
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		
		//Export
		driver.findElement(By.xpath("//button[normalize-space()='Export']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Excel']")).click();
		Thread.sleep(2000);
		
		//Reset
		driver.findElement(By.xpath("//span[contains(text(),'Reset')]")).click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	@Test(priority = 7)
	public void NewApp() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Api/Dashboard/PrescreeningCandidate");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Create New Applicant
		driver.findElement(By.cssSelector(".btn.btn-brand.btn-elevate.btn-icon-sm.btn-newApplicant")).click();
		Thread.sleep(1000);
		
		//Wait
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Information']")));
		Thread.sleep(2000);
		
		WebElement FirstName = driver.findElement(By.cssSelector("#kt-firstName"));
		WebElement LastName = driver.findElement(By.cssSelector("#kt-lastName"));
		WebElement StreetName = driver.findElement(By.cssSelector("input[placeholder='Street']"));
		WebElement CityName = driver.findElement(By.cssSelector("input[placeholder='City']"));
		WebElement PostalCode = driver.findElement(By.cssSelector("input[placeholder='Postal Code']"));
		WebElement ApartmentNo = driver.findElement(By.cssSelector("input[placeholder='Apartment Number']"));
		WebElement State = driver.findElement(By.cssSelector("input[placeholder='State']"));
		WebElement CountryName = driver.findElement(By.cssSelector("input[placeholder='Country Name']"));
		WebElement PhoneNo = driver.findElement(By.cssSelector("#kt-phoneNo"));
		WebElement Email = driver.findElement(By.cssSelector("#kt-email"));
		
		FirstName.sendKeys("John Michael");
		Thread.sleep(1000);
		LastName.sendKeys("Sampedro");
		Thread.sleep(1000);
		StreetName.sendKeys("Galas Street");
		Thread.sleep(1000);
		CityName.sendKeys("Valenzuela City");
		Thread.sleep(1000);
		PostalCode.sendKeys("1440");
		Thread.sleep(1000);
		ApartmentNo.sendKeys("Blk 11 Lot 25");
		Thread.sleep(1000);
		State.sendKeys("Arizona");
		Thread.sleep(1000);
		CountryName.sendKeys("Philippines");
		Thread.sleep(1000);
		PhoneNo.sendKeys("9395046098");
		Thread.sleep(1000);
		Email.sendKeys("johnmichaelsampedro@gmail.com");
		Thread.sleep(1000);
		
		//Add
		driver.findElement(By.xpath("(//span[contains(text(),'Add')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]")).click();
		Thread.sleep(1000);
		
		//Applicant Information
		
		//Location
		driver.findElement(By.cssSelector("#select2-kt-job-locations-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Altamonte Springs, Florida']")).click();
		Thread.sleep(1000);
		
		//Advertisement Source
		driver.findElement(By.cssSelector("#select2-kt-advertisement-source-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'ATS')]")).click();
		Thread.sleep(1000);
		
		//Job Post
		driver.findElement(By.cssSelector("#select2-kt-jobs-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='4 - Customer Service Representative']")).click();
		Thread.sleep(1000);
		
		//Hire Type
		driver.findElement(By.cssSelector("#select2-applicant-hiretype-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Internal']")).click();
		Thread.sleep(1000);
		
		//Delete
		driver.findElement(By.xpath("(//a[@class='btn btn-danger btn-icon'])[2]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='btn btn-danger btn-icon'])[3]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(2000);
		
		//Save
		driver.findElement(By.xpath("//span[normalize-space()='Create Applicant']")).click();
		Thread.sleep(2000);
	}
}
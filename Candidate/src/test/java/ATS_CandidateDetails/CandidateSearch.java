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

public class CandidateSearch {
	@Test(priority = 1)
	public void name() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/dashboard/candidatesearch#");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select location
		driver.findElement(By.cssSelector("#select2-kt-location-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Altamonte Springs, Florida'] span")).click();
		Thread.sleep(1000);
		
		//Enter name
		driver.findElement(By.cssSelector("#partialName")).sendKeys("Yanarah");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#kt_search")).click();
		
		//Wait for results
		new WebDriverWait(driver, Duration.ofSeconds(45))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'Yanarah')])[1]")));
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void email() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/dashboard/candidatesearch#");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Search by email
		WebElement title = driver.findElement(By.cssSelector(".kt-subheader__title"));
		title.click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#partialName")).click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('ats_email').value = 'johnmichaelsampedro@gmail.com';");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		//Wait for results
		try {
			new WebDriverWait(driver, Duration.ofSeconds(40))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'Final Dev Test2')])[1]")));
			Thread.sleep(2000);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			WebElement copy = driver.findElement(By.xpath("(//i[@class='fa fa-fw fa-copy'])[1]"));
			copy.click();
			Thread.sleep(1000);
			title.click();
			Thread.sleep(1000);
			action.sendKeys(Keys.HOME).build().perform();
			Thread.sleep(1000);
		} catch(Exception e) {
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#select2-kt-location-container")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("li[title='Altamonte Springs, Florida'] span")).click();
			Thread.sleep(1000);
			
			//Enter name
			driver.findElement(By.cssSelector("#partialName")).sendKeys("Yanarah");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#kt_search")).click();
			
			//Wait for results
			new WebDriverWait(driver, Duration.ofSeconds(45))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'Yanarah')])[1]")));
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//i[@class='fa fa-fw fa-copy'])[1]"));
			Thread.sleep(1000);
		}
	}
	
	@Test(priority = 3)
	public void phone() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/dashboard/candidatesearch#");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Search by phone
		WebElement ats_email = driver.findElement(By.cssSelector("#ats_email"));
		ats_email.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		WebElement PhoneNo = driver.findElement(By.cssSelector("input[placeholder='E.g: Phone Number']"));
		PhoneNo.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		//Wait for results
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Ashnica')]")));
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		PhoneNo.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/dashboard/candidatesearch#");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Selecting a status
		driver.findElement(By.xpath("(//span[normalize-space()='Select a Status']"
				+ "//span[@id='select2-kt-status-select-container'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[contains(text(),'In Interview')])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		//Wait for results
		new WebDriverWait(driver, Duration.ofSeconds(45))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Shanice Cook')]")));
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		//Select Disposition
		driver.findElement(By.xpath("(//span[normalize-space()='In Interview']"
				+ "//span[@id='select2-kt-status-select-container'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[contains(text(),'On Hold')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#select2-kt-status-disposition-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Part Time']")).click();
		Thread.sleep(1000);
		
		//Reset
		driver.findElement(By.xpath("//span[contains(text(),'Reset')]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 5)
	public void HireType() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/dashboard/candidatesearch#");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select hire type
		driver.findElement(By.cssSelector("#select2-applicant-hiretype-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='External']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		//Wait for results
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Martha')]")));
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		//Collapse
		for(int i = 0; i < 2; i++) {
			driver.findElement(By.cssSelector(".card-title")).click();
			Thread.sleep(1000);
		}
	}
	
	@Test(priority = 6)
	public void actions() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/dashboard/candidatesearch#");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click Actions column
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		WebElement ellipsis = driver.findElement(By.xpath("(//a[@class='btn btn-sm btn-clean btn-icon btn-icon-md btn-actions'])[1]"));
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-email'])[1]")).click();
		
		//Wait for email template
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Send Email']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		//Select Skill Test Result
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-assign-wave'])[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Grammar']")));
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] "
				+ "div[class='modal-header'] button[type='button']"));
		close.click();
		Thread.sleep(1000);
		
		//Update Wave/Wage Info
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-assign-wave'])[2]")).click();
		
		//Wait for wave
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Requisition Request']")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='modal-dialog modal-dialog-centered'] "
				+ "div[class='modal-header'] button[type='button']")).click();
		Thread.sleep(1000);
		
		//Select Employment Application
		ellipsis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-preview-employment-applications'])[1]")).click();
		
		//Wait for popup
		WebElement okay = new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));
		Thread.sleep(1000);
		okay.click();
	}
}
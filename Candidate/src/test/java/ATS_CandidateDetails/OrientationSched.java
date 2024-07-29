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

public class OrientationSched {
	@Test(priority = 1)
	public void create() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/HR/Orientation");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Create new orientation schedule
		driver.findElement(By.xpath("//span[normalize-space()='Create New Orientation Schedule']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.or(
			ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id='select2-kt-location-modal-select-container'] span")),
			ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id='select2-lineofbusiness-modal-select-container'] span"))));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-kt-location-modal-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Altamonte Springs, Florida'] span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#select2-lineofbusiness-modal-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Nestle Purina - Orlando']")).click();
		Thread.sleep(1000);
		
		//Start Date
		driver.findElement(By.cssSelector("#start-date-input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[contains(text(),'29')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'10')])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='10:30']")).click();
		Thread.sleep(1000);
		
		//End Date
		driver.findElement(By.cssSelector("#end-date-input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[contains(text(),'30')])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'9')])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='9:30']")).click();
		Thread.sleep(1000);
		
		//Capacity
		WebElement cap = driver.findElement(By.cssSelector("#capacity"));
		cap.click();
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"#capacity\").value = '33';");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btn-modal-save")).click();
		Thread.sleep(1000);
		}
	
	@Test(priority = 2)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/HR/Orientation");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Wait for toast message
		new WebDriverWait(driver, Duration.ofSeconds(60))
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".toast-message")));
		Thread.sleep(2000);
		
		//Start Date
		driver.findElement(By.cssSelector("#ats_dt_from")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='datepicker-days'] "
				+ "i[class='la la-angle-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='2']")).click();
		Thread.sleep(1000);
		
		//Select Location
		driver.findElement(By.cssSelector("#select2-kt-location-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Altamonte Springs, Florida'] span")).click();
		Thread.sleep(1000);
		
		//Select Status
		driver.findElement(By.cssSelector("#select2-kt-status-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Open')]")).click();
		Thread.sleep(1000);
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		
		//Wait for results table
		new WebDriverWait(driver, Duration.ofSeconds(40))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='Express - Orlando']")));
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		
		//Program
		driver.findElement(By.cssSelector("#select2-kt-lineofbusiness-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Nestle Purina - Orlando'] span")).click();
		Thread.sleep(1000);
		
		//Search
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'Nestle Purina - Orlando')])[1]")));
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		
		//Reset
		driver.findElement(By.cssSelector("button[id='kt_reset'] span span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
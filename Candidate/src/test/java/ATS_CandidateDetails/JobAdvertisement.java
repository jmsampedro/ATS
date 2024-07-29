package ATS_CandidateDetails;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JobAdvertisement {
	@Test(priority = 1)
	public void newAd() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATSConfig/JobAdvertisement");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click New button
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='New']")).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='General Information']")));
		Thread.sleep(1000);
		
		//Select Group
		Select grp = new Select(driver.findElement(By.id("JobAdvertisementGroup_Id")));
		Thread.sleep(1000);
		grp.selectByIndex(1);
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void toggle() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATSConfig/JobAdvertisement");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click toggle buttons
		driver.findElement(By.xpath("(//div[@class='kittCheckboxOff kittCheckboxPanel']"
				+ "[normalize-space()='Inactive'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='kittCheckboxOff kittCheckboxPanel']"
				+ "[normalize-space()='Inactive'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='kittCheckboxOff kittCheckboxPanel']"
				+ "[normalize-space()='Inactive'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='kittCheckboxOff kittCheckboxPanel']"
				+ "[normalize-space()='Inactive'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='kittCheckboxOff kittCheckboxPanel']"
				+ "[normalize-space()='Inactive'])[5]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void fillOut() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATSConfig/JobAdvertisement");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//creating a reference 
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Fill out information
		//js.executeScript("document.getElementById('Name').value='JM Sampedro';");
		driver.findElement(By.cssSelector("#Name")).sendKeys("JM Sampedro");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#PublishedTitle")).sendKeys("Venezuela Application");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#AddressLine")).sendKeys("Valenzuela City");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#PhoneNumber")).sendKeys("09395046098");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ZipCode")).sendKeys("1440");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='HarverVacancyURL']")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Back to list']")).click();
	}
	
	@Test(priority = 3)
	public void editEntry() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATSConfig/JobAdvertisement");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//creating a reference 
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Edit entry
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//js.executeScript("document.querySelector(\"a[href='/ATSConfig/JobAdvertisement/Edit/1']\").click();");
		driver.findElement(By.xpath("(//a[@class='btn btn-small btn-default'][normalize-space()='Edit'])[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='General Information']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[normalize-space()='General Information']")).click();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Back to list']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//Search field
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Tampa");
		Thread.sleep(1000);
		action.keyDown(Keys.CONTROL).sendKeys("a" + Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
	}
}
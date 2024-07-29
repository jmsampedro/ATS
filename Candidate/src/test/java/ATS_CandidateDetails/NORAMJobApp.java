package ATS_CandidateDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NORAMJobApp {
	@Test(priority = 1)
	public void personalData() throws InterruptedException {
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
		//driver.get("https://ats.dev.web.24-7intouch.com/OnlineForms/EmployeeApplication/Index?query=SJJ19e3xFUgmN55%2bqrU1THYDczcuoL%2fFdI%2fuhELbGkwU9CifKCP6elLFN0K6r556ltPOvy%2bRIYFtgxDxQSxo0B2akahiWfBjeIEMgtUFK%2bh0YqwTRV13V1pruKttQOCkO6I7E5vtvm2LrI6Wg263OTP9P2kiCtfuqHyY79OBZgLCEYzIQ9slux8hJR0bp0M3QW8W7023wRWoDaecb5VxisUJ6cvWgJkZIjtHXcDJZX1X3LbIpiqNwCRNlB4g%2fX7IUc7K%2ffB49%2b0n0YGbl3zHUSQUNUd333t5WS53zFoNTiU%3d");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select Date
		driver.findElement(By.cssSelector("#Availability")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='today day']")).click();
		Thread.sleep(1000);
		
		//Enter Street
		WebElement street = driver.findElement(By.cssSelector("#Street"));
		street.sendKeys("Galas Street");
		Thread.sleep(1000);
		
		//Enter City
		WebElement city = driver.findElement(By.cssSelector("#City"));
		city.sendKeys("Valenzuela City");
		Thread.sleep(1000);
		
		//Enter State
		WebElement state = driver.findElement(By.cssSelector("#State"));
		state.sendKeys("National Capital Region");
		Thread.sleep(1000);
		
		//Select Country
		Select country = new Select(driver.findElement(By.cssSelector("#Country")));
		country.selectByValue("82");
		Thread.sleep(1000);
		
		//Enter Postal Code
		WebElement postalCode = driver.findElement(By.cssSelector("#PostCode"));
		postalCode.sendKeys("1440");
		Thread.sleep(1000);
		
		//Fill out phone number
		WebElement phoneNo = driver.findElement(By.cssSelector("#PhoneNumber"));
		phoneNo.sendKeys("09395046098");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='First Name']")).click();
		Thread.sleep(1000);
		
		//Page down
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		for(int i=0; i<5; i++) {
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);
		}
	}
	
	@Test(priority = 2)
	public void preferredSched() throws InterruptedException {
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
		//driver.get("https://ats.dev.web.24-7intouch.com/OnlineForms/EmployeeApplication/Index?query=SJJ19e3xFUgmN55%2bqrU1THYDczcuoL%2fFdI%2fuhELbGkwU9CifKCP6elLFN0K6r556ltPOvy%2bRIYFtgxDxQSxo0B2akahiWfBjeIEMgtUFK%2bh0YqwTRV13V1pruKttQOCkO6I7E5vtvm2LrI6Wg263OTP9P2kiCtfuqHyY79OBZgLCEYzIQ9slux8hJR0bp0M3QW8W7023wRWoDaecb5VxisUJ6cvWgJkZIjtHXcDJZX1X3LbIpiqNwCRNlB4g%2fX7IUc7K%2ffB49%2b0n0YGbl3zHUSQUNUd333t5WS53zFoNTiU%3d");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Selecting Preferred Schedule
		driver.findElement(By.xpath("(//input[@placeholder='Shift start'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='incrementHour']//span[@class='la la-angle-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Shift end'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='incrementHour']//span[@class='la la-angle-up']")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void skills() throws InterruptedException {
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
		//driver.get("https://ats.dev.web.24-7intouch.com/OnlineForms/EmployeeApplication/Index?query=SJJ19e3xFUgmN55%2bqrU1THYDczcuoL%2fFdI%2fuhELbGkwU9CifKCP6elLFN0K6r556ltPOvy%2bRIYFtgxDxQSxo0B2akahiWfBjeIEMgtUFK%2bh0YqwTRV13V1pruKttQOCkO6I7E5vtvm2LrI6Wg263OTP9P2kiCtfuqHyY79OBZgLCEYzIQ9slux8hJR0bp0M3QW8W7023wRWoDaecb5VxisUJ6cvWgJkZIjtHXcDJZX1X3LbIpiqNwCRNlB4g%2fX7IUc7K%2ffB49%2b0n0YGbl3zHUSQUNUd333t5WS53zFoNTiU%3d");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Add skills
		Select language = new Select(driver.findElement(By.xpath("//select[@class='form-control ats-select-language-skills']")));
		language.selectByValue("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Written']")).click();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		for(int i=0; i<3; i++) {
			action.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(1000);
		}
	}
	
	@Test(priority = 4)
	public void answerQuestions() throws InterruptedException {
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
		//driver.get("https://ats.dev.web.24-7intouch.com/OnlineForms/EmployeeApplication/Index?query=SJJ19e3xFUgmN55%2bqrU1THYDczcuoL%2fFdI%2fuhELbGkwU9CifKCP6elLFN0K6r556ltPOvy%2bRIYFtgxDxQSxo0B2akahiWfBjeIEMgtUFK%2bh0YqwTRV13V1pruKttQOCkO6I7E5vtvm2LrI6Wg263OTP9P2kiCtfuqHyY79OBZgLCEYzIQ9slux8hJR0bp0M3QW8W7023wRWoDaecb5VxisUJ6cvWgJkZIjtHXcDJZX1X3LbIpiqNwCRNlB4g%2fX7IUc7K%2ffB49%2b0n0YGbl3zHUSQUNUd333t5WS53zFoNTiU%3d");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Answer questions
		driver.findElement(By.xpath("(//span)[46]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[52]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#text-902")).sendKeys("Not Applicable");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[56]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#text-904")).sendKeys("Not Applicable");
		Thread.sleep(1000);
	}
	
	@Test(priority = 5)
	public void educHistory() throws InterruptedException {
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
		//driver.get("https://ats.dev.web.24-7intouch.com/OnlineForms/EmployeeApplication/Index?query=SJJ19e3xFUgmN55%2bqrU1THYDczcuoL%2fFdI%2fuhELbGkwU9CifKCP6elLFN0K6r556ltPOvy%2bRIYFtgxDxQSxo0B2akahiWfBjeIEMgtUFK%2bh0YqwTRV13V1pruKttQOCkO6I7E5vtvm2LrI6Wg263OTP9P2kiCtfuqHyY79OBZgLCEYzIQ9slux8hJR0bp0M3QW8W7023wRWoDaecb5VxisUJ6cvWgJkZIjtHXcDJZX1X3LbIpiqNwCRNlB4g%2fX7IUc7K%2ffB49%2b0n0YGbl3zHUSQUNUd333t5WS53zFoNTiU%3d");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select school
		Select school = new Select(driver.findElement(By.xpath("//select[@class='form-control ats-select ats-select-type-of-school ats-education-history-fields']")));
		school.selectByValue("2");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-input-name='NameOfSchool']")).sendKeys("FEU Institute of Technology");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-input-name='Course']")).sendKeys("BSECE");
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void employHistory() throws InterruptedException {
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
		//driver.get("https://ats.dev.web.24-7intouch.com/OnlineForms/EmployeeApplication/Index?query=SJJ19e3xFUgmN55%2bqrU1THYDczcuoL%2fFdI%2fuhELbGkwU9CifKCP6elLFN0K6r556ltPOvy%2bRIYFtgxDxQSxo0B2akahiWfBjeIEMgtUFK%2bh0YqwTRV13V1pruKttQOCkO6I7E5vtvm2LrI6Wg263OTP9P2kiCtfuqHyY79OBZgLCEYzIQ9slux8hJR0bp0M3QW8W7023wRWoDaecb5VxisUJ6cvWgJkZIjtHXcDJZX1X3LbIpiqNwCRNlB4g%2fX7IUc7K%2ffB49%2b0n0YGbl3zHUSQUNUd333t5WS53zFoNTiU%3d");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Enter previous company
		driver.findElement(By.cssSelector("input[data-input-name='NameOfCompany']")).sendKeys("Denso Techno Philippines, Inc.");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[data-input-name='PositionHeld']")).sendKeys("Software Engineer");
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#ats_dt_from")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).click();
		Thread.sleep(1000);
		
		for(int i=0; i<5; i++) {
			driver.findElement(By.cssSelector("div[class='datepicker-months'] th[class='prev']")).click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//span[normalize-space()='May']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#ats_dt_to")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).click();
		Thread.sleep(1000);
		
		for(int j=0; j<3; j++) {
			driver.findElement(By.cssSelector("div[class='datepicker-months'] th[class='prev']")).click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Nov']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Name of Company / Employer']")).click();
		Thread.sleep(1000);
		
		//Save draft
		//driver.findElement(By.xpath("//span[contains(text(),'Save as Draft')]")).click();
	}
}
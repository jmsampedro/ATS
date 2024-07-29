package ATS_CandidateDetails;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PH {
	@Test(priority = 1)
	public void hover() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Dashboard/Edit?applicantId=b4d0788c-ff50-48a8-89f2-5e8823a45b3b");
		
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
}
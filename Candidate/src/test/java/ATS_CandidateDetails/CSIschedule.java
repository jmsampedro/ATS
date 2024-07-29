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

public class CSIschedule {
	@Test(priority = 1)
	public void filter() throws InterruptedException {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/CSI/Schedule");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Click Start Date
		driver.findElement(By.cssSelector("#ats_dt_from")).click();
		Thread.sleep(1000);
		
		for(int i = 0; i < 3; i++) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='prev']")).click();
			Thread.sleep(1000);
		}
		
		//Select Start Date
		driver.findElement(By.xpath("//td[normalize-space()='14']")).click();
		Thread.sleep(1000);
		
		//Select Status
		driver.findElement(By.cssSelector("#select2-kt-status-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Open')]")).click();
		Thread.sleep(1000);
		
		//Select Location
		driver.findElement(By.cssSelector("#select2-kt-location-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Clearwater, Florida']")).click();
		Thread.sleep(1000);
		
		//Search
		WebElement search = driver.findElement(By.xpath("//span[normalize-space()='Search']"));
		search.click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'Traeger Grills Tampa')])[1]")));
		
		//Select Program
		driver.findElement(By.cssSelector("#select2-kt-lineofbusiness-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Traeger Grills - Tampa'] span")).click();
		Thread.sleep(1000);
		search.click();
	}
}
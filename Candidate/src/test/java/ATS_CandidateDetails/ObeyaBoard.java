package ATS_CandidateDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ObeyaBoard {
	@Test(priority = 0)
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		WebElement NotStarted = driver.findElement(By.xpath("//h3[normalize-space()='Not Started']"));
		WebElement InProgress = driver.findElement(By.xpath("//h3[normalize-space()='In Progress']"));
		WebElement priority = driver.findElement(By.xpath("//h3[normalize-space()='Priority']"));
		WebElement complete = driver.findElement(By.xpath("//h3[normalize-space()='Complete']"));
		
		//Hover activities
		action.moveToElement(NotStarted).perform();
		Thread.sleep(1000);
		action.moveToElement(InProgress).perform();
		Thread.sleep(1000);
		action.moveToElement(priority).perform();
		Thread.sleep(1000);
		action.moveToElement(complete).perform();
		Thread.sleep(1000);
		
		//Click location
		for(int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("(//span[@id='select2-kt-location-select-container'])[1]")).click();
			Thread.sleep(1000);
		}
		
		//Click Export
		driver.findElement(By.xpath("//button[normalize-space()='Export']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='kt-nav__link-text']")).click();
		Thread.sleep(1000);
		
		//Click Tabular
		driver.findElement(By.xpath("//a[normalize-space()='Tabular']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='btn btn-sm btn-clean btn-icon btn-icon-md btn-actions'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='btn-view'])[1]")).click();
		Thread.sleep(1000);
	}
}
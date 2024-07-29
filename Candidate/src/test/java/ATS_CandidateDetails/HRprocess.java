package ATS_CandidateDetails;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HRprocess {
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
		//driver.get("https://kitt.dev.web.intouchcx.com/ATS/Obeyaboard/Waveroster/11474");
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		
		//Select Location
		driver.findElement(By.cssSelector("#select2-kt-location-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Altamonte Springs, Florida'] span")).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(text(),'External')])[1]")));
		Thread.sleep(1000);
		
		//Select Line of Business
		driver.findElement(By.cssSelector("#select2-kt-lineofbusiness-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Express - Orlando'] span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Select Wave
		driver.findElement(By.cssSelector("#select2-kt-wave-select-container")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[title='Express - Orlando 104'] span")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
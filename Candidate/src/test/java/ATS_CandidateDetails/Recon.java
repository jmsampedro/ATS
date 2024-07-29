package ATS_CandidateDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Recon {
	@Test(priority = 1)
	public void recon() throws InterruptedException {
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
	}
}

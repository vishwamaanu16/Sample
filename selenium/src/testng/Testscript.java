package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testscript
{
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Pomclass pmc=new Pomclass(driver);
		pmc.username("Hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		pmc.username("Hello");
	}

}

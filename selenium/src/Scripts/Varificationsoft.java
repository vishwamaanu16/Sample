package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Varificationsoft 
{
	@Test
	public void softverify()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		SoftAssert sft=new SoftAssert();
		sft.assertEquals(title, "Facebook – log in or up");
		driver.findElement(By.id("email")).sendKeys("vishwa");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		sft.assertAll();
	}
	

}

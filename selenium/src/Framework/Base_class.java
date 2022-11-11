package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class 
{
public static WebDriver driver;
public static WebDriverWait wait;

@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://demoqa.com/text-box");
	wait=new WebDriverWait(driver, 10);
}
	
@AfterMethod
public void closeapp()
{
	driver.close();
}

}

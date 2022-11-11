package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_1 extends Base_class
{
	@Test
	public void demoqa()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys("vishwa");
		Reporter.log("Username Entered...", true);
		driver.findElement(By.id("userEmail")).sendKeys("vishwa@22.com");
		Reporter.log("UserEmail Entered...", true);
		driver.findElement(By.id("currentAddress")).sendKeys("kaverinagar");
		Reporter.log("Current add Entered...", true);
		driver.findElement(By.id("permanentAddress")).sendKeys("Hassan");
		Reporter.log("Permanent add Entered...", true);
		driver.findElement(By.id("submit")).click();
		Reporter.log("All the data is submitted...", true);
	}
	

}

package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Firstscript 
{
	@Test
	public void test()
	{
		Reporter.log("Beginning of Framework", true);
	}
	@Test
	public void test1()
	{
		Reporter.log("End of framewok", false);
	}
}

package testng;

import org.testng.annotations.Test;

public class Prioritytestscript 
{
	@Test(priority=1,invocationCount = 4)
	public void signup()
	{
		System.out.println("HI I AM SIGNUP");
	}
	@Test(priority=2,invocationCount = 3)
	public void login()
	{
		System.out.println("HI I AM LOGIN");
	}
	@Test(priority=3,invocationCount = 2)
	public void cart()
	{
		System.out.println("HI I AM CART");
	}
	@Test(priority=4)
	public void logout()
	{
		System.out.println("HI I AM LOGOUT");
	}
	

}

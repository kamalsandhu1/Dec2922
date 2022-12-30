package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void Demo4() {
		System.out.println("44444444");
	}

	@BeforeMethod
	public void Demoo()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void Demoo1()
	{
		System.out.println("After method");
	}
	
	@Test(groups = {"Smoke"})
	public void Demo5() {
		System.out.println("5555");
	}
	
	@BeforeSuite
	public void Demo7()
	{
		System.out.println("before suite");
	}

	@BeforeTest
	public void Demo6()
	{
		System.out.println("this should run first");
	}
	
}

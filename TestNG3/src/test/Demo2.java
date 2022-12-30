package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	
	@AfterSuite
	public void Demo8()
	{
		System.out.println("After suite");
	}
	
	@Parameters({"URL"})
	@Test
	public void demo3(String urlLink)
	{
		System.out.println("Hello3");
		System.out.println(urlLink);
	}

}

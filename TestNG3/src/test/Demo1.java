package test;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void Demo() {
		
		System.out.println("hello");
		
	}
	
	@Test(groups = {"Smoke"})
	public void Demo2()
	{
		System.out.println("hello2");
		
	}
	
	
	
	

}

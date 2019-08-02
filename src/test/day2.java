package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 extends TestBase {

	
	@BeforeTest(groups={"Smoke"})
	public void ploan() throws IOException
	{
		
		login();
		
		System.out.println("good");
	}
	
	@Test
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}

package package3;

import org.testng.annotations.Test;

public class ProductTest{
	@Test
	public void createProductTest()
	{
		
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	
		System.out.println("Execute create product");
	}
	@Test
	public void createProductWithPhnNoTest()
	{
		System.out.println("Execute create product with Phn no");
	}

}

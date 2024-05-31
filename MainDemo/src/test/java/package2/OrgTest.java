package package2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="Smoke Test")
	public void createOrgTest()
	{
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute create org");
	}
	@Test(groups="Regression Test")
	public void createOrgWithDateTest()
	{
		System.out.println("Execute create org with date");
	}
}

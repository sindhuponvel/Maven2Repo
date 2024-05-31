package package2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="Smoke Test")
	public void createOrgTest()
	{
		System.out.println("Execute create org");
	}
	@Test(groups="Regression Test")
	public void createOrgWithDateTest()
	{
		System.out.println("Execute create org with date");
	}
}

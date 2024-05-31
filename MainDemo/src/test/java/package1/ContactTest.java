package package1;

import org.testng.annotations.Test;

public class ContactTest {
    @Test(groups="Smoke Test")
    public  void createContactTest()
    {
    	System.out.println("Execute create contact");
    }
    @Test
    public void createContactWithPhnNoTest()
    {
    	System.out.println("Execute create contact with Phone number");
    }
}

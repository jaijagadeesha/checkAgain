package checkBasics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckBasicsTestNG {
	WebDriver driver=null;
	@Test
	public void testNc() {
		System.out.println("check");
	}
	@Test
	public void testBrowser()
	{
		System.out.println("Checked every thing");
	}
@Test(priority = 2)
public void checkpriority()
{
	
}
}

package test;

import org.testng.annotations.Test;

import source.IncorrectloginPage;
import source.launchQuit;

public class TestCase3  extends launchQuit 
{
	@Test
	public void LoginPage()
	{
	IncorrectloginPage h2 = new IncorrectloginPage(driver);
	h2.aandlist(driver);
	h2.signInnew();
	h2.username();
	h2.continuebutton();
	h2.password();
	h2.signIn();
	
}
}
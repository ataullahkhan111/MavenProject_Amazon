package test;

import org.testng.annotations.Test;

import source.LoginPage;
import source.launchQuit;

public class TestCase2 extends launchQuit 
{
	@Test
	public void LoginPage()
	{
	LoginPage h2 = new LoginPage(driver);
	h2.aandlist(driver);
	h2.signInnew();
	h2.username();
	h2.continuebutton();
	h2.password();
	h2.signIn();
	
}
}
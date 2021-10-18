package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
@Test
public class CreateLead extends ProjectSpecificMethods{
	public void runCreateLead()
	{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeads()
		.clickCreateLeadlink()
		.enterCopanyName()
		.enterFirstName()
		.enterLastname()
		.createLeadButton()
		.verifyFirstName();
	}
	

}


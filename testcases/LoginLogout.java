package testcases;

import pages.LoginPage;
import pages.HomePage;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class LoginLogout extends ProjectSpecificMethods {
@Test
	public void runLogin()
	{
		LoginPage lp= new LoginPage();
		lp.enterUsername().enterPassword().clickLoginButton().clickLogoutButton();
		
		/*
		 * lp.enterPassword(); lp.clickLoginButton();
		 * 
		 * HomePage hp=new HomePage(); hp.clickLogoutButton();
		 */
	}
}

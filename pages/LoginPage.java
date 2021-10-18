package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return new LoginPage();
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	
	public HomePage clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		/*
		 * HomePage hp=new HomePage(); return hp;
		 */
		
		return new HomePage();
	}
	
}

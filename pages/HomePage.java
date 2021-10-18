package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public LoginPage clickLogoutButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}
	
	public MyHomePage clickCrmsfaLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	public HomePage verifyHomePage()
	{
		boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
}


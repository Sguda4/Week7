package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	public CreateLeadPage clickCreateLeadlink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
		
		
	}

}

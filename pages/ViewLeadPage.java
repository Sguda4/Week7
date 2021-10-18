package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyFirstName()
	{
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals("Hari123", text);
		return this;
	}
}

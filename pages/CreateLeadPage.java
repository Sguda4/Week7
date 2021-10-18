package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage enterCopanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");	
		return this;
	}
   public CreateLeadPage enterFirstName()
   {
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari123");
	   return this;
   }
   public CreateLeadPage enterLastname()
   {
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	   return this;
   }
   public ViewLeadPage createLeadButton()
   {
	   driver.findElement(By.name("submitButton")).click();
	   return new ViewLeadPage();
   }
}

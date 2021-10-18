package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.cucumber.messages.internal.com.google.protobuf.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	
	@BeforeTest
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}

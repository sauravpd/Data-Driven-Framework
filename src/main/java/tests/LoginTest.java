package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase
{

	@Test
	public void testLogin()
	{
		driver.findElement(By.name(OR.getProperty("username"))).sendKeys("admin");
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.xpath(OR.getProperty("submit"))).click();
		driver.findElement(By.xpath(OR.getProperty("logout"))).click();
	}

}

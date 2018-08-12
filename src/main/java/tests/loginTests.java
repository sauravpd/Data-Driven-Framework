package tests;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.DataProviderUtil;
import utilities.ExcelUtil;

public class loginTests extends TestBase
{
	@Test(dataProviderClass = DataProviderUtil.class, dataProvider = "testData")
	public void LoginTest(Hashtable<String,String> data)
	{
		if(!(ExcelUtil.isTestRunnable("BankLoginTest","testSuite")))
		{
			throw new SkipException("Skipping the test "+this.getClass()+ "as the Run mode is NO");
		}
		driver.findElement(By.name(OR.getProperty("username"))).sendKeys(data.get("Username"));
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys(data.get("Password"));
		driver.findElement(By.xpath(OR.getProperty("submit"))).click();
		driver.findElement(By.xpath(OR.getProperty("logout"))).click();
	}

}

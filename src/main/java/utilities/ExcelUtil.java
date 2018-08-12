package utilities;

import base.TestBase;

/**
 * 
 * @author saurav
 *
 */
public class ExcelUtil extends TestBase
{
	/**
	 * 
	 * @param testName
	 * @param excel
	 * @return
	 */
	public static boolean isTestRunnable(String testName,String sheetName)
	{
		int rows = excel.getRowCount(sheetName);

		for(int rNum=2; rNum<=rows; rNum++){

			String testCase = excel.getCellData(sheetName, "TCID", rNum);

			if(testCase.equalsIgnoreCase(testName)){

				String runmode = excel.getCellData(sheetName, "Runmode", rNum);

				if(runmode.equalsIgnoreCase("Y"))
					return true;
				else
					return false;
			}
		}
		return false;
	}
}

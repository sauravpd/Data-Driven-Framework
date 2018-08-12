package utilities;

/**
 * 
 * @author saurav
 *
 */
public class ExcelUtil 
{
	/**
	 * 
	 * @param testName
	 * @param excel
	 * @return
	 */
	public static boolean isTestRunnable(String testName,String sheetName, ExcelReader excel)
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

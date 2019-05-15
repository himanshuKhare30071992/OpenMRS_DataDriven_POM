package org.openMRS.patient.testUtility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil
{
	static String testDataSheetPath = "C:\\Users\\HK-SONY\\Selenium_Eclipse_Workspace\\OpenMRS_DataDrivenTesting_POM\\src\\main\\java\\org\\openMRS\\patient\\testData\\OpenMRS_DDT.xlsx";
	static File file;
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int rowCount;
	static String columnName;
	static String cellData;
	
	
	public static void readExcel(String sheetName)  
	{
		file = new File(testDataSheetPath);
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetName);
	}	
	
	
	public static int rowCount()
	{
		rowCount = sheet.getLastRowNum();
		return rowCount;
	}
	
	
	public static int columnCount()
	{
		int columnCount = sheet.getRow(1).getLastCellNum();
		return columnCount;
	}
	
	public static String getCellData(int rowNo, int columnNo)
	{
		String data  =  sheet.getRow(rowNo).getCell(columnNo).getStringCellValue();
		return data;
	}
	
	
	public static void getColumnNames(String sheetName)
	{
		XSSFRow row = sheet.getRow(1); // RowNo is fixed for Column Names
		int colCount = TestUtil.columnCount();
		System.out.println("Total Column Count => "+colCount);
		
		for (int i = 0; i < colCount; i++) 
		{
			XSSFCell cell = row.getCell(i);
			columnName = cell.getStringCellValue();
			System.out.println(columnName);
		}
	}
	
	public static String getColumnData(String colName)
	{
		XSSFRow row = sheet.getRow(1); // RowNo is fixed for Column Names
		int colCount = TestUtil.columnCount();
		//System.out.println("Total Column Count => "+colCount);
		
		for (int i = 0; i < colCount; i++) 
		{
			XSSFCell cell = row.getCell(i);
			if(cell.getCellTypeEnum()==CellType.NUMERIC)
			{
				columnName = String.valueOf(cell.getNumericCellValue());
			}
			else 
			{
				columnName = cell.getStringCellValue().trim();
				//System.out.println(columnName+colName);
				
				if(columnName.equalsIgnoreCase(colName))
				{
					cellData = sheet.getRow(2).getCell(i).toString().trim();
					//System.out.println(+i+") "+colName+" = "+cellData);
					break;
				}
			}
			//return cellData;
		}
		return cellData;
	}
		
	
	
	
	
	
	
	
	
	
}

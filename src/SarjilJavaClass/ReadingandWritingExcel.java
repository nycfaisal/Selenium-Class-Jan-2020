package SarjilJavaClass;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingandWritingExcel {

	public static void main (String [] args) throws IOException
	{
		File xlfile = new File ("/Users/faisalmohammad/Desktop/forcoding.xlsx");
		FileInputStream xlFIS = new FileInputStream(xlfile);
		
		//xls = HSSF and xlsx =  XSSF //reading the file
		XSSFWorkbook workbook= new XSSFWorkbook(xlFIS);
		//reading the directory sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		/*XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(cell.getNumericCellValue());
		
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		xlFIS.close();
		
		FileOutputStream xlFOS = new FileOutputStream(xlfile);
		for (int i =0; i<row.getHeight(); i++){
		row.createCell(2).setCellValue("Passed");
		workbook.write(xlFOS);
		}
		xlFOS.close();*/
		
		//read and write multiple data set
		//created object for rows and cells
		String string = "STRING";
		XSSFRow objrow;
		XSSFCell objcell;
		//trying to find out the last row number
		System.out.println(sheet.getLastRowNum());
		//loop 1st row to last row
		for (int j=1; j<sheet.getLastRowNum(); j++)
		{	// 
			objrow = sheet.getRow(j);
			objcell = objrow.getCell(0);
			if (objcell.getCellTypeEnum().equals(string)){
			System.out.println(objcell.getStringCellValue());
			}
			else
			{
				System.out.println(objcell.getNumericCellValue());
			}
			objcell = objrow.getCell(1);
			if (objcell.getCellTypeEnum().equals(string)){
				System.out.println(objcell.getStringCellValue());
				}
				else
				{
					System.out.println(objcell.getNumericCellValue());
				}
			
			objcell = objrow.createCell(2);
			objcell.setCellValue("Pass");
					
		}
		FileOutputStream xlFOS = new FileOutputStream(xlfile);
		workbook.write(xlFOS);
		xlFOS.close();
		xlFIS.close();
		
	}
}

package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ReadExcelFile 
{
 
 public static void main(String[] args) throws IOException,FileNotFoundException 
 {
 
 // To locate the path of excel file.
 //FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + "\\input.xlsx"));
	 try
	 {
	 File f=new File("d:/Hi1.xlsx");
	 
	 System.out.println(f.getAbsolutePath());
	 
	 System.out.println(f.exists());
	 
	//System.out.println(f.exists());
		 FileInputStream file = new FileInputStream(f);
	 
	 // Initialize the excel file as a workbook.
	 XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	 // initialize the Excel Sheet of the workbook, (0) denotes first sheet of the
	 // workbook.
	 XSSFSheet sheet = workbook.getSheetAt(0);
	 
	 // 0 denotes to first row and first cell of the excel sheet.
	 String str = sheet.getRow(0).getCell(0).getStringCellValue();
	 System.out.println("String Fetch from Excel:- "+str);
	 
	 // 1 denotes to Second row and 0 denotes first cell of the excel sheet.
	 Number num = sheet.getRow(1).getCell(0).getNumericCellValue();
	 System.out.println("Number Fetch from Excel:- "+num);
	 
	 // close the excel file.
	 file.close();
	 
	 
	 
	 
	 
	 
	 
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage());
	 }
	 
	
 
 }
}
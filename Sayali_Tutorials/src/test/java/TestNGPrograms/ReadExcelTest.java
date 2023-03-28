package TestNGPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelTest {
  @Test
  public void ReadExcel() throws IOException {
	  
	  FileInputStream srcfile = new FileInputStream("C:\\Users\\Sharayu\\Downloads\\Employee.xlsx");
	  
	  XSSFWorkbook wb= new XSSFWorkbook(srcfile);
	  
	  XSSFSheet sheet = wb.getSheetAt(0);
	  
	  System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	  System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	  System.out.println(sheet.getRow(0).getCell(3).getStringCellValue());
	  
	  System.out.println(sheet.getRow(1).getCell(0).getNumericCellValue());
	  System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
	  System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
	  System.out.println(sheet.getRow(1).getCell(3).getNumericCellValue());
	  
	  System.out.println(sheet.getRow(2).getCell(0).getNumericCellValue());
	  System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
	  System.out.println(sheet.getRow(2).getCell(2).getStringCellValue());
	  System.out.println(sheet.getRow(2).getCell(3).getNumericCellValue());
	  
  }
}

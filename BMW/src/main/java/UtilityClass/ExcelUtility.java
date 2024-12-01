package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public void excelwrite(int c, String speed) throws IOException{

		File f=new File("C:\\844888\\BMW\\src\\test\\resources\\TestData\\cardata.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		XSSFRow r=sh.getRow(0);
		
		FileOutputStream fos= new FileOutputStream(f);
		XSSFCell c1=r.createCell(1);
		c1.setCellValue(speed);
		wb.write(fos);
	}
}

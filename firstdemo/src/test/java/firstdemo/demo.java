package firstdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\firstdemo\\excelsheet\\adactin hotel.xlsx");
		FileInputStream st= new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(st);
		org.apache.poi.ss.usermodel.Sheet s=workbook.getSheet("Sheet1");


		Row r = s.getRow(4);
		for (int i=0;i<r.getPhysicalNumberOfCells();i++) {

			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			switch(type) {
			case STRING:
				String stringCellValue = c.getStringCellValue();
				System.out.println(stringCellValue);
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat s1=new SimpleDateFormat("dd\\MMM\\yy");  
					String g = s1.format(dateCellValue);
					System.out.println(g);
				}else {
					double numericCellValue = c.getNumericCellValue();
					BigDecimal bigDecimal = BigDecimal.valueOf(numericCellValue);
					BigInteger string = bigDecimal.toBigInteger();
					System.out.println(string);
					break;
				}

			}
		}}
}

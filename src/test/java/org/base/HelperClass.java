package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.metrics.data.Data;

public class HelperClass {
	
public static	WebDriver driver;

public static String name;
	public static void launchChromeBrower() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	}

	public static void maxi() {
		driver.manage().window().maximize();
	}
	
	public static void mini() {
		driver.manage().window().minimize();

	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void fillText(WebElement txt,String value) {
		txt.sendKeys(value);
	}
	
	
	public static  void btnClick(WebElement btn) {
		
		btn.click();
	}
	
	public static  void tile() {
		String a = driver.getTitle();
		System.out.println(a);
	}
	
	public static void browerClose() {
		
		driver.quit();
	}
	
	public static void dateAndTime() {
		Date d=new Date();
     System.out.println(d);
	}
	
	public static String sheet(String sheetname,int rowno,int cellno) throws IOException {
		File f =new File("C:\\Users\\zubee\\ClassWorkSpace\\Mvn6pm\\sheets\\newsheet.xlsx");
		
		FileInputStream fi= new FileInputStream(f);
		
		Workbook book= new XSSFWorkbook(fi);
		
		Sheet sh = book.getSheet(sheetname);
		
		Row r = sh.getRow(rowno);
				
		Cell c = r.getCell(cellno);
		
		int type = c.getCellType();
		if (type==1) {
			 name = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat s= new SimpleDateFormat("dd, MMMM, yyyy");
			name = s.format(da);
		}
		else {
			double d = c.getNumericCellValue();
			long l= (long)d;
			name = String.valueOf(l);
			
		}
		
		return name;
		
	}
	
	
	
	
	
}

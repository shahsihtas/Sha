package Ajo;

import java.io.*;
import java.text.*;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Anu {
	public static void main(String[] args) throws Throwable {
		File f= new File ("C:\\Users\\amd\\Desktop\\Excel Read.xlsx");
		FileInputStream f1 =new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s= w.createSheet("Excel1");
		Row r=s.createRow(0);
		for (int i=0;i<10;i++) {
			Cell cl=r.createCell(i);
			cl.setCellValue("Sathish");
		}
		FileOutputStream f2 = new FileOutputStream(f);
		w.write(f2);
		f2.close();
	}
}
		
		
		
		
		
//		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
//			Row r=s.getRow(i);
//			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
//			Cell c=r.getCell(j);
//		int cellType=c.getCellType();
//		if (cellType==1) {
//			String value=c.getStringCellValue();
//			System.out.println(value);
//		}
//		else if (cellType==0) {
//			if(DateUtil.isCellDateFormatted(c)) {
//				Date d=c.getDateCellValue();
//				SimpleDateFormat sd =new SimpleDateFormat("MMM/d/yyyy");
//				String value =sd.format(d);
//				System.out.println(value);
//			}
//			else {
//				double d=c.getNumericCellValue();
//				long l=(long)d;
//				String value =String.valueOf(l);
//				System.out.println(value);
//			}
//		}
//		}}
//}}

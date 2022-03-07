package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {

	public static void Data_Write() throws Throwable {

		File f = new File("E:\\Data Driven Working\\write.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("test1").createRow(0).createCell(0).setCellValue("Username");
		wb.getSheet("test1").getRow(0).createCell(1).setCellValue("Pin");
		wb.getSheet("test1").getRow(0).createCell(2).setCellValue("Date");

		wb.getSheet("test1").createRow(1).createCell(0).setCellValue("Kartee");
		wb.getSheet("test1").getRow(1).createCell(1).setCellValue(123);
		wb.getSheet("test1").getRow(1).createCell(2).setCellValue(12 / 12 / 2021);

		wb.getSheet("test1").createRow(2).createCell(0).setCellValue("Ajith");
		wb.getSheet("test1").getRow(2).createCell(1).setCellValue(12345);
		wb.getSheet("test1").getRow(2).createCell(2).setCellValue(11 / 12 / 2021);
	
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();		
		System.out.println("Write Succesfully");
	}
	
	public static void main(String[] args) throws Throwable {
		Data_Write();
	}

}

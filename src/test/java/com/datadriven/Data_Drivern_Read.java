package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Drivern_Read{
	
	public static  void getParticularData() throws Throwable {
		
		File f = new File("E:\\Data Driven Working\\Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Cell cell = wb.getSheetAt(0).getRow(2).getCell(4);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}wb.close();
	}
	
	public static void getAllData() throws Throwable {
		
		File f = new File("E:\\Data Driven Working\\Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				if (type.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}else if (type.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);
				}
			}
			
		}
		wb.close();

	}
	public static void getParticularRow() throws Throwable {
		File f = new File("E:\\Data Driven Working\\Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(7);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}else if (cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			
		}wb.close();
	}
	public static void getParticularColumnData() throws IOException {
		File f = new File("E:\\Data Driven Working\\Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(4);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}else if (cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}wb.close();

	}
	
	
	public static void main(String[] args) throws Throwable {
	getParticularData();
	getAllData();
	getParticularRow();
	getParticularColumnData();
	
	}

}

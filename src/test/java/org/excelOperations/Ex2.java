package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("** Program Starts **");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet
		Sheet s1 = wb.getSheet("AllStringTypes");
		int lastRowNum = s1.getLastRowNum();
		System.out.println("lastRowNum : "+lastRowNum);
		
		int physicalNoOfRows = s1.getPhysicalNumberOfRows();
		System.out.println("physicalNoOfRows : "+physicalNoOfRows);
		//Row
		Row r1 = s1.getRow(0);
		int lastCellNum = r1.getLastCellNum();
		System.out.println("lastCellNum : "+lastCellNum);
		
		int physicalNoOfCell = r1.getPhysicalNumberOfCells();
		System.out.println("physicalNoOfCell : "+physicalNoOfCell);
		System.out.println("** Program Ends **");
	}
}
package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("** Program Starts **");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("WriteCellData");
		
		Row r1 = s1.getRow(1);
//		Cell c1 = r1.getCell(4);
		Cell c1 = r1.createCell(4);
		c1.setCellValue("Pass");
		FileOutputStream fos = new FileOutputStream("./excelFiles/TestData.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("** Program Ends **");
	}
}
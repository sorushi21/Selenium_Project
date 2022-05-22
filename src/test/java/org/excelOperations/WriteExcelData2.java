package org.excelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("** Program Starts **");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("WriteCellData");
		
		for(int i=1; i<=s1.getLastRowNum(); i++) {
			s1.getRow(i).createCell(4).setCellValue("Pass");
		}
//		s1.getRow(1).createCell(4).setCellValue("Pass");
//		s1.getRow(2).createCell(4).setCellValue("Pass");
//		s1.getRow(3).createCell(4).setCellValue("Fail");
		
		FileOutputStream fos = new FileOutputStream("./excelFiles/TestData.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("** Program Ends **");
	}
}
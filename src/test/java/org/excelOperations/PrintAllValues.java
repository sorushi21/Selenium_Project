package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllValues {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("** Program Starts **");
		//Step 1
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		//Step 2
		Workbook wb = WorkbookFactory.create(fis);
		//Step 3: Sheet
		Sheet s1 = wb.getSheet("AllStringTypes");
		//Step 4: Row
//		Row r1 = s1.getRow(1);
		//Step 5: Cell
//		Cell c1 = r1.getCell(3);
//		System.out.println(c1.getStringCellValue());
//		Row r=null;
//		Cell c=null;
		for(int i=1; i<=s1.getLastRowNum(); i++) {
			for(int j=0; j<s1.getRow(i).getLastCellNum(); j++) {
				System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		System.out.println("** Program Ends **");
	}
}
//Code for reference:
//for(int i=1; i<=s1.getLastRowNum(); i++) {
//	r = s1.getRow(i);
//	for(int j=0; j<r.getLastCellNum(); j++) {
//		c = r.getCell(j);
//		System.out.println(c.getStringCellValue());
//	}
//	System.out.println();
//}
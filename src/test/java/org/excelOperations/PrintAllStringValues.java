package org.excelOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllStringValues {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("** Program Starts **");
		FileInputStream fis = new FileInputStream("./excelFiles/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllDataTypes");
		for(int i=1; i<=s1.getLastRowNum(); i++) {
			for(int j=0; j<s1.getRow(i).getLastCellNum(); j++) {
//				System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
//				System.out.println(s1.getRow(i).getCell(j).getCellType());
				CellType ct = s1.getRow(i).getCell(j).getCellType();
				switch(ct) {
					case STRING: System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
						break;
					case NUMERIC: 
						if(DateUtil.isCellDateFormatted(s1.getRow(i).getCell(j))) {
							SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//							String dob = sdf.format(s1.getRow(i).getCell(j).getDateCellValue());
							System.out.println(sdf.format(s1.getRow(i).getCell(j).getDateCellValue()));
						} else {
							System.out.println((long)(s1.getRow(i).getCell(j).getNumericCellValue()));
						}
						break;
					case FORMULA: System.out.println(s1.getRow(i).getCell(j).getCellFormula());
						break;
					case BOOLEAN: System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
						break;
					case BLANK: System.out.println("Cell is balnk!!!");
						break;
					default: System.out.println("Invalid Cell Type!!!");
				}
			}
			System.out.println();
		}
		System.out.println("** Program Ends **");
	}
}
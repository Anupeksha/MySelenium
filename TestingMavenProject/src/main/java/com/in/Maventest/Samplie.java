package com.in.Maventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;

public class Samplie 
{

	//@SuppressWarnings("resource")
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		String path = "/home/anu/workspace/New_Eclipse/TestingMavenProject/Data.xlsx";
		FileInputStream fis=new FileInputStream(new File(path));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (Row row : sheet)
		{
			System.out.println();
			for(Cell cell:row)
			{
				System.out.print("\t");
				System.out.print(cell.getStringCellValue());
			}
		}

		Xls_Reader xls= new Xls_Reader(path);
		String s = xls.getCellData("LoginTest",2,3);
		System.out.println("---------------------------");
		System.out.println("Hello"+s);
	
	}

}

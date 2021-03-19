package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\HP\\eclipse-workspace\\Maven\\Excel\\Employee Data_Sample_02.03.2021.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook w=new XSSFWorkbook(fis);
Sheet sheet = w.getSheet("Sheet1");
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
System.out.println(cell);


//Adding new line
//sample
}}

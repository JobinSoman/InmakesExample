package org.good1;

import java.io.IOException;

public class Challenge1 extends BaseClass
{
	public static void main(String[] args) throws IOException 
	{
		createNewExcel(0, 0, "Inmakeq", "Challenge1", "fetch");
		createCell(0, 1, "infotech","Challenge1", "fetch");
		createRow(1, 0, "Selenium","Challenge1", "fetch");
		createCell(1, 1, "Java","Challenge1", "fetch");
		createRow(2, 0, "Maven","Challenge1", "fetch");
		createCell(2, 1, "POM","Challenge1", "fetch");
		createRow(3, 0, "JUnit","Challenge1", "fetch");
		createCell(3, 1, "Cucumber","Challenge1", "fetch");
		FetchSpecificCellData(1,1,"Challenge1", "fetch");
		FetchSpecificCellData(3, 0, "Challenge1", "fetch");
	}
}

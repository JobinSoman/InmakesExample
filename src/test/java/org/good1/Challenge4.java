package org.good1;

import java.io.IOException;

public class Challenge4 extends BaseClass
{
	public static void main(String[] args) throws IOException 
	{
		createNewExcel(0, 1, "Selenium", "Challenge4", "data");
		createCell(0, 2, "DataDriven","Challenge4", "data");
		createRow(1, 1, "Java", "Challenge4", "data");
		createCell(1, 2, "Cucumber","Challenge4", "data");
		createRow(2,1,"Take screen shot","Challenge4", "data");
		createCell(2, 2, "Junit", "Challenge4", "data");
		createRow(3,1,"Frames","Challenge4", "data");
		createCell(3, 2, "TestNG", "Challenge4", "data");
	}
}

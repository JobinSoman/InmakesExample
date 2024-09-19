package org.good1;

import java.io.IOException;

public class Challenge2 extends BaseClass
{
	public static void main(String[] args) throws IOException 
	{
		createNewExcel(0, 0, "Selenium", "Challenge2", "data");
		createCell(0, 1, "Framework","Challenge2", "data");
		createRow(1, 0, "Testing", "Challenge2", "data");
		createCell(1, 1, "Manual","Challenge2", "data");
		createRow(2,0,"SQL","Challenge2", "data");
		createCell(2, 1, "Jira", "Challenge2", "data");
		createRow(3,0,"Git","Challenge2", "data");
		FetchSpecificColumnData(1, "Challenge2", "data");
	}
}

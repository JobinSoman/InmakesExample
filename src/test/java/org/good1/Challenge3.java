package org.good1;

import java.io.IOException;

public class Challenge3 extends BaseClass
{
	public static void main(String[] args) throws IOException 
	{
		createNewExcel(0, 0, "Selenium", "Challenge3", "data");
		createCell(0, 1, "Framework","Challenge3", "data");
		createRow(1, 0, "Testing", "Challenge3", "data");
		createCell(1, 1, "Manual","Challenge3", "data");
		createRow(2,0,"SQL","Challenge3", "data");
		createCell(2, 1, "Jira", "Challenge3", "data");
		createRow(3,0,"Git","Challenge3", "data");
		FetchAllData("Challenge3", "data");
	}
}

package com.datadriventest;

import com.excelutility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader=new Xls_Reader("D:\\TestNG\\datadriven\\src\\com\\testdata\\mysheet.xlsx");
		String login=reader.getCellData("logindata", "username", 2);
		System.out.println(login);

	}

}

package com.clc.login;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name="testData")
	public static Object [][] testData(){
		Object [][] testData = new Object[5][3];
		testData[0][0] = "a1";
		testData[0][1] = "a2";
		testData[0][2] = "a3";
		
		testData[1][0] = "b3";
		testData[1][1] = "b2";
		testData[1][2] = "b3";
		
		testData[2][0] = "c1";
		testData[2][1] = "c2";
		testData[2][2] = "c3";
		
		testData[3][0] = "d1";
		testData[3][1] = "d2";
		testData[3][2] = "d3";
		
		testData[4][0] = "e1";
		testData[4][1] = "e2";
		testData[4][2] = "e3";
		return testData;
				
	}
	
}

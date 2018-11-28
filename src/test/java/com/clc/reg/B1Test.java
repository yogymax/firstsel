package com.clc.reg;

import org.testng.annotations.Test;

import com.clc.login.A2Test;
import com.clc.login.Data;

public class B1Test {

	@Test(dataProvider="testData",dataProviderClass=Data.class)
	public void b1(String a, String b, String c){
		System.out.println("a2--1");
		System.out.println(a + " :   " + b +"  :  " +c );
	}
	
}

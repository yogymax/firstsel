package com.clc.login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A1Test {

	@Test(groups={"a1","smoke"})
	public void m1(){
		System.out.println("1");
	}
	
	@Test(groups={"a1"})
	public void mbcfr(){
		System.out.println("2");
	}
	
	@Test()
	@Parameters("env")
	public void asjdoo(String env){
		System.out.println("*******************");
		/*System.out.println("3 -- " +env);
		if(env.equals("qa"))
				sendkeys(admin,admin123)
		else(env.equqal("UAT"))
				sendkeys(uatadmin,admin123)
	*/		System.out.println("*******************");
	}
	
	@Test(groups={"a1","smoke"})
	public void amjkfpor(){
		System.out.println("4");
	}
	
	
	
}

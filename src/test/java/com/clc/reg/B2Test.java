package com.clc.reg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class B2Test {

	@Test(groups={"a1","smoke"})
	public void ab1(){
		System.out.println("inside ab1");
	}
	
	@Test(groups={"a1","b1","smoke"})
	public void asasdaf(){
		System.out.println("inside ab2");
	}
	
	
	@Test
	public void aaaab1(){
		System.out.println("inside ab3");
	}
	
	@Test
	public void xsfsab1(){
		System.out.println("inside ab4");
	}
	
	@Test
	public void sfgfgsab1(){
		System.out.println("inside ab5");
	}
	
	@Test
	public void afsddb1(){
		System.out.println("inside ab6");
	}
	
	@Test
	public void qwesaab1(){
		System.out.println("inside ab7");
	}
	
	
	@BeforeSuite
	public void xyz(){
		System.out.println("logic to be executed before suite start");
	}
	
	
}

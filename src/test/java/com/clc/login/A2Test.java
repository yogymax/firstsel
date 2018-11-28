package com.clc.login;

import org.testng.annotations.Test;

public class A2Test {


	
	@Test(priority=1)
	public void a1(){
		System.out.println("a2--1");
	}
	
	@Test
	public void a2(){
		System.out.println("inside a2");
	}

		
	
}


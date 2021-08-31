package com.bridgelabz.generics;


public class Test {

	public static void main(String[] args) {
		//testcase 1
		String xStr="pear",yStr="apple",zStr="orange";
		new MaximumTest(xStr,yStr,zStr).maximum();
		
		//Testcase 2
		String aStr="pear",bStr="apple",cStr="orange";
		new MaximumTest(bStr,cStr,aStr).maximum();
		
		//Testcase 3
		String pStr="pear",qStr="apple",rStr="orange";
		new MaximumTest(rStr,pStr,qStr).maximum();
	}
}
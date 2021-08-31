package com.bridgelabz.generics;


public class Test {

	public static void main(String[] args) {
		//testcase 1
		float xfloat=100.00f,yfloat=50.8f,zfloat=25.0f;
		new MaximumTest(xfloat,yfloat,zfloat).maximum();
		
		//Testcase 2
		float afloat=5.0f,bfloat=50.44f,cfloat=7.9f;
		new MaximumTest(afloat,bfloat,cfloat).maximum();
		
		//Testcase 3
		float lfloat=80.9f,mfloat=50.5f,nfloat=100.7f;
		new MaximumTest(lfloat,mfloat,nfloat).maximum();
	}

}

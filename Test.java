package com.bridgelabz.generics;

public class Test {

	public static void main(String[] args) {
		// testcase 1
		int xInt = 100, yInt = 50, zInt = 25;
		new MaximumTest(xInt, yInt, zInt).maximum();

		// Testcase 2
		int aInt = 5, bInt = 50, cInt = 7;
		new MaximumTest(aInt, bInt, cInt).maximum();

		// Testcase 3
		int lInt = 80, mInt = 50, nInt = 100;
		new MaximumTest(lInt, mInt, nInt).maximum();
	}

}

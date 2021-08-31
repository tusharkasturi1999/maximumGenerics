package com.bridgelabz.generics;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter the Number of parameters either 3 or 4");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 3) // when you want 3 parameters
		{
			String xStr = "melon", yStr = "apple", zStr = "grape";
			new MaximumTest(xStr, yStr, zStr).maximum(xStr, yStr, zStr);
			float xfloat = 100.6f, yfloat = 50.6f, zfloat = 70.9f;
			new MaximumTest(xfloat, yfloat, zfloat).maximum(xfloat, yfloat, zfloat);
			int xInt = 600, yInt = 50, zInt = 800;
			new MaximumTest(xInt, yInt, zInt).maximum(xInt, yInt, zInt);
		} else // when you want 4 parameters
		{
			String xStr = "melon", yStr = "apple", zStr = "grape", wstr = "pineapple";
			new MaximumTest(xStr, yStr, zStr, wstr).maximum(xStr, yStr, zStr, wstr);
			float xfloat = 100.6f, yfloat = 50.6f, zfloat = 670.9f, wfloat = 90.08f;
			new MaximumTest(xfloat, yfloat, zfloat, wfloat).maximum(xfloat, yfloat, zfloat, wfloat);
			int xInt = 900, yInt = 50, zInt = 700, wint = 677;
			new MaximumTest(xInt, yInt, zInt, wint).maximum(xInt, yInt, zInt, wint);
		}

	}

}
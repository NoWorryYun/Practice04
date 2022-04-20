package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i = 0 ; i < intA.length ; i++) {
			System.out.println(intA[i]);	// 주소가 같기 때문에 같이 변경됨
		}
	}
}

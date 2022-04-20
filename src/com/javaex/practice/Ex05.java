package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		double[] dArray = new double[5];
		
		double num0 = sc.nextDouble();
		dArray[0] = num0;
		double num1 = sc.nextDouble();
		dArray[1] = num1;
		double num2 = sc.nextDouble();
		dArray[2] = num2;
		double num3 = sc.nextDouble();
		dArray[3] = num3;
		double num4 = sc.nextDouble();
		dArray[4] = num4;
		
		for(int i = 0 ; i < dArray.length ; i++) {
			sum = dArray[i] + sum;
		}
		System.out.println("평균은" + (sum / dArray.length) + " 입니다.");

		
		
		
		
		
		
		sc.close();
		
	}

}

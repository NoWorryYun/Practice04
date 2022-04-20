package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액: ");
		int money = sc.nextInt();

		
	
		sc.close();

	}

}




/*
int fifty_thousand = 0;
int ten_thousand = 0;
int five_thousand = 0;
int thousand = 0;
int five_hundred = 0;
int hundred = 0;
int fifty = 0;
int ten = 0;
int five = 0;
int one = 0;

for(int i = 0 ; i < wonArray.length ; i++) {
	if(money >= 50000) {
		money = money - wonArray[i];
		fifty_thousand++;
	}
	if(money >= 10000) {
		money = money - wonArray[i];
		ten_thousand++;
	}
	if(money >= 5000) {
		money = money - wonArray[i];
		five_thousand++;
	}
	if(money >= 1000) {
		money = money - wonArray[i];
		thousand++;
	}
	if(money >= 500) {
		money = money - wonArray[i];
		five_hundred++;
	}
	if(money >= 100) {
		money = money - wonArray[i];
		hundred++;
	}
	if(money >= 50) {
		money = money - wonArray[i];
		fifty++;
	}
	if(money >= 10) {
		money = money - wonArray[i];
		ten++;
	}
	if(money >= 5) {
		money = money - wonArray[i];
		five++;
	}
	if(money >= 1) {
		money = money - wonArray[i];
		one++;
	}
	System.out.println("50000원: " + fifty_thousand);
	System.out.println("10000원: " + ten_thousand);
	System.out.println("5000원: " + five_thousand);
	System.out.println("1000원: " + thousand);
	System.out.println("500원: " + five_hundred);
	System.out.println("100원: " + hundred);
	System.out.println("50원: " + fifty);
	System.out.println("10원: " + ten);
	System.out.println("5원: " + five);
	System.out.println("1원: " + one);
}


*/
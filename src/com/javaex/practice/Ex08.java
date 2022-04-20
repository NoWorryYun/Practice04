package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lottoA = new int[6];

		lottoA[0] = (int) (Math.random() * 45) + 1;
		lottoA[1] = (int) (Math.random() * 45) + 1;
		lottoA[2] = (int) (Math.random() * 45) + 1;
		lottoA[3] = (int) (Math.random() * 45) + 1;
		lottoA[4] = (int) (Math.random() * 45) + 1;
		lottoA[5] = (int) (Math.random() * 45) + 1;

		int[] lottoB = new int[6];

		lottoB[0] = (int) (Math.random() * 45) + 1;
		lottoB[1] = (int) (Math.random() * 45) + 1;
		lottoB[2] = (int) (Math.random() * 45) + 1;
		lottoB[3] = (int) (Math.random() * 45) + 1;
		lottoB[4] = (int) (Math.random() * 45) + 1;
		lottoB[5] = (int) (Math.random() * 45) + 1;
		
		while(true) {
			
			for(int i = 0 ; i < lottoA.length ; i++) {
				if(lottoA[i] == lottoB[i]) {
					if(lottoA[i] == lottoB[i+1]) {
						lottoA[i] = (int) (Math.random() * 45) + 1;
					}
				}
			}
			System.out.println(lottoA[i] + "\t");
		}
	}
}
		
		
		
		
		
/*
int[] lottoC = new int[6];

lottoC[0] = (int) (Math.random() * 45) + 1;
lottoC[1] = (int) (Math.random() * 45) + 1;
lottoC[2] = (int) (Math.random() * 45) + 1;
lottoC[3] = (int) (Math.random() * 45) + 1;
lottoC[4] = (int) (Math.random() * 45) + 1;
lottoC[5] = (int) (Math.random() * 45) + 1;
*/

//?????????????????????????????????????????????????????????????????????? ㅜㅜ어렵당...
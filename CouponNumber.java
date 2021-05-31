package com.bridgelabz;
import java.util.*;

public class CouponNumber {
	public static void main(String[] args) 
	{
		int[] cuponNumber = {2, 4, 6, 8};
		int[] randomList = new int[cuponNumber.length];
		int totalRandoms = 0;
		int checkCount = 0;
		while(checkCount < cuponNumber.length) {
			System.out.println(checkCount);
			totalRandoms++;
			int randomNum = (int) (Math.random() * (9)) + 1;
			System.out.println("Random Value : " + randomNum);
			if(checkValue(randomNum, cuponNumber) && !checkValue(randomNum, randomList)) {
				randomList[checkCount] = randomNum;
				checkCount = checkCount + 1;
			}
		}
		System.out.println("Total Randoms " + totalRandoms);
	}
	public static boolean checkValue(int randomNum, int[] arrayobj) {
		for(int i = 0; i<arrayobj.length; i++) {
			if(arrayobj[i] == randomNum) {
				return true;
			}
		}
		return false;
	}

}

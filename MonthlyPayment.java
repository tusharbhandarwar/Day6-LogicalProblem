package com.bridgelabz;
import java.util.*;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P, Y, R;
		System.out.println("Enter the Year");
		Y = sc.nextInt();
		System.out.println("Enter P");
		P = sc.nextInt();
		System.out.println("Enter Rate");
		R = sc.nextInt();
		int n = 12 * Y;
		int r = R / (12 * 100);
		int payment = P * r / 1 - (1 + r) ^ (-n) ;
		System.out.println("Monthly Payment is" + payment);
	}
}

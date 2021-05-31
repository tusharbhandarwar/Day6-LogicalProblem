package com.bridgelabz;
import	java.util.*;	
class PerfectNumber	
{	
	 public	static void	main(String[] args)		
	 {	
	 	 Scanner sc = new Scanner(System.in);	
	 	 System.out.println("enter a number");	
	 	 int num = sc.nextInt();	
	 	 int sum = 1;
	 	 //finding the proper divisors for number
	 	 for(int i = 2; i <= num/2; i++)	
	 	 {	
	 	 	 if	(num % i == 0)	
	 	 	 sum = sum + i;	
	 	 }
	 	 //checking the number is perfect number or not
	 	 if	(sum == num)	
	 	 {	
	 	 	 System.out.println(num+ " is a Perfect number");	
	 	 }	
	 	 else {
	 	 System.out.println(num+ " is not a Perfect number");
	 	 }
	 }	
}
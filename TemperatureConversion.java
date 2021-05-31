package com.bridgelabz;
import java.util.*;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celcius");
		int Celcius = sc.nextInt();
		//Converting Celsius to Fahrenheit
		int Fahrenheit =  (Celcius * 9/5) + 32 ;
		System.out.println("After Converting: " + Fahrenheit);
		
		System.out.println("Enter the Farhenheit");
		Fahrenheit = sc.nextInt();
		Celcius =  (Fahrenheit - 32) * 5/9;
		System.out.println("After Conveting: " + Celcius);
		
	}

}

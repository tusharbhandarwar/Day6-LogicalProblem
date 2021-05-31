package com.bridgelabz;

public class FewestNotes {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount = sc.nextInt();
		int notes[] = new int[] {2000, 500, 200, 100, 50, 20, 10, 2, 1};
		int noteCounter[] = new int[notes.length];
		//count notes using greedy approach
		for(int i = 0; i < notes.length; i++) {
			if(amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}
		// Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
	}

}

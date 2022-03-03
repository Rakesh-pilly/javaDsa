package funtions;

import java.util.Scanner;

public class Tables {
	
	
	public static void makeTable(int n) {
		
		System.out.println("Print table for the - " + n);

		
		for(int i = 1; i<= 10 ; i++) {
			
			System.out.println(i+ " x " + n + " = " + i*n);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		makeTable(n);
	

	}

}

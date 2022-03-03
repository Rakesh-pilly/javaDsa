package funtions;

import java.util.Scanner;

public class Fun1 {

	
	public static int muti(int a , int b) { 
		
		
		return a*b;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println(		muti(a, b));

		

	}

}

package funtions;

import java.util.Scanner;

public class fun2 {
	
	public static int factorial(int a) {
		
		int res = 1;
		
		
		for(int i = 1; i<= a; i++) {
			
			res = res *i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(		factorial(a)
);
		
		
	}

}

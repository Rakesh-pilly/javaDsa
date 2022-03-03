package funtions;

import java.util.Scanner;

public class Prime {
	
	public static Boolean prime(int a) {
		
		if(a <= 1) {
			return false;
		}
		
		if(a == 2 || a == 3) {
			return true;
		}
		
		for(int i = 2 ;i<a ; i++) {
			
			if(a%2 == 0) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(prime(a)) {
			System.out.println("yes this is prime");
		}else {
			System.out.println("no This is not a prime");
		}
		

	}

}

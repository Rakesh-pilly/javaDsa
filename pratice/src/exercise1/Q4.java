package exercise1;

import java.util.Scanner;

public class Q4 {
	
	public static void circCire(int r) {
		
		System.out.println(2*(22/7)*r);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		circCire(r);
		

	}

}

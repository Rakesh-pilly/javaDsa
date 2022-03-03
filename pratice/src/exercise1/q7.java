package exercise1;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean entre = true;
		int postCount = 0;
		int negCount = 0; 
		int zeroCount = 0;
		
		while(entre) {
			
			
			String check = sc.next();
			System.out.println(check);
			
			if(check.equals("stop")) {
				entre = false;
			}
			
			
			int n = Integer.parseInt(check);
			
			if(n == 0) {
				zeroCount++;
			}else if(n > 0) {
				postCount++;
			}else {
				negCount++;
			}
			System.out.println("postive coount - " + postCount+ " negative count - " + negCount + " zero cournt - " + zeroCount);

			
		
		}
		

	}

}

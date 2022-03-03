package String;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String res = "";
		
		for(int i = 0; i<input.length(); i++) {
			
			
			
			if(input.charAt(i) == 'e') {
				
				res = res + 'i';
			}else {
				res = res + input.charAt(i);
			}
			
			
		}
		
		
		System.out.println(res);
		
		

	}

}

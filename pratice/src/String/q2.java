package String;

import java.util.Scanner;

public class q2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		
		String res = "";
		
		for(int i = 0 ; i<email.length(); i++) {
			
			if(email.charAt(i) == '@') {
				break;
			}
			
			res = res + email.charAt(i);
		}
		
		System.out.println(res);
	}

}

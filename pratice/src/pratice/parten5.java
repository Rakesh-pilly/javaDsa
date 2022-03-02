package pratice;

public class parten5 {

	public static void main(String[] args) {
		
		int n = 5;
		
		
		for(int i = 0; i<n ; i++) {
			
			
			System.out.print("*");
			
			if(i == 0) {
				for(int j = 0 ; j<(n+n)-2 ; j++) {
					System.out.print(" ");

				}
				
			}else {
				
				for(int j = 0 ; j<i-1; j++) {
					System.out.print(" ");

				}
				
				System.out.print("*");
				
				
				for(int j = 0 ; j<(n+n)-(i+1)*2 ; j++) {
					System.out.print(" ");

				}
				
				
				
				
				System.out.print("*");
				
				for(int j = 0 ; j<i-1; j++) {
					System.out.print(" ");

				}
			}
			
			
			
			
			
			System.out.print("*");
			
			System.out.println();

		}
		
for(int i = n-1; i>=0 ; i--) {
			
			
			System.out.print("*");
			
			if(i == 0) {
				for(int j = 0 ; j<(n+n)-2 ; j++) {
					System.out.print(" ");

				}
				
			}else {
				
				for(int j = 0 ; j<i-1; j++) {
					System.out.print(" ");

				}
				
				System.out.print("*");
				
				
				for(int j = 0 ; j<(n+n)-(i+1)*2 ; j++) {
					System.out.print(" ");

				}
				
				
				
				
				System.out.print("*");
				
				for(int j = 0 ; j<i-1; j++) {
					System.out.print(" ");

				}
			}
			
			
			
			
			
			System.out.print("*");
			
			System.out.println();

		}
	
	}
}

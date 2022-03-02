package pratice;

public class partten2 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int j = 0 ; j<n; j++) {
			
			for(int i = n-1; i>=j; i--) {
				System.out.print(" ");
			}
			
			for(int i = 0; i<n; i++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
		
		

	}

}

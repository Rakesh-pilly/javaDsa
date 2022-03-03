package exercise1;
import java.util.Scanner;

public class Q3 {
	
	
	public static void findGreater(int a , int b) {
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);

		}
		
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		findGreater(a, b);
	}

}

package pratice;

public class parten6 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				System.out.print(" ");

			}

			if (i == 0 || i == n - 1) {

				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
			}else {
				
				System.out.print("*");
				
				for (int j = 0; j < n-2; j++) {
					System.out.print(" ");
				}

				
				System.out.print("*");

				
			}
			System.out.println();

		}
	}

}

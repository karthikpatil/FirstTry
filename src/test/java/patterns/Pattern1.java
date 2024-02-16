package patterns;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 5;
		for (int i = n; i >= 1; i--) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" " + j);
			}
			System.out.println(" ");
		}

		for (int i = 2; i <= n; i++) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" " + j);
			}
			System.out.println(" ");
		}

	}

}

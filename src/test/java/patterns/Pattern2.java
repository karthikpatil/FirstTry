package patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 5;
		for(int i=n;i>=1;i--){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
		//Printing Lower Half for n-1 rows
		//Loop to iterate over each row
		for(int i=2;i<=n;i++){
			//Loop to iterate over each column of the ith row
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}

	}

}

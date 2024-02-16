package patterns;

import java.util.ArrayList;



public class SeleniumInterview {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		arr1.add(20);
		arr1.add(20);
		arr1.add(10);
		arr1.add(30);
		arr1.add(50);
		
		arr2.add(60);
		arr2.add(60);
		arr2.add(10);
		arr2.add(30);
		arr2.add(70);
		
		
		for(int i=0;i<arr1.size();i++) {
			
			for(int j=0;j< arr2.size();j++) {
				
				if( arr1.get(i) == arr2.get(j)) {
					System.out.println("Common elements are:"+arr2.get(j));
				}
			}
		}
		
	}

}

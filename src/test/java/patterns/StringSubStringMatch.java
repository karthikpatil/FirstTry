package patterns;

public class StringSubStringMatch {

	public static void main(String[] args) {
		
		String myname="My name is karthik";
		int count=0;
		char mymcahr[]=myname.toLowerCase().toCharArray();
		
		for(int i=0;i<mymcahr.length;i++) {
			
			for(int j=i+0;j<mymcahr.length;j++) {
				if(mymcahr[i]==mymcahr[j]) {
					count++;
				}
			}
		}

		System.out.println("Count of repeetative char:"+count);
	}

}

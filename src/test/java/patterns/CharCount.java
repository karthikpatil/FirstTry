package patterns;

public class CharCount {

	public static void main(String[] args) {
		
		 String mychar="abcdsf dff dsgvsasedsv";
	        char charcount[]=mychar.toCharArray() ;
	        char duplicatechar[]=new char[charcount.length];
	        		int count=0;
	        		for(int i=0;i<charcount.length;i++){
	             for(int j=0;j<i;j++) {
	            	 if(charcount[i]==charcount[j]) {
	            		 System.out.println(charcount[i]+":character:"+charcount[j]);
	            		 duplicatechar[count]=charcount[i];
	            		 count++;
	            	 }
	             }
	        }

		
	        for(int k=0;k<duplicatechar.length;k++) {
	        	System.out.println(duplicatechar[k]);
	        }
	        
	}

}

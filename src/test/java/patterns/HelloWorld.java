package patterns;

class HelloWorld {
    
	public static void main(String[] args) {
        String colors="white, black, blue, yellow, white, black, purple, white, yellow, green";
        
        String color[]= colors.split(",");
        String[] duplicates=new String[color.length];
        int count=0;
       // System.out.println("color"+color.length);
        for(int i=0;i< color.length;i++){
           // System.out.println("1st for lop");
            for(int j=0;j<i;j++){
                 //System.out.println("2nd for lop");
                 
                if(color[i].equals(color[j]) ){
                	
                    System.out.println(" Equal"+color[j]+":"+color[i]);
                   
                    duplicates[count]=color[j];
                    count++;
                } 
                
            }
            
        }
        
        
        for(int k=0; k<color.length;k++){
            System.out.println("Duplicate color are :"+duplicates[k]);
        }
    
    }
}

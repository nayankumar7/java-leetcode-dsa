import java.util.*;
class Solution {
    public static int romanToInt(String s) {
        
        
        if(s.compareTo("I")==0){
             
            return 1 ;
           
        }
        else if(s.compareTo("V" )==0){
            return 5 ;
        }else if (s.compareTo("X")==0){
            return 10 ;
        }else if (s.compareTo("L")==0){
            return 50 ;
        }else if (s.compareTo("C")==0){
            return 100;
        }else if (s.compareTo("D")==0){
            return 500;
        }else if (s.compareTo("M")==0){
           return 1000; 
        }
    
        
        return 0;
    }
  	public static void main(String[] args) {
  	    Scanner sc = new Scanner(System.in);
  	    String j = sc.next();
  	    int sum = 0 ;
  	    int arr [] = new int [j.length()];
          
  	     for (int i = 0 ; i < j.length(); i++){
           
       char c = j.charAt(i) ; 
       String s = Character.toString(c); 
       
             
   
           arr [i] = romanToInt(s) ;
           
              sum += arr [i];
  	   	
  	     }
  	     for (int k =0 ; k < j.length()-1; k++){
  	         if (arr[k]<arr[k+1]){
  	             sum -= 2*arr[k];
  	         }
}	System.out.println(sum);
  	     
  	}
}